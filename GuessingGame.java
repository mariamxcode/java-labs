import java.util.Scanner;
import java.security.SecureRandom;
public class LetterCounter{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
SecureRandom random = new SecureRandom();
int computerGuess = random.nextInt(1,100);
int count = 1;
int number = 0;
while(number != -1){
System.out.print("Enter your guess : ");
number = scanner.nextInt();
counter++;
}

System.out.print("Attempts: "+count);
}
}
