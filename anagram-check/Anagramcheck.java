import java.util.Arrays;
import java.util.Scanner;

public class Anagramcheck {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter first string: ");
            String str1 = sc.nextLine().trim().toLowerCase();
            
            System.out.print("Enter second string: ");
            String str2 = sc.nextLine().trim().toLowerCase();
            
            System.out.println(isAnagram(str1, str2));
        }
    }
    
    public static boolean isAnagram(String s1, String s2) {
        
        if (s1.length() != s2.length()) {
            return false;
        }
        
        return Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
    }
}
