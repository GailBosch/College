final int SCREENX = 400;
final int SCREENY = 400;

Alien myAliens[];
void settings() {
  size(SCREENX, SCREENY);
}
void setup() {
  myAliens = new Alien[10];
  init_array(myAliens);
}
void draw() {
  background(0);
  move_array(myAliens);
  draw_array(myAliens);
}
void init_array(Alien theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i] = new Alien(int(random(0, SCREENX)), int(random(0,
      SCREENY)));
}
void draw_array(Alien theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i].draw();
}
void move_array(Alien theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i].move();
}
