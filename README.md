# Music Visualiser Project

Name: Yasmin Ismail

Student Number: C22485282

# Description of the assignment

Youtube video of  Music Visualiser Project: https://www.youtube.com/watch?v=PFwGrX_GDFs

Song chosen for the Music Visualiser Project: https://www.youtube.com/watch?v=THFFP1EM3EU

# Instructions
Compile and run. 
Press 0-4 to change between backgrounds. 


# How it works

I have chosen a song that inspires me and reflects my style and interests. The Mario Kart Luigi Circuit. It has a clear structure, rhythm, and mood as the visual elements react well to the audio in real-time. The video will show this. It conveys a sense of mood, tempo, and narrative. I have used colour, shape, motion, and composition to create a visually compelling and dynamic representation of the song. 
 
The classes of the visuals import from the "**c22485282**" package into their own Java programs to reuse the functionality demonstrated in these classes to render a visual effect. 
I've implemented several visual effects.  

MyVisual.java class is defined within the c22485282 package. Classes from ie.tudublin package are imported. MyVisual is a subclass that extends Visual which is an abstract class that's within the ie.tudublin package. This will serve as a foundation for audio visualization in Processing. This subclass was there when I forked the MusicVisuals repository, i have implemented more values in it. It contains several fields; wf, abv, worm, rotatingBlocks, balls, gradientShape. They are instances of different classes used for different visual effects and audio processing sketch.  

It contains methods; settings(), setup(), keyPressed(), draw(). 

All of the classes below is part of the c22385282 package.  The background colour was black and it felt plain, so I changed the background colour.

Starting first with the Worm class. This renders a work-like shape based on audio input. The Constructor Worm(MyVisual mv) initializes a Worm object with a reference to a MyVisual instance (mv). 
The render() method renders the worm visualization. It calls calcWorm() method and renderWorm() method thus rendering the worm visually. The calcWorm() method dynamically adjusts the worm's visual based on audio amplitude, it contains the functions sine and cosine to calculate the movement of segments. The amplitude of each segment is modulated by audio signal. The result of this leads to it responding to audio in a fluid wave-like motion. 

renderWorm() method draws the visual representation using ellipses. This provides a colourful and dynamic visual effect. It sets stroke properties. It iterates over yvalues to draw ellipses at each location. The position of the ellipses x, y is calculated based on the current xspacing and yvalues. The colours are determined by hue values. The result of this leads to it responding to audio in a fluid wave-like motion.

The RotatingBlocks  class creates 3D blocks that rotate. Each block’s color and position changes based on the audio input. The blocks rotate around a central axis and color shifts over time in response to the audio. 
The Constructor RotatingBlocks(MyVisual mv) initializes the mv reference with a MyVisual instance passed to the constructor. Creates array to store block colours and box poistions. initializeBlockColors() method fills the blockColors array with random hue values ranging from 0 to 360. 

For the initializeBoxPositions() method, the positions of boxes are arranged in a circle using polar coordinates and stores them in the boxPositions array. render() Method coordinates the rendering process by setting up stroke properties. It handles audio input for colour modulation. It positions and rotates each box, and updates for a dynamic visual effect. 

In the Balls class, bouncing balls are generated that respond to audio input. 

Balls(MyVisual mv) is a constructor that initializes a new instance of Balls that provides a MyVisual instance. This sets up parameters for balls such as amplitude, period, and positioning. 
The render() Method coordinates the rendering process for the balls. mv.hint(mv.DISABLE_DEPTH_TEST) ensures 2D rendering by disabling depth testing. calcBalls() method called to calculate ball heights based on audio input. renderBalls() called to draw the balls based on calculated heights. mv.hint(mv.ENABLE_DEPTH_TEST) depth testing re-enables after rendering.

The calcBalls() method that calculates the height of each ball based on audio input. theta += 0.02 increments the angle for oscillation. There is a nested loop that iterates over yvalues array, calculates ballHeight based on audio input, also sine, cosine functions. The yvalues is updated with calculated ballHeight for each ball.

The GradientShape class renders three gradient circles. The colors change based on the audio input.  It utilizes the Processing library PApplet. The Constructor GradientShape(MyVisual mv) initializes the mv reference with a MyVisual instance passed to the constructor. Sets the canvas dimensions, which is the height and width and calculates the size of the gradient circles which is the dim.

The render() method draws the gradient circles.The mv.background(0) sets the background color to black. The audio amplitude value from the MyVisual instance's audio buffer is retrieved from audioAmplitude = mv.getAudioBuffer().get(0). This fetches the amplitude value at index 0. A for loop is used to draw the gradient circles. It  increments x by dim, the size of each circle to position the circles evenly spaced.

The drawGradient() Method is used within the render() method to draw a single gradient circle at a specified position x, y with a given amplitude. It Calculates initial Hue, h.  Maps the audio amplitude to a hue value between 0 and 360 degrees. This is the initial color hue of the gradient. A nested loop to draw circles. Each iteration the saturation and brightness values are calculated. Fill color set using HSB color mode.


The Snow class simulates falling snow that responds to the audio input. The snow begins at the top and drifts down. Their size and speed influenced by the audio input. I have rendered the Snow class on all classes but balls and Gradient as it’s not as appealing. 
The Constructor Snow(MyVisual mv) initializes the mv reference with a MyVisual instance passed to the constructor. Initializes the snowflakes ArrayList too. 

The render() method calls addSnowflakes() to add new snowflakes. It will Iterates over snowflakes. update() updating their position. display() displays them, snowflakes removed if its offscreen. 


Specific number of snowflakes are added to the top of the screen with random positions and sizes in the addSnowflakes(). The class Snowflake contains individual snowflake with its own position, size  and falling speed. Initializes the snowflake with specified parameters. 
Methods update() display() and isOffscreen() updates the position of the snowflake, renders the snowflake as a white ellipse, checks if the snowflake has fallen completely off the screen.


In the MyVisual class, these visuals are switched using keyboard input, the keyPressed() method, allowing for real-time interaction with different visualizations. The draw() method causes the rendering of the chosen visual effect based on the current mode.  

 



# What I am most proud of in the assignment
Doing this project has taught me a lot. I am most proud of what I managed to do, learning so much and how fun it was. Learning a concept to me that I had no knowledge of. Being able to create visuals responding to audio input using Processing is such a cool and fun concept, challenging but fun! Each process of the project, implementing various visual effects like rotating blocks, animated shapes, has taught me something new about Java. It was so fun, joyful and rewarding when the code worked as there were some difficulties implementing certain code, but I managed. It was challenging but as challenging as it was, it kept me engaged because the rewarding feeling of accomplishing it was worthwhile.  

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

