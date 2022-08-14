package _02_boolean._5_googly_eyes;

import processing.core.PApplet;
import processing.core.PImage;

/*
 * Goal: Put googly eyes on a face!
 * 
 * Instructions:
 * 1. Find an image on the Internet and drop it into the /images folder at the
 *    top level of this module. It can be anything as long as it has large eyes!
 * 
 * 2. Declare a variable for the image:
 *    PImage face;
 * 
 * 3. In your setup() method, import your image using the following code:
 *    face = loadImage("face.jpg");
 * 
 * 4. Resize your face image to the size of the window using the resize() method.
 * 
 * 5. In the draw() method, place a white ellipse over the left eye of your image.
      HINT: To find out where to put it, add code to print the mouseX and
      mouseY where you click the mouse.
 *
 * 6. Now add a pupil (the black part) to the left eye.
 * 
 * 7. Use mouseX and mouseY to move the left pupil where the mouse moves.
 * 
 * 8. Repeat the same steps for the right eye.
 * 
 * 9. Add a right pupil and make it move by using
 *    mouseX + [distance from left eye] and mouseY + [distance from left eye].
 * 
 * 10.Here’s the tricky part: stop the pupils from going outside of the white
 *    circles! To do this, imagine a rectangle that the pupil should stay
 *    within. When mouseX and mouseY goes outside of these bounds, set it back
 *    to the boundary. Put this code before you draw the pupils.
 */
public class GooglyEyes extends PApplet {
<<<<<<< HEAD
    static final int WIDTH = 480;
    static final int HEIGHT = 480;
    int x = 1;
    int y = 1;
=======
    static final int WIDTH = 900;
    static final int HEIGHT = 900;
    
>>>>>>> branch 'master' of https://github.com/League-Level0-Student/level-0-module-4-HenryMKim.git
    PImage face;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }
    
    @Override
    public void setup() {
<<<<<<< HEAD
    	 face = loadImage("golden-retriever-dog-breed-info.jpg");
    	 
=======
face = loadImage("Kirbys-Dream-Buffet-MainArt-900x900.jpg");
face.resize(WIDTH, HEIGHT);
background(face);
>>>>>>> branch 'master' of https://github.com/League-Level0-Student/level-0-module-4-HenryMKim.git
    }

    @Override
    public void draw() {
<<<<<<< HEAD
    	
    	y = mouseY;
    	x = mouseX;
    	background(face);
fill(255,255,255);
ellipse(215,89,50,50);
ellipse(295,89,50,50);
if(x < 196){
	x = 196;
}
if(x > 235) {
	x = 235;
}
if(y > 107) {
	y = 107;
}
if(y < 70) {
	y = 70;
}

fill(0,0,0);
ellipse(x,y,10,10);
ellipse(x + 80,y + 0,10,10);
=======
    	fill(255, 255,255);
    	ellipse(550, 270, 100, 100);
    	ellipse(450, 245, 100, 100);
    	fill(0,0,0);
    	ellipse(450, 245, 10, 10);
    	ellipse(550, 270, 10, 10);
>>>>>>> branch 'master' of https://github.com/League-Level0-Student/level-0-module-4-HenryMKim.git
    }

    static public void main(String[] args) {
        PApplet.main(GooglyEyes.class.getName());
    }
}