/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CCCPractice2018;

import java.util.Scanner;

/**
 *
 * @author elect
 */
public class CCCPractice4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Intialize scanner for user input
        Scanner input = new Scanner(System.in);
        
        int sunflowersPlanted = input.nextInt();
        

        String [] allValueHolder = new String[(int)Math.pow(sunflowersPlanted,2)];
        
        int counter = 0;
        
        String fillerNothing = input.nextLine();
        
        for(int i = 0; i < sunflowersPlanted; i++)
        {
            String sunflowerValueHolder = input.nextLine();
            String [] sunflowerSingleDayValueHolder = sunflowerValueHolder.split(" ");
            
            for(int c = 0; c < sunflowerSingleDayValueHolder.length; c++)
            {
                allValueHolder [counter] = sunflowerSingleDayValueHolder [c];
                counter++;
            }
        }
        
        int lowestNumber = Integer.parseInt(allValueHolder[0]);
        int lowestNumberIndex = 0;
        
        for(int i = 0; i < allValueHolder.length; i++)
        {
            if(Integer.parseInt(allValueHolder[i]) < lowestNumber)
            {
               lowestNumber = Integer.parseInt(allValueHolder[i]);
               lowestNumberIndex = i;
            }
        }
         
        int degreesRotated = 0;
        
        if(allValueHolder[0].equals(allValueHolder[lowestNumberIndex]))
        {
            degreesRotated = 360;
        }
        if(allValueHolder[sunflowersPlanted-1].equals(allValueHolder[lowestNumberIndex]))
        {
            degreesRotated = 90;
        }
        if(allValueHolder[sunflowersPlanted*sunflowersPlanted-sunflowersPlanted].equals(allValueHolder[lowestNumberIndex]))
        {
            degreesRotated = 270;
        }
        if(allValueHolder[sunflowersPlanted*sunflowersPlanted-1].equals(allValueHolder[lowestNumberIndex]))
        {
            degreesRotated = 180;
        }
        
        int [] valuesAfterRotation = new int[(int)Math.pow(sunflowersPlanted,2)];
        int z = 0;
        
        if(degreesRotated == 360)
        {
            for(int i = 0; i < sunflowersPlanted*sunflowersPlanted; i++)
            {
                valuesAfterRotation [i] = Integer.parseInt(allValueHolder[i]);
            }
        }
        if(degreesRotated == 180)
        {
            for(int i = 0; i < sunflowersPlanted; i++)
            { 
                int d = sunflowersPlanted*sunflowersPlanted-1-i;
                for(int c = 0; c < sunflowersPlanted; c++)
                {
                   valuesAfterRotation[z] = Integer.parseInt(allValueHolder[d-(c*sunflowersPlanted)]);
                   z++;
                }
            }
        }
        if(degreesRotated == 270)
        {
            for(int i = 0; i < sunflowersPlanted; i++)
            { 
                int d = sunflowersPlanted*sunflowersPlanted-sunflowersPlanted+i;
                for(int c = 0; c < sunflowersPlanted; c++)
                {
                   valuesAfterRotation[z] = Integer.parseInt(allValueHolder[d-sunflowersPlanted*c]);
                   z++;
                }
            }
        }
        if(degreesRotated == 90)
        {
          for(int i = 0; i < sunflowersPlanted; i++)
            { 
                int d = sunflowersPlanted*(1+i)-1;
                for(int c = 0; c < sunflowersPlanted; c++)
                {
                   valuesAfterRotation[z] = Integer.parseInt(allValueHolder[d-c]);
                   z++;
                }
            }
        }
        
        for(int i = 0; i < sunflowersPlanted; i++)
        {
            for(int c = 0; c < sunflowersPlanted; c++)
            {
                System.out.print(valuesAfterRotation[i*sunflowersPlanted+c] + " ");
            }
            System.out.println("");
        }
        
        
        
    }
}


