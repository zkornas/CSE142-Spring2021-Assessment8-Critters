// Zacharia Kornas
// 06/01/2021
// CSE 142 Section AX
// TA: Paul George Druta
// Assessment 8 - Critters
//
// A class that dictates behavior of Ants

import java.awt.*;

public class Ant extends Critter {
   

   private boolean changeDirection;
   private boolean direct;
   
   // Constructs a new Ant
   // Parameters:
   //    walkSouth - Determins if an Ant will move North or South 
   public Ant (boolean walkSouth) {
      changeDirection = true;
      direct = walkSouth;
   }
   
   // Returns direction that an Ant moves
   // Ants move either SouthEast or NorthEast
   public Direction getMove() {
      changeDirection = !changeDirection;
      if (direct) {
         if (!changeDirection) {
            return Direction.SOUTH;
         } else {
            return Direction.EAST;
         }
      } else {
         if (!changeDirection) {
            return Direction.NORTH;
         } else {
            return Direction.EAST;
         }
      }
   }

   // Returns if an Ant should eat or not when encountering food
   // Ants always eat
   public boolean eat() {
      return true;
   }
   
   // Returns attack type of Ants
   // Ants always SCRATCH 
   // Parameters:
   //    opponent - the string that represents the opponent critter
   public Attack fight(String opponent) {
      return Attack.SCRATCH;
   }
   
   // Returns color of Ant
   // Ants are always red
   public Color getColor() {
      return Color.RED;
   }
   
   // Returns string that represents Ant
   // Ants are always represented by "%"
   public String toString() {
      return "%";
   }
}
