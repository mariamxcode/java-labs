import java.util.Scanner;
import java.util.Arrays;
public class ArrayOutput{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int [] numbers = new int[5];

for(int index = 0; index < 5; index++){
System.out.print("Enter number: ");
int number = scanner.nextInt();
numbers[index]=number;
}
System.out.println(Arrays.toString(numbers));
}
}
