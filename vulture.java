// Zacharia Kornas
// 06/01/2021
// CSE 142 Section AX
// TA: Paul George Druta
// Assessment 8 - Critters
//
// A class that dictates behavior of Vultures

import java.awt.*;

public class Vulture extends Bird {
   
   private boolean shouldEat;
   
   // Constructs a new Vulture
   public Vulture() {
      shouldEat = true;
   }
   
   // Returns if a Vulture should eat or not when encountering food
   // Vultues eat when they are first created and after they fight 
   public boolean eat() {
      if (shouldEat) {
         shouldEat = false;
         return true;
      } else {
         return false;
      }
   }
   
   // Returns attack type of Vultures
   // Vultures ROAR at ants and POUNCE at other critters
   // Vultures eat after they fight
   // Parameters:
   //    opponents - The string that represents the opponent
   public Attack fight(String opponent) {
      shouldEat = true;
      return super.fight(opponent);
   }

   // Returns color of Vultures
   // Vultures are always black
   public Color getColor() {
      return Color.BLACK;  
   }
}
