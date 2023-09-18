final int SCREENX = 320;
final int SCREENY = 240;

Circle myCircles[];
void settings() {
  size(SCREENX, SCREENY);
}
void setup() {
  myCircles = new Circle[10];
  noStroke();
  init_array(myCircles);
}
void draw() {
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
    theArray[i].move(mouseX, mouseY);
}
