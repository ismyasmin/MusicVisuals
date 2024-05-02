package AudioVis;

import ie.tudublin.*;
import c22485282.*;

// import c22485282.Visual;

public class MyVisuals extends Visual{

    public float smothedAmplitude = 0;
    public void settings() {
        size(1024, 500);

        // Use this to make fullscreen
        fullScreen();

        // Use this to make fullscreen and use P3D for 3D graphics
        fullScreen(P3D, SPAN);
    }

    public void setup() {
        startMinim();

        // Call loadAudio to load an audio file to process
        loadAudio("music/MCLuigiCircuit.mp3");
        colorMode(HSB, 360, 100, 100);
        // Call this instead to read audio from the microphone
        // startListening();

        getAudioPlayer().cue(0);
        getAudioPlayer().play();

            

    }

    int current = 0;
    boolean spacePressed = false;
    int jumpDuration = 60; // Adjust this value to change the duration of the jump
    int jumpTimer = 0;

    public void keyPressed() {
        if (key == '1') {
          
            current = 1;
        } else if (key == '2') {
          
            current = 2;
        } else if (key == '3') {
          
            current = 3;
        } else if (key == '4') {
          
            current = 4;
        }  else if (key == '5') {
           
            current = 5;
        }  else if (key =='6') {
            
            current = 6;
        } else if (key == '7') {
           
            current = 7;
        } else if (key == ' ') {
            
        }
    }

    

    public void draw() {
        background(0);
        
        if (current == 1) {
           
        } else if (current == 2) {
            
        } else if (current == 3) {
           
        } else if (current == 4) {
          
        } else if (current == 5) {
           
        }   else if (current == 6) {
              
        }
            else if (current == 7) {
           
        }

        // Render common elements
        
       
    }


    
}
