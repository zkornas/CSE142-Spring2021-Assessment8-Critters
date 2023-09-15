# CSE142-Spring2021-Assessment8-Critters
Take-home Assessment 8: Critters

## Program Behavior
In this assignment, you will not be writing a program. Instead, you will be implementing several classes that will be used in a client program provided to you. This client represents a graphical simulation of a 2D world of animals, known as critters. While it is running, the simulation will look like the image to the right. The client will only display the graphical output shown here and described below; it will not produce any console output. You will write classes that define the behavior of several types of critters, each of which moves and behaves in different ways.

The critter world is divided into cells with integer coordinates. The world is 60 cells wide and 50 cells tall. The upper-left cell has coordinates (0, 0); x increases to the right and y increases downward. The world has a finite size, but it wraps around in all four directions (e.g., moving east from the right edge brings you back to the left edge). This assessment will be confusing at first, because you will not write a main method; your code is not in control of the overall execution. Instead, your objects are part of a larger system. You might want your critters to make several moves at once using a loop, but you can’t. Critters can only make one move at a time, and only when the simulator asks. This experience may be frustrating because it is a new way of programming, but it is important. In most real-world projects, you will not be in control of the entire environment and will have to work with existing code that you cannot change.

You can read the full specification [here!](https://courses.cs.washington.edu/courses/cse142/21sp/files/assessments/a8/a8.pdf)
