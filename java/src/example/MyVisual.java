
package example;

import ie.tudublin.*;

public class MyVisual extends Visual {
    WaveForm wf;
    AudioBandsVisual abv;
    Worm worm;
    RotatingBlocks rotatingBlocks;
    //Rotation rotation;
    Balls balls;
    GradientShape gradientShape;


    public void settings() {
        size(1024, 500);

        // Use this to make fullscreen
        // fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        fullScreen(P3D, SPAN);
    }

    public void setup() {
        startMinim();

        // Call loadAudio to load an audio file to process
        loadAudio("music/tagmp3_MCLuigiCircuit.mp3");
        // Call this instead to read audio from the microphone
        // startListening();

        getAudioPlayer().cue(0);
        getAudioPlayer().play();

        wf = new WaveForm(this);
        abv = new AudioBandsVisual(this);
        worm = new Worm(this);
        rotatingBlocks = new RotatingBlocks(this);
        // rotation = new Rotation(this);
        balls = new Balls(this);
        gradientShape= new GradientShape(this);
     
    }

    int current = 0;

    public void keyPressed() {
        if (key == '1') {
            worm.render();
            current = 1;
        } else if (key == '2') {
            rotatingBlocks.render();
            current = 2; 
        } else if (key == '3') {
                balls.render();
                current = 3;
        } else if (key == '4') {
           gradientShape.render();
            current = 4;
        }
    } // End keyPressed()
    //     else if(key == '3')
    //         rotation.render(width, height);
    //         current = 3;
    // }
    

    public void draw() {
        background(0);
      
        if (current == 1) {
            worm.render();
        }
        else if (current == 2) {
            rotatingBlocks.render();
        }
        else if(current == 3)
        {
            balls.render();
        }
        else if(current == 4)
        {
            gradientShape.render();
        }
        
        // else if (current == 3)
        // {
        //     rotation.render(width, height);
        // }
        
        // im gonna render these here after the worm.java  so that they are on top
       wf.render();
       abv.render();
    }
}