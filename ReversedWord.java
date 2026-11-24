import java.util.Scanner;
public class PalindromeChecker{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter word: ");
String word = scanner.nextLine();
String reverseWord = "";

    for(int letter = word.length;letter >= 0; letter-- ){
        reverseWord+=word.charAt(letter);
    }
    System.out.print(reversedWord);
}
}
