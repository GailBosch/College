ArrayList screenList;

final int EVENT_BUTTON1=1;
final int EVENT_BUTTON2=2;
final int EVENT_BUTTON3=3;
final int EVENT_BUTTON4=4;
final int EVENT_NULL=0;
final int GAP=10;

int screenNo = 1;
boolean change = false;

void setup() {
  size(400, 500);
  Screen screen1, screen2;
  screen1 = new Screen(255, color(255, 0, 0), "Red", color(0, 0, 255), "Blue", color(220, 220, 0), "Yellow", "move forward");
  screen2 = new Screen(1, color(100, 0, 150), "Purple", color(200, 100, 0), "Orange", color(0, 255, 0), "Green", "move backwards");
  screenList = new ArrayList();
  screenList.add(screen1);
  screenList.add(screen2);
}
void draw() {
  if (screenNo == 1) {
      Screen aScreen = (Screen) screenList.get(0);
      aScreen.draw();
      if (aScreen.screenChange()) screenNo = 2;
  }
  else {
    Screen aScreen = (Screen) screenList.get(1);
    aScreen.draw();
    if (aScreen.screenChange()) screenNo = 1;
  }
}
void change() {
  if (screenNo == 1) {
    Screen aScreen = (Screen) screenList.get(0);
    if (aScreen.screenChange()) screenNo = 2;
  }
  else {
    Screen aScreen = (Screen) screenList.get(1);
    if (aScreen.screenChange()) screenNo = 1;
  }
}
void mousePressed() {
  if (screenNo == 1) {
      Screen aScreen = (Screen) screenList.get(0);
      aScreen.mousePressed();
    }
  else {
      Screen aScreen = (Screen) screenList.get(1);
      aScreen.mousePressed();
    }
}
void mouseMoved() {
  for (int i = 0; i<screenList.size(); i++) {
      Screen aScreen = (Screen) screenList.get(i);
      aScreen.mouseMoved();
    }
}
