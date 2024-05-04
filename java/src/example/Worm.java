package example;

public class Worm {

        MyVisual mv;
        int xspacing = 8;   // Distance of each horizontal location 
        int w;              // Width of entire worm
        int maxworms = 2;   // Amount of worms to add together
    
        float theta = 0.0f; // Angle initialized for worm oscillation
        float[] amplitude = new float[maxworms];   // Stores height of worm
        float[] dx = new float[maxworms];          // Value for incrementing X
        float[] yvalues;                           // Stores height values of the worm 
    
        // Constructor for the Worm class, taking a MyVisual instance as input
        public Worm(MyVisual mv) {
            this.mv = mv;  //The passed MyVisual instance assigned to the local mv variable
            w = mv.width + 16; // Width of the worm visualization adjusted to the width of the sketch
            
            // // Initialize worm parameters
            for (int i = 0; i < maxworms; i++) {
                amplitude[i] = mv.random(100,120); // Random amplitudes set for each worm
                float period = mv.random(300,1000); // Random period set for each worm
                dx[i] = (mv.TWO_PI / period) * xspacing;
            } // End for
            yvalues = new float[w/xspacing];    // Num of vertical locations based on the width and xspacing
        } // End public worm()
        

    public void render() {
        mv.hint(mv.DISABLE_DEPTH_TEST);
        calcWorm();
        renderWorm();
        mv.hint(mv.ENABLE_DEPTH_TEST);
    }
    void calcWorm() {
        
        theta += 0.02;

        
        for (int i = 0; i < yvalues.length; i++) {
            float x = theta + (i * dx[0] / xspacing);
            float wormHeight = 0;
            for (int j = 0; j < maxworms; j++) {
            
                if (j % 2 == 0)  wormHeight += mv.sin(x)*amplitude[j];
                else wormHeight += mv.cos(x)*amplitude[j];
                x+=dx[j];
            }
            yvalues[i] = wormHeight;
        }
    }
}
