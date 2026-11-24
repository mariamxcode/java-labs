import java.util.Scanner;
public class AverageRepetition{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int sum = 0;
int counter = 1;
int number = 0;
while (number != -1){
    System.out.print("Enter a number: "));
    number = scanner.nextInt();
    sum+=number;
    double average = (double)sum / counter;
    System.out.println("Average"+average);
    counter+=1;


}
}
}
