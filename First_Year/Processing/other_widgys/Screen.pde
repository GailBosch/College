class Screen {
  ArrayList widgetList;
  PFont stdFont;
  color bgcolor;
  boolean change;
  color btn1, btn2, btn3;

  Screen(int colorbg, color color1, String name1, color color2, String name2, color color3, String name3, String message) {
    change = false;
    bgcolor = colorbg;
    btn1 = color1;
    btn2 = color2;
    btn3 = color3;
    
    Widget widget1, widget2, widget3, widget4;
    stdFont=loadFont("Chiller-Regular-36.vlw");
    textFont(stdFont);
    widget1=new Widget(100, 100, 175, 40,
      name1, btn1, stdFont,
      EVENT_BUTTON1);
    widget2=new Widget(100, 200, 175, 40,
      name2, btn2, stdFont, EVENT_BUTTON2);
    widget3=new Widget(100, 300, 175, 40,
      name3, btn3, stdFont, EVENT_BUTTON3);
    widget4=new Widget(100, 400, 175, 40,
      message, color(0, 0, 255), stdFont, EVENT_BUTTON4);
    widgetList = new ArrayList();
    widgetList.add(widget1);
    widgetList.add(widget2);
    widgetList.add(widget3);
    widgetList.add(widget4);
  }

  void draw() {
    background(bgcolor);
    for (int i = 0; i<widgetList.size(); i++) {
      Widget aWidget = (Widget) widgetList.get(i);
      aWidget.draw();
    }
  }
  void mousePressed() {
    int event;
    for (int i = 0; i<widgetList.size(); i++) {
      Widget aWidget = (Widget) widgetList.get(i);
      event = aWidget.getEvent(mouseX, mouseY);
      switch(event) {
      case EVENT_BUTTON1:
        bgcolor = btn1;
        println("button 1!");
        break;
      case EVENT_BUTTON2:
        bgcolor = btn2;
        println("button 2!");
        break;
      case EVENT_BUTTON3:
        bgcolor = color(0, 0, 255);
        println("button 3!");
        break;
      case EVENT_BUTTON4:
        println("button 4!");
        change = true;
      }
    }
  }
  void mouseMoved() {
    int possy = 0;
    for (int i = 0; i<widgetList.size(); i++) {
      Widget aWidget = (Widget) widgetList.get(i);
      possy = aWidget.getEvent(mouseX, mouseY);
    }
  }
  boolean screenChange() {
    if (change) {
      change = false;
//      delay(10);
      return true;
    }
    else return false;
  }
}
