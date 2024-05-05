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

    
    // Constructor for the ball class, taking a MyVisual instance as input
    public Balls(MyVisual mv) {
        this.mv = mv;  //The passed MyVisual instance assigned to the local mv variable
         w = mv.width + 16; // Width of the ball visualization adjusted to the width of the sketch

           
        // // Initialize ball parameters
        for (int i = 0; i < maxballs; i++) {
            amplitude[i] = mv.random(100,120); // Random amplitudes set for each ball
            float period = mv.random(300,1000); // Random period set for each ball
            dx[i] = (mv.TWO_PI / period) * xspacing;
            } // End for
            yvalues = new float[w/xspacing];    // Num of vertical locations based on the width and xspacing
            
}
