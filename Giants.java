//Brandon Carey
//CSC 111
//September 16 2013
//This GEdit java code sets up the Giants class.

import java.util.Random;

public class Giants 
{
    private double strengthG;
    private double healthG;


    public Giants()
    {  
      strengthG = 15.0;
      healthG = 100.0;
    }
      

    public boolean isAlive()
    {
      if (healthG > 0){
        return true;
      }

      else{
        return false;
      }
    }

    public void takeDamage(double attack0)
    {
      healthG = healthG - attack0;
    }

    public void attack(Ogres enemy)
    {
      double attackG;
      attackG = (strengthG * (Math.random()));
      enemy.takeDamage(attackG);
    }

    

    public double getHealth()
    {
      return healthG;
    }
}
   
    
      
