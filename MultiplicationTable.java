import java.util.Scanner;
public class MultiplicationTable{
public static void main(String...args){
Scanner input = new Scanner(System.in);
System.out.print("Input number: ");
int number = input.nextInt();
int counter = 1;
while(counter <= 10){
System.out.println(number +"x"+ counter+"="+number*counter);
counter++;

}

}
}
