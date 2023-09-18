class ComPlayer {
  int xpos;
  int ypos;
  int enemySpeed;
  color paddlecolor = color(50);
  ComPlayer(int screen_y)
  {
    xpos= SCREENX/2;
    ypos=screen_y;
  }
  void move(Ball tp) {
    if (tp.x>SCREENX-PADDLEWIDTH) xpos = SCREENX-PADDLEWIDTH;
    else {
      if (xpos > tp.x) xpos= xpos - abs(tp.enemySpeed);
      else if (xpos < tp.x) xpos= xpos + 2;
    }
  }
  void draw()
  {
    fill(paddlecolor);
    rect(xpos, ypos, PADDLEWIDTH, PADDLEHEIGHT);
    
  }
}
