import java.util.Scanner;
public class BarChart{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
for(int input = 1; input <= 5; input++){
System.out.println("Enter a number: ");
int number = scanner.nextInt();
System.out.print(number);
for(int star = 1; star <= number ; star ++){
System.out.print("*");
}
System.out.println();
}


}
}
