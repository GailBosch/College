Screen theScreen;
final int EVENT_BUTTON1=1;
final int EVENT_BUTTON2=2;
final int EVENT_BUTTON3=3;
final int EVENT_NULL=0;
final int GAP=10;

void setup() {
  size(400, 400);
  theScreen = new Screen();
}
void draw() {
  theScreen.draw();
}
void mousePressed() {
  theScreen.mousePressed();
}
void mouseMoved() {
  theScreen.mouseMoved();
}
