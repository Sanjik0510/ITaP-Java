

// java Palindrome madam racecar apple kayak song noon
public class Palindrome {
    public static void main(String[] args){


        for (String word : args){
            word = word.toLowerCase();
            if (word.equals(reverseString(word))){
                System.out.println(word);
            }
        }

    }

    public static String reverseString(String word){
        String reversedWord = ""; 
        for (int i=word.length()-1; i >= 0; i--){
            reversedWord += word.charAt(i);
        } 

        return reversedWord;
    }   
}
