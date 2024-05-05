// package example;

// //import ie.tudublin.Visual;
// import processing.core.PApplet;

// public class Rotation {
//     MyVisual mv;
//     int lastColorChange = 0;
//     int colorChangeInterval = 1500; // Change colors every 1.5 seconds
//     int[] shapeColors; // Stores the hue
//     int[] nextColors; 
 
//     float a;                 // Angle of rotation
//     float offset = (float) (Math.PI / 24.0);
//     int num = 12;            
//     int width, height;        


//  public Rotation(MyVisual mv) {
//       this.mv = mv;
//       width = mv.width + 16; // Moved initialization here
//       height = mv.height;
//       shapeColors = new int[num];
//       nextColors = new int[num];
//     }

    
//     void initializeCubeColors() {
//         for (int i = 0; i < num; i++) {
//             shapeColors[i] = (int) mv.random(360);
//             nextColors[i] = (int) mv.random(360);
//         }

//     }




// void settings() {
//   mv.size(640, 360);
// }

// // void setup() {
// //   mv.background(0);
// // }



// void draw() {
//   //mv.background(0);
//   mv.translate(width/2, height/2);
// }
// public void render(int w, int h) {
//   mv.background(0);
//   mv.translate(w/2, h/2);

//   // Get the audio data
//   float audioData = mv.getAudioBuffer().get(0);

//   // Use the audio data to set the color of each object
//   for(int i = 0; i < num; i++) {
//     int gray = (int) PApplet.map(audioData, -1, 1, 0, 255);
//     mv.pushMatrix();
//     mv.noStroke();
//     mv.fill(gray, 0, 255 - gray); // Fill color set using RGB color mode
//     mv.rotateY(a + offset*i);
//     mv.rotateX(a/2 + offset*i);
//     mv.box(200 + audioData * 50); // Set size based on audio data
//     mv.popMatrix();
//   }

//   a += 0.01;
// }
// }