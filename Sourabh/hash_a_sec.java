import java.io.*;
import java.util.*;
import java.math.BigInteger;  
import java.nio.charset.StandardCharsets; 
import java.security.MessageDigest;  
import java.security.NoSuchAlgorithmException; 

public class hash_a_sec {
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        try{
            Scanner sc = new Scanner(System.in);
            String s=sc.nextLine();

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashInBytes = md.digest(s.getBytes(StandardCharsets.UTF_8));

            // bytes to hex
            StringBuilder sb = new StringBuilder();
            for (byte b : hashInBytes) {
                sb.append(String.format("%02x", b));
            }
            System.out.println(sb.toString());
        }
        catch(NoSuchAlgorithmException e) { 
            
            System.out.println("Exception thrown for incorrect algorithm: " + e);  
        }  
    }
}