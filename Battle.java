//Brandon Carey
//CSC111
//September 16 2013
//This program sets up the battle class for the Giants and Ogres program.

import java.util.Random;
import java.text.DecimalFormat;

public class Battle 
{
  public static void main(String[] args)
  {
    Ogres ogreMain = new Ogres();
    Giants giantMain = new Giants();
    DecimalFormat dec = new DecimalFormat("##.###");
    int round = 0;
    System.out.println("Round    Giant          Ogre");
    System.out.println("-----    -----          ----");
    System.out.println("Start   100.000	       60.000");	
    

    while ((ogreMain.getHealth() > 0) && (giantMain.getHealth() > 0))
    {
      ogreMain.attack(giantMain);
      giantMain.attack(ogreMain);
      round = round + 1;

      System.out.print(round + "        ");

      System.out.print((dec.format(giantMain.getHealth())) + "        ");

      System.out.println((dec.format(ogreMain.getHealth()))); 
      
      
     
     
     
     }
   
     if ((ogreMain.getHealth() <= 0) && (giantMain.getHealth() <= 0))
     {
       System.out.println("Both the Ogre and the Giant died in battle!");
     }

     else if ((ogreMain.getHealth() >= 0) && (giantMain.getHealth() <= 0))
     { 
       System.out.println("The Ogre has won the battle!");
     }

     else if ((giantMain.getHealth() >= 0) && (ogreMain.getHealth() <= 0))
     {
       System.out.println("The Giant has won the battle!");
     }
  }
}
        
    

    

