package example;

public class Balls {
    MyVisual mv;
    int xspacing = 8;   // Distance of each horizontal location 
    int w;              // Width of entire balls
    int maxballs = 2;   // Amount of balls to add together

    float theta = 0.0f; // Angle initialized for ball oscillation
    float[] amplitude = new float[maxballs];   // Stores height of ball
    float[] dx = new float[maxballs];          // Value for incrementing X
    float[] yvalues;                           // Stores height values of the ball 

    
}
