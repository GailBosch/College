myAliens Alien[];
PImage myImage;

void settings() {
  size(SCREENX, SCREENY);
  myImage = loadImage("invader.GIF");
}

void setup() {
  myAliens[] = new Alien[10];
  init_array(myAliens);
}

void draw() {
  move_array(myAliens);
  draw_array(myAliens);

  myAliens.move(200, 200);
  image(myImage, theAlien.x, theAlien.y, 50, 50);
}

void init_array(Alien theArray[]) {
  for (int i=0; i<theArray.length; i++)
    theArray[i] = new Alien(int(random(0, SCREENX)), int(random(0,
      SCREENY)));
}

void move_array(Alien theArray[]) {
  for (int i=0; i < theArray.length; i++)
    theArray[i].move(400, 400);
}
