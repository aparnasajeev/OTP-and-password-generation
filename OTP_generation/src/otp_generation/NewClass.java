/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otp_generation;

import java.util.Random;

/**
 *
 * @author aparna sajeev
 */
public class NewClass {
    
     static char[] OTP(int len)
    {
            System.out.println("Generating OTP using random()");
            System.out.println("the OTP is:");
             
              String numbers ="0123456789"; // using numeric values
              
              Random rndm_method=new Random(); //using random function which generates the random otp
              
               char[] otp=new char[len];
               
               for (int i =0;i<len;i++)
               {
                   otp[i]=numbers.charAt(rndm_method.nextInt(numbers.length()));
                   //use of charAt() method is to get character value 
                   //Use of nextAt() as it is scanning the values as int
               }
               return otp;
        }
    
}


