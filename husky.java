// Zacharia Kornas
// 06/01/2021
// CSE 142 Section AX
// TA: Paul George Druta
// Assessment 8: Critters
//
// A class that dictates behavior of Huskies

import java.awt.*;
import java.util.*;

public class Husky extends Critter {
   

   private int direct;
   private Random rand;
   
   // Constructs a new Husky
   public Husky () {
      rand = new Random();
      direct = 0;
   }
   
   // Returns direction Husky moves int
   // Huskies move in random directions
   public Direction getMove() {
      direct = rand.nextInt(3);
      if (direct == 0) {
         return Direction.NORTH;
      } else if (direct == 1) {
         return Direction.EAST;
      } else if (direct == 2) {
         return Direction.SOUTH;
      } else if (direct == 3) {
         return Direction.WEST;
      }
      return Direction.NORTH;
   }

   // Returns if a Husky should eat or not when encountering food
   // Huskies always eat food 
   public boolean eat() {
      return true;
   }
   
   // Returns attack type based on opponent
   // Huskies SCRATCH birds, vultures, and full hippos
   // ROAR at all other opponents
   // Parameters:
   //    opponent - The string that represents the opponent
   public Attack fight(String opponent) {
      if (opponent.equals("^") || opponent.equals(">") || opponent.equals("V") || opponent.equals("<") || opponent.equals("0")) {
         return Attack.SCRATCH;
      } else {
         return Attack.ROAR;
      }
   }
   
   // Returns the color of the Husky
   // Huskies are always yellow 
   public Color getColor() {
      return Color.YELLOW;
   }
   
   // Returns the string that represents the Husky
   // Huskies are always represented by "W"
   public String toString() {
      return "W";
   }
}
