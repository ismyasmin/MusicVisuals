# Music Visualiser Project

Name: Yasmin Ismail

Student Number: C22485282

## Instructions
- Fork this repository and use it a starter project for your assignment
- Create a new package named your student number and put all your code in this package.
- You should start by creating a subclass of ie.tudublin.Visual
- There is an example visualiser called MyVisual in the example package
- Check out the WaveForm and AudioBandsVisual for examples of how to call the Processing functions from other classes that are not subclasses of PApplet

# Description of the assignment

# Instructions
Instructions 

Compile and run. 
Press 0-4 to change between backgrounds. 


# How it works

I have chosen a song that inspires me and reflects my style and interests. The Mario Kart Luigi Circuit. It has a clear structure, rhythm, and mood as the visual elements react well to the audio in real-time. The video will show this. It conveys a sense of mood, tempo, and narrative. I have used colour, shape, motion, and composition to create a visually compelling and dynamic representation of the song. 

Song chosen: 
https://www.youtube.com/watch?v=THFFP

 
The classes of the visuals import from the "**c22485282**" package into their own Java programs to reuse the functionality demonstrated in these classes to render a visual effect. 
I've implemented several visual effects.  

Starting first with the Worm class. This renders a work-like shape based on audio input. It uses the functions sine and cosine to calculate the movement of segments. The amplitude of each segment is modulated by audio signal. The result of this leads to it responding to audio in a fluid wave-like motion.  
The RotatingBlocks  class creates 3D blocks that rotate. Each block’s color and position changes based on the audio input. The blocks rotate around a central axis and color shifts over time in response to the audio. 
In the Balls class, bouncing balls are generated that respond to audio input. Every movement of the ball is due to sine and cosine functions. Their amplitude is modulated by audio signal. The size and speed of the balls differ based on the audio input. 
The GradientShape class renders three gradient circles. The colors change based on the audio input. The hue, saturation, and brightness of each circle are continuously modified, creating a smooth color transition that corresponds to the audio waveform. The waveform was added as an aid to make the color more appealing.   
The Snow class simulates falling snow that responds to the audio input. The snow begins at the top and drifts down. Their size and speed influenced by the audio input. I have rendered the Snow class on all classes but balls and Gradient as it’s as appealing to me. 
In the MyVisual class, these visuals are switched using keyboard input, the keyPressed() method, allowing for real-time interaction with different visualizations. The draw() method causes the rendering of the chosen visual effect based on the current mode.  

 



# What I am most proud of in the assignment

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

