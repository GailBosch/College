class Bomb {
  int x, y;
  PImage boom;
  
  Bomb (int xpos) {
    x=xpos;
    y=0;
    boom = loadImage("output-onlinepngtools (3).png");
  }
  
  void draw() {
    image(boom, x, y, 75, 75);
  }
  void move() {
    y++;
    
  }
  boolean offScreen() {
    if (y >= SCREENY+75) return true;
    else return false;
  }
  boolean collide(Player tp) {
    if (y >= (tp.ypos-75) && y <= (tp.ypos+PADDLEHEIGHT) && x <= (tp.xpos+15) && x >= (tp.xpos-50)) return true;
    else return false;
  }
}
