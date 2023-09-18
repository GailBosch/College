final int A_FORWARD = 0;
final int A_BACKWARD = 1;
final int A_DOWN = 2;

final int SCREENX = 400;
final int SCREENY = 400;

Circle myCircles[];
void settings() {
  size(SCREENX, SCREENY);
}
void setup() {
  myCircles = new Circle[10];
  init_array(myCircles);
}
void draw() {
  background(0);
  move_array(myCircles);
  draw_array(myCircles);
}
void init_array(Circle theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i] = new Circle(int(random(0, SCREENX)), int(random(0,
      SCREENY)));
}
void draw_array(Circle theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i].draw();
}
void move_array(Circle theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i].move();
}
