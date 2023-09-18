class Alien {
  int x, y;
  int direction;
  int downCounter;
  boolean esplo;
  PImage live;
  PImage exploded;
  PImage picture;
  color alienColor;
  boolean isAlive;
  
  Alien (int xpos, int ypos) {
    x=xpos;
    y=ypos;
    esplo = false;
    direction = int(random(0, 4));
    downCounter = 0;
    live = loadImage("invaderz.png");
    exploded = loadImage("exploding.GIF");
    alienColor = color(int(random(0,255)),
    int(random(0,255)),int(random(0,255)));
    isAlive = true;
    
  }
  
  void draw() {
    if (esplo){
      picture = exploded;
      direction = 4;
    }
    else picture = live;
    
    fill(alienColor);
    rect(x, y, picture.width, picture.height);
    image(picture, x, y);
  }
  void move() {
    switch (direction){
      case 5:
        y = Math.round(sin(x/10)*50 + 200);
        x--;
        if (x <= 0) direction = 3;
        break;
      case 4:
        isAlive = false;
        break;
      case 3:
        y = Math.round(sin(x/10)*50 + 200);
        x++;
        if (x >= SCREENX-live.width) direction = 5;
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
    
  }
  void collision(Bullet tp) {
    if (tp.x <= (x+picture.width) && tp.x >= x && tp.y <= (y+picture.height) && tp.y >= (y-picture.height))
    {
      esplo = true;
    }
  }
  boolean getBomb() {
    if (isAlive){
      int RNG = int(random(0, 50));
      if (RNG == 25) return true;
      else return false;
    }
    return false;
  }
}
