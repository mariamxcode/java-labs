import java.util.Scanner;
public class vEvenIndexWord{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter word: ");
String word = scanner.nextLine();
String sortedWord = "";

    for(let letter = 0; letter<word.length; letter++){
     if(letter % 2 == 0){
     sortedWord +=word.charAt(letter);
     }
     }
     
System.out.print("New word: "+sortedWord);
