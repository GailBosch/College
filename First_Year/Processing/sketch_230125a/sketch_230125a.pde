int i;
int j;
int k;

int r;
int g;
int b;

void setup(){
size(200, 200);
noStroke();
i=0;
j=200;
k=5;
}

void draw(){
background(255);
k ++;

fill(255, 204, 0);
rect(i, 20, 50, 50);
rect((i-199), 20, 50, 50);

fill(0, 204, 0);
rect(20, i, 50, 50);
rect(20, (i-199), 50, 50);

fill(0, 204, 255);
rect(i, i, 50, 50);
rect((i-199), (i-199), 50, 50);

fill(255, 0, 0);
rect(j, 100, 50, 50);
rect((j+199), 100, 50, 50);

fill(r, g, b);
rect(i, ((sin(k/5)*50)+ 100), 50, 50);
rect((i-199), ((sin(k/5)*50)+ 100), 50, 50);

if(i++>=199) i=0;
if(j--<=-50) j=150;
r = (r + 1) % 360;
g = (g - 1) % 360;
b = (b + 2) % 360;
}
