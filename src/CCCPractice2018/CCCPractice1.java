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
public class CCCPractice1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Intialize scanner for user input
        Scanner input = new Scanner(System.in);
        
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        
        boolean numberATelemarketer = true;
        
        if(numberATelemarketer != true || (number1 != 8 && number1 != 9))
        {
            numberATelemarketer = false;
        }
        if(numberATelemarketer != true || (number2 != number3))
        {
            numberATelemarketer = false;
        }
        if(numberATelemarketer != true || (number4 != 8 && number4 != 9))
        {
            numberATelemarketer = false;
        }
        
        if(numberATelemarketer)
        {
            System.out.println("ignore");
        }
        else
        {
          System.out.println("anwser");  
        }
        
        
        
    }
    
}
