Alien myAliens[];
Player thePlayer;
Bullet theBullet;
Bomb myBombs[];

boolean isBullet = false;
boolean gameOver = false;

void settings() {
  size(SCREENX, SCREENY);
}
void setup() {
  thePlayer = new Player(SCREENY-MARGIN-PADDLEHEIGHT);
  myAliens = new Alien[10];
  myBombs = new Bomb[1];
  init_array(myAliens);
  init_array(myBombs);
  ellipseMode(RADIUS);
}
void draw() {
  if (mousePressed) {
    theBullet = new Bullet(thePlayer);
    isBullet = true;
  }
  background(0);
  thePlayer.move(mouseX);
  move_array(myAliens);
  move_array(myBombs);
  thePlayer.draw();
  draw_array(myAliens);
  draw_array(myBombs);
//  getBombs(myAliens);
  offScreen_array(myBombs);
  if (collide_array(myBombs))
  {
    gameOver = true;
  }
  PFont endFont = loadFont("CalifornianFB-Reg-50.vlw");
  if (gameOver) {
        fill(255, 0, 0);
    textFont(endFont);
    text("GAME OVER", 60, 100);
  }
  
  if (isBullet) {
    theBullet.draw();
    theBullet.move();
    collide_array(myAliens);
  }
}
void init_array(Alien theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i] = new Alien(int(random(0, SCREENX)), int(random(0,
      SCREENY)));
}
void init_array(Bomb theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i] = new Bomb(int(random(0, SCREENX)));
}
void draw_array(Alien theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i].draw();
}
void draw_array(Bomb theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i].draw();
}
void move_array(Alien theArray[]) {
  for (int i=0; i<theArray.length; i++) {
    theArray[i].move();
//    boolean aBomb = theArray[i].getBomb();
//    if (aBomb != null) {
//      if (aBomb.collide(thePlayer)){}
      // bad news for player
//    }
  }
}
void move_array(Bomb theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i].move();
}
void collide_array(Alien theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i].collision(theBullet);
}
void offScreen_array(Bomb theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i].offScreen();
}
boolean collide_array(Bomb theArray[]) {
  for (int i=0; i< theArray.length; i++) {
    if (theArray[i].collide(thePlayer)) return true;
    else return false;
  }
  return true;
}
//void getBomb(Alien theArray[]) {
//  for (int i=0; i<theArray.length; i++)
//    if (theArray[i].getBomb()){
//      theArray[i] = new Bomb(x);
//    }
//}
