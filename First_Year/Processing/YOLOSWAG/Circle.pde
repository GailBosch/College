class Circle {
  int x, y;
  int direction;
  int downCounter;
  int esplo;
  PImage live;
  PImage exploded;
  PImage picture;
  color alienColor;
  Circle (int xpos, int ypos) {
    x=xpos;
    y=ypos;
    esplo = int(random(0, 300));
    direction = int(random(0, 4));
    downCounter = 0;
    live = loadImage("invaderz.png");
    exploded = loadImage("exploding.GIF");
    alienColor = color(int(random(0,255)),
    int(random(0,255)),int(random(0,255)));
    
  }
  void draw() {
    if (esplo < 500) picture = live;
    else {
      picture = exploded;
      direction = 4;
    }
    fill(alienColor);
    rect(x, y, picture.width, picture.height);
    image(picture, x, y);
  }
  void move() {
    switch (direction){
      case 4:
        break;
      case 3:
        y = Math.round(sin(x/10)*50 + 200);
        x++;
        break;
      case 2:
        y++;
        downCounter++;
        if (downCounter >= live.height) {
          if (x >= SCREENX- live.width) {
            direction = 1;
            downCounter = 0;
          }
          else {
          direction = 0;
          downCounter = 0;
          }
        }
        break;
      case 1:
        x--;
        if (x <= 0) {
          direction = 2;
        }
        break;
      default:
        if (x >= SCREENX-live.width) {
          direction = 2;
        }
        x++;
        break;
    }
  esplo++;  
    
  }
}
