import java.util.Scanner;
import java.util.Arrays;
public class ArrayAddition{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int [] numbers = new int[7];
int sum = 0;
for(int index = 0; index < numbers.length; index++){
System.out.print("Enter number: ");
int number = scanner.nextInt();
numbers[index]=number;
sum+=numbers[index];
}
System.out.println(Arrays.toString(numbers));
System.out.println(sum);
}
}
