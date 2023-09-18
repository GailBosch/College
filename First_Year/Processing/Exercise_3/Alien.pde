class Alien {
  int x, y;
  
  Alien (int xpos, int ypos) {
    x=xpos;
    y=ypos;
  }
  
  void move(int targetX, int targetY) {
    if (x < targetX) x++;
    else x--;
    if (y < targetY) y++;
    else y--;
  }
}
