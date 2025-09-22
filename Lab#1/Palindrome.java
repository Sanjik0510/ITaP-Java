import java.util.Scanner;

// java Palindrome madam racecar apple kayak song noon
public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] listOfWords = in.nextLine().trim().split(" ");

        for (String word : listOfWords){
            word = word.toLowerCase();
            if (word.equals(reverseString(word))){
                System.out.println(word);
            }
        }

        in.close();
    }

    public static String reverseString(String word){
        String reversedWord = ""; 
        for (int i=word.length()-1; i >= 0; i--){
            reversedWord += word.charAt(i);
        }

        return reversedWord;
    }   
}
