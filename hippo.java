// Zacharia Kornas
// 06/01/2021
// CSE 142 Section AX
// TA: Paul George Druta
// Assessment 8: Critters
//
// A class that dictates behavior of Hippos

import java.awt.*;
import java.util.*;

public class Hippo extends Critter {
   
   private Random rand;
   private int stepTick;
   private int direct;
   private int level;
   
   // Constructs a new Hippo
   // Parameters:
   //    hunger - determines hunger level of the frog
   public Hippo(int hunger) {
      level = hunger;
      stepTick = 0;
      rand = new Random();
      direct = rand.nextInt(4);
   }
   
   // Returns direction that the hippo moves in
   // Moves 5 units in a random direction
   public Direction getMove() {
      if (stepTick == 5) {
         stepTick = 0;
         direct = rand.nextInt(4);
      }
      stepTick++;
      if (direct == 0) {
         return Direction.NORTH;
      } else if (direct == 1) {
         return Direction.EAST;
      } else if (direct == 2) {
         return Direction.SOUTH;
      } else {
         return Direction.WEST;
      }
   }
   
   // Returns the color of the Hippo
   // Hippos are grey when hungry and white when full
   public Color getColor() {
      if (level == 0) {
         return Color.WHITE;
      }
      return Color.GRAY;
   }
   
   // Returns the attack type based on hunger level
   // Hippos SCRATCH when hungry and POUNCE when full
   // Parameters:
   //    opponent -  The string that represents the opponent
   public Attack fight(String opponent) {
      if (level == 0) {
         return Attack.POUNCE;
      }
      return Attack.SCRATCH;
   }
   
   // Returns if a Hippo should eat or not when encountering food
   // Hippos eat when hungry 
   public boolean eat() {
      if (level == 0) {
         return false;
      }
      level--;
      return true;
   }
   
   // Returns the string that represents a Hippo
   // Hippos are represented by their hunger level
   public String toString() {
      return ("" + level);
   }
}
