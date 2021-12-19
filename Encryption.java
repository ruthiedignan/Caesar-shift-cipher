
/**
 * This will encrypt any message given by the end user.
 *
 * @author Ruthie Dignan
 * @version 3/23/21
 */
import java.util.*;
public class Encryption
{
    public static void main(String args[])
    {
        String cipherText = "";
        char alphabet;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plain text message: ");
        String plainText = sc.nextLine();
        System.out.println();
        System.out.println("Enter the value that will shift each character:");
        int shiftKey = sc.nextInt();
        
        for(int i=0; i < plainText.length(); i++)
        {
            alphabet = plainText.charAt(i);
            
            if (alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char)(alphabet + shiftKey);
                if (alphabet > 'z')
                {
                    alphabet = (char)(alphabet + 'a' - 'z' - 1);
                }
                cipherText = cipherText + alphabet;
            }
            else if (alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char)(alphabet + shiftKey);
                if (alphabet > 'Z')
                {
                    alphabet = (char)(alphabet + 'A' - 'Z' - 1);
                }
                cipherText = cipherText + alphabet;
            }
            else 
            {
                cipherText = cipherText + alphabet;
            }
        }
        System.out.println();
        System.out.println("The cipher text message: ");
        System.out.println(cipherText);
    }
}
