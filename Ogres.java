//Brandon Carey
//CSC 111
//September 16 2013
//This GEdit java code sets up the Giants class.

import java.util.Random;

public class Ogres 
{
    private double strength0;
    private double health0;


    public Ogres()
    {  
      strength0 = 25.0;
      health0 = 60.0;
    }
      

    public boolean isAlive()
    {
      if (health0 > 0){
        return true;
      }

      else{
        return false;
      }
    }

    public void takeDamage(double attackG)
    {
      health0 = health0 - attackG;
    }

    public void attack(Giants enemy)
    {
      double attack0;
      attack0 = (strength0 * (Math.random()));
      enemy.takeDamage(attack0);
    }

    

    public double getHealth()
    {
      return health0;
    }
}
   
    
      
