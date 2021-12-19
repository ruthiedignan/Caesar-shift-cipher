
/**
 * Write a description of class CaesarTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class CaesarTester
{
     public static void main(String args[]) 
     {
         String encrypt = "e";
         String decrypt = "d";
         
         Scanner sc = new Scanner(System.in);
         System.out.println("Would you like to encrypt or decrypt a message? (e or d)");
         String response = sc.nextLine();
         
         
         
         if (response.compareTo(encrypt) == 1)
         {
             Encryption one = new Encryption();
             
             ArrayList<Encryption> message = new ArrayList<Encryption>();

             message.add(one);
             
           
         }
         else if (response.compareTo(encrypt) == 0)
         {
             Decryption one = new Decryption();
             
             ArrayList<Decryption> message = new ArrayList<Decryption>();

             message.add(one);
         }
     }
     
     
     
     
}
