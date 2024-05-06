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

    } // End render()


    
}
