// Zacharia Kornas
// 06/01/2021
// CSE 142 Section AX
// TA: Paul George Druta
// Assessment 8: Critters
//
// A class that dictates behavior of Birds

import java.awt.*;

public class Bird extends Critter {
   
   private int direct;
   
   // Constructs a new Bird
   public Bird () {
      direct = 0;
   }
   
   // Returns direction that the bird moves in
   // Moves in a clockwise square of four units in each direction
   public Direction getMove() {
      if (0 <= direct && direct <= 2) {
         direct++;
         return Direction.NORTH;
      } else if (direct <= 5) {
         direct++;
         return Direction.EAST;
      } else if (direct <= 8) {
         direct++;
         return Direction.SOUTH;
      } else {
         if (direct == 11) {
            direct = 0;
         } else {
            direct++;
         }
         return Direction.WEST;
      }
   }
   
   // Returns the color of the bird
   // Birds are always blue
   public Color getColor () {
      return Color.BLUE;
   }
   
   // Returns ROAR or POUNCE
   // Birds roar at ants and pounce at anything else
   // Parameters:
   //    opponents - The string that represents the opponent 
   public Attack fight(String opponent) {
      if (opponent.equals("%")) {
         return Attack.ROAR;
      } else {
         return Attack.POUNCE;
      }
   }
   
   // Returns the string that represents the Bird
   // Birds will face the direction they move just moved
   public String toString() {
      if (1 <= direct && direct <= 3) {
         return "^";
      } else if (4 <= direct && direct <= 6) {
         // need both conditions so that if direct == 0
         // it goes through the entire if structure 
         return ">";
      } else if (7 <= direct && direct <= 9) {
         return "V";
      } else {
         return "<";
      }
   }
}
