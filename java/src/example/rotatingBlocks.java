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
    } // End


    

    
} // End rotatingBlocks()

