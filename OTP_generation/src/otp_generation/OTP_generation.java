/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp_generation;

import static otp_generation.NewClass.OTP;

/**
 *
 * @author aparna sajeev
 */
public class OTP_generation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // we are using random() method to generate the OTP
        // 
          int length=6;
         System.out.println(OTP(length));
    }

    
    }
    
    

