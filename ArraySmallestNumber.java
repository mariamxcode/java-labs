import java.util.Scanner;
import java.util.Arrays;
public class ArraySmallestNumber{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
int [] numbers = new int[7];
System.out.print("Enter number: ");
int min = scanner.nextInt();
numbers[0]=min;
for(int index = 1; index < numbers.length; index++){
System.out.print("Enter number: ");
int number = scanner.nextInt();
numbers[index]=number;
if (min > number){
min=numbers[index];
}

}
System.out.println(Arrays.toString(numbers));
System.out.println(min);
}
}
