Player thePlayer;
Ball theBall;
ComPlayer theComPlayer;
String L;
void settings() {
  size(SCREENX, SCREENY);
}
void setup() {
  thePlayer = new Player(SCREENY-MARGIN-PADDLEHEIGHT);
  theComPlayer = new ComPlayer(MARGIN+PADDLEHEIGHT);
  theBall = new Ball();
  ellipseMode(RADIUS);
}
void draw() {
  background(0);
  thePlayer.move(mouseX);
  theComPlayer.move(theBall);
  theBall.move();
  theBall.collide(thePlayer);
  theBall.collision(theComPlayer);
  theBall.gameStatus();
  thePlayer.draw();
  theComPlayer.draw();
  theBall.draw();
  
}
