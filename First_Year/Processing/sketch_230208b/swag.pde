class Alien {
  int x, y;
  PImage myImage;
  void setup() {
    myImage = loadImage("invader.GIF");
  }
  Alien (int xpos, int ypos) {
    x=xpos;
    y=ypos;
  }
  void draw() {
    image(myImage, x, y, 50, 50);
  }
  void move(int targetX, int targetY) {
    if (x<targetX) x++;
    else x--;
    if (y<targetY) y++;
    else y--;
  }
}
