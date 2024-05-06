package example;

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


    } // End render()

    private void drawGradient(float x, float y, float amplitude) {
        int radius = dim / 2;

    } // End  drawGradient()


    
}
