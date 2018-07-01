
package password_generation;

import java.util.Random;

/**
 *
 * @author aparna sajeev 
 */
public class Password_generation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int length=10;    //length of the password is cj=hossen as 8
        System.out.println(new_password(length));
    }
    //this is password generation method
    //we have use statuc here so that we dont make use of any object here
     
    static char[] new_password(int len){
        
        System.out.println("generating password using random():");
           System.out.println("the new password is: ");
           
           //a strong password must have uppercse, lowercase,numeric value and special symbol so we make use of all these
           String Capital_char="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
           String Small_char="abcdefghijklmnopqrstuvwxyz";
           String numbers="0123456789";
           String symbols="!@#$%^&*_+-=/.?<>)";
           
           String values=Capital_char+ Small_char+ numbers+ symbols;
           
           //Using random method
            Random rndm_method=new Random(); //using random function
              
               char[] password =new char[len];
               
               for (int i =0;i<len;i++)
               {
                   password [i]=values.charAt(rndm_method.nextInt(values.length()));
                   //use of charAt() method is to get character value 
                   //Use of nextAt() as it is scanning the values as int
               }
               return password;
        }

        
          
    }
   
