package example;

public class Worm {

        MyVisual mv;
        int xspacing = 8;   // Distance of each horizontal location 
        int w;              // Width of entire worm
        int maxworms = 2;   // Amount of worms to add together
    
        float theta = 0.0f; // Angle initialized for wave oscillation
        float[] amplitude = new float[maxworms];   // Stores height of worm
        float[] dx = new float[maxworms];          // Value for incrementing X
        float[] yvalues;                           // Stores height values of the worm 
    
        // Constructor for the Worm class, taking a MyVisual instance as input
        public Worm(MyVisual mv) {
            this.mv = mv;  //The passed MyVisual instance assigned to the local mv variable
            w = mv.width + 16; // Width of the worm visualization adjusted to the width of the sketch
            
            // // Initialize worm parameters
            for (int i = 0; i < maxworms; i++) {
                amplitude[i] = mv.random(100,120); // Random amplitudes set for each wave
                float period = mv.random(300,1000); // Random period set for each wave
                dx[i] = (mv.TWO_PI / period) * xspacing;
            } // End for
            yvalues = new float[w/xspacing];    // Num of vertical locations based on the width and xspacing
        } // End public worm()
}
