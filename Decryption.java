
/**
 * This will decrypt any message given by the end user.
 *
 * @author Ruthie Dignan
 * @version 3/23/21
 */
import java.util.*;
public class Decryption
{
    public static void main(String args[]) {
        String decryptMessage = "";
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cipher text message: ");
        String cipherText = sc.nextLine();
        System.out.println();
        System.out.println("Enter the value that shifted each character: ");
        int shiftKey = sc.nextInt();
        
        for(int i=0; i < cipherText.length();i++) 
        {
            char alphabet = cipherText.charAt(i);
            if (alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char)(alphabet - shiftKey);
                if(alphabet < 'a')
                {
                    alphabet = (char)(alphabet - 'a' + 'z' + 1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else if (alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char)(alphabet - shiftKey);
                if (alphabet < 'A')
                {
                    alphabet = (char)(alphabet - 'A' + 'Z' + 1);
                }
                decryptMessage = decryptMessage + alphabet;
            }
            else 
            {
                decryptMessage = decryptMessage + alphabet;
            }
            System.out.println();
            System.out.println("The decrypted text message: ");
            System.out.println(decryptMessage);
        }
    }
}
