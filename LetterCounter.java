import java.util.Scanner;
public class LetterCounter{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter word: ");
String word = scanner.nextLine();
String vowel = "Aeiouaeiou";
int vowelCount = 0;
int consonantCount = 0;

    for(int letter = 0; letter<word.length; letter++){
       for(int character = 0; character<vowel.length; character++){
       if(word.charAt(letter)==vowel.charAt(character)){
       vowelCount+=1;
       }
      consonantCount +=1 ;
    }
     
}

     
System.out.println("Vowels:"+vowelCount)
console.log("Consonants: "+consonantCount)
