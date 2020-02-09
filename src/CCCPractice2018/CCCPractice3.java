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
public class CCCPractice3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Intialize scanner for user input
        Scanner input = new Scanner(System.in);
        
        String valuesInput = input.nextLine();
        
        String [] numberValues = valuesInput.split(" ");
        
        int [] intValues = new int[numberValues.length + 1];
        
        intValues [0] = 0;
        
        for(int i = 1; i < 5; i++)
        {
            intValues [i] = Integer.parseInt(numberValues[i-1]);
        }
        
        int [] outputValues = new int[25];
        int temporaryCounter = 0;
        
        for(int i = 0; i < 25; i++)
        {
            outputValues [i] = 0; 
        }
        
        
        for(int i = 0; i < 5; i++)
        {
            for(int c = 0; c < 5; c++)
            {
                if(i <= c)
                {
                    int counter = i;
                    while(counter != c)
                    {
                        outputValues [temporaryCounter] = intValues[counter+1] + outputValues [temporaryCounter];
                        counter++;
                    }
                    temporaryCounter++;
                }
                else
                {
                    int counter = i;
                    while(counter != c)
                    {
                        outputValues [temporaryCounter] = intValues[counter] + outputValues [temporaryCounter];
                        counter--;
                    }
                    temporaryCounter++;
                }
            }
        }
        
        for(int i = 0; i < 5; i++)
        {
            for(int c = 0; c < 5; c++)
            {
                System.out.print(outputValues[i*5 + c] + " ");
            }
            
            System.out.println();
        }
        
    }
    
}
