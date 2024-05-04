package example;

import processing.core.PApplet;
import processing.core.PVector;

public class rotatingBlocks {
    int colorChangeInterval = 1500; // Change colors every 1.5 seconds
    float[] blockColors; // Stores the hue of each block
    float a = 0.0f; // Angle of rotation
    float offset = (float) (mv.PI / 24.0); // Angle offset between boxes
    int num = 12; // num of boxes
    PVector[] boxPositions; // Stores the position of each box

 public RotatingShape(MyVisual mv) {
    this.mv = mv; // Initialize the MyVisual reference
    blockColors = new float[num]; // Initializes array to store block colors
    boxPositions = new PVector[num]; // Initializes array to store box positions
    initializeBlockColors(); // Call method to initialize block colors
    initializeBoxPositions(); // Call method to initialize box positions
    } // End  RotatingShape(M)

    void initializeBlockColors() {
        // Initialize block colors with random hues
        for (int i = 0; i < num; i++) {
            blockColors[i] = mv.random(360); // A random hue initialized to each block
        }
    } // End initializeBlockColors() 

    void initializeBoxPositions() {
        float radius = 325; // Radius of the circular arrangement
        float angle = 0; // Initial angle
        // Positions of each box around a circle is calculated
        for (int i = 0; i < num; i++) {
            float x = radius * (float) Math.cos(angle); // X-coordinate of box position
            float y = radius * (float) Math.sin(angle); // Y-coordinate of box position
            boxPositions[i] = new PVector(x, y, 0); // Box position stored in the array
            angle += mv.TWO_PI / num; // Angle incremented for the next box
        }
    } // End initializeBoxPositions()

} // End rotatingBlocks()

