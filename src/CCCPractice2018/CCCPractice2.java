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
public class CCCPractice2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Intialize scanner for user input
        Scanner input = new Scanner(System.in);
        
        int parkingSpaces = input.nextInt();
        String filler = input.nextLine();
        String parkingOccupied1 = input.nextLine();
        String parkingOccupied2 = input.nextLine();
    

        int spacesOccupiedBothDays = 0;
        
        for(int i = 0; i < parkingOccupied1.length(); i++)
        {
            if(parkingOccupied1.charAt(i) == 'C')
            {
                if(parkingOccupied1.charAt(i) == parkingOccupied2.charAt(i))
                {
                    spacesOccupiedBothDays++;
                }
            }
        }
        
        System.out.println(spacesOccupiedBothDays);
                
        
        
        
    }
    
}
