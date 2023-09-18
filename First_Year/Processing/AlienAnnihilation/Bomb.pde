class Bomb {
  int x, y;
  PImage boom;
  
  Bomb (int xpos) {
    x=500;
    y=500;
    boom = loadImage("output-onlinepngtools (3).png");
  }
  
  void draw() {
    image(boom, x, y, 75, 75);
  }
  void move() {
    y++;
    
  }
  void summon(boolean bombing, Alien tp) {
    if (bombing) {
      x = tp.x;
      y = tp.x;
    }
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
