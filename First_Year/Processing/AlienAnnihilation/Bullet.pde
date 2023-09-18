class Bullet {
  float x;
  float y;
  int radius;
  color ballColor = color(255, 0, 0);
  Bullet(Player tp) {
    x = (tp.xpos + 15);
    y = (SCREENY - PADDLEHEIGHT - MARGIN);
    radius = 5;
  }
  void draw() {
    fill(ballColor);
    ellipse(int(x), int(y), radius, radius);
  }
  void move() {
    y+= -5;
  }
}
