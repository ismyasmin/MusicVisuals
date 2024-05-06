package example;

import processing.core.PApplet;

public class GradientShape {
    MyVisual mv;

    int dim; // Size of the gradient circles
    int height, width; // Dimensions of the canvas
    float audioAmplitude; // Stores the audio amplitude

    public GradientShape(MyVisual mv) {
        this.mv = mv;
        this.height = mv.height;
        this.width = mv.width;
        dim = width / 2;
    } // End GradientShape()

    public void render() {
        mv.background(0);

        // Get the audio amplitude from the MyVisual instance
        audioAmplitude = mv.getAudioBuffer().get(0);

         // Calculate the initial hue based on amplitude
        float h = PApplet.map(amplitude, -1, 1, 0, 360);

            // Draw each circle with a smoothly changing hue
            for (int r = radius; r > 0; --r) {

            } // End for


    } // End render()

    private void drawGradient(float x, float y, float amplitude) {
        int radius = dim / 2;

    } // End  drawGradient()


    
}
