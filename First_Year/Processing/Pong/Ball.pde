class Ball {
  float x;
  float y;
  float dx;
  float dy;
  int radius;
  int lives;
  int wins;
  int enemySpeed;
  String s;
  color ballColor = color(255, 0, 0);
  Ball() {
    x = random(SCREENX/4, SCREENX/2);
    y = random(SCREENY/4, SCREENY/2);
    dx = random(1, 2);
    dy = random(1, 2);
    radius=5;
    lives = 3;
    wins = 0;
    L = "3";
    enemySpeed = 2;
    s = Integer.toString(enemySpeed);
  }
  void move() {
    x = x+dx;
    y = y+dy;
  }
  void draw() {
    fill(ballColor);
    ellipse(int(x), int(y), radius,
      radius);
    if (mousePressed) {
      dx = random(1, 2);
      dy = random(1, 2);
    }
  }
  void collide(Player tp) {
    if (x-radius <=0) dx=-dx;
    else if (x+radius>=SCREENX) dx=-dx;
    if (y+radius >= tp.ypos &&
      y-radius<tp.ypos+PADDLEHEIGHT &&
      x >=tp.xpos && x <=
      tp.xpos+PADDLEWIDTH) {
      println("collided!");
      enemySpeed++;
      if (dy > 0) dy++;
      else dy--;
      
      if (dx > 0) dx++;
      else dx--;
      
      dy=-dy;
      dx = dx + tp.playerSpeed;
    }
  }

  void collision(ComPlayer tp) {
    if (y+radius >= tp.ypos &&
      y-radius<tp.ypos+PADDLEHEIGHT &&
      x >=tp.xpos && x <=
      tp.xpos+PADDLEWIDTH) {
      println("collided!");
      dy=-dy;
    }
  }

  void gameStatus() {

    if (y >= SCREENY || y < 0) {
      if (y < 0) wins++;
      else lives--;
      x = random(SCREENX/4, SCREENX/2);
      y = random(SCREENY/4, SCREENY/2);
      dy = 0;
      dx = 0;
      enemySpeed = 2;
    }

    PFont myFont = loadFont("ArialNarrow-Bold-25.vlw");
    textFont(myFont);
    text("Lives: ", 20, 20);
    text(L, 85, 20);
    
    text("Speed: ", 225, 20);
    text(s, 300, 20);

    if (wins >= 3) {
      PFont endFont = loadFont("CalifornianFB-Reg-50.vlw");
      textFont(endFont);
      text("YOU WON!", 45, 100);
      x = -radius;
      dy = 0;
      dx = 0;
    }

    s = Integer.toString(enemySpeed);
    
    if (lives == 3) L = "3";
    else if (lives == 2) L = "2";
    else if (lives == 1) L = "1";
    else {
      L = "0";

      PFont endFont = loadFont("CalifornianFB-Reg-50.vlw");
      textFont(endFont);
      text("YOU DIED", 45, 100);
      x = -radius;
      dy = 0;
      dx = 0;
    }
  }
}
