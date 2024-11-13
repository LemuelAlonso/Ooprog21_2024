import java.util.Scanner;

public class SpoonerismGenerator {

       public static String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().toLowerCase();
    }

   
    public static int vowelIndex(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        String word1 = getWord("Enter Word 1: ");
        String word2 = getWord("Enter Word 2: ");

        
        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        
        if (index1 <= 0 || index2 <= 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            
            String spoonerized1 = word2.substring(0, index2) + word1.substring(index1);
            String spoonerized2 = word1.substring(0, index1) + word2.substring(index2);
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerized1 + " " + spoonerized2);
        }
    }
}
