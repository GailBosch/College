Alien myAliens[];

void settings() {
  size(SCREENX, SCREENY);
}

void setup() {
  myAliens = new Alien[10];
  init_array(myAliens);
}
void draw() {
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
    theArray[i].move(mouseX, mouseY);
}











//int i;
//int j;
//int l;
//int position;
//boolean down;
//void setup()
//{
//  i = 1;
//  j = 1;
//  l = 50;
//  position = l;
//  down = false;
//}
//void draw() {
//  image(myImage, i, l, 50, 50);
  
//  if (down) 
//  {
//   l++;
//    if (l >= (position + myImage.height))
//    {
//      position += myImage.height;
//      down = false;
//    }
//  }
//  else {
//    if ((i >(400-50)) || i < 0) {
//      down = true;
//      j =-j;
//    }
//    i += j;
//  }
//}
