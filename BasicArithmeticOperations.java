import java.util.Scanner;
public class ProductOfTwoNumber{
public static void main(String...args){
Scanner input = new Scanner(System.in);
System.out.print("Input first number: ");
int firstNumber = input.nextInt();
System.out.print("Input second number: ");
int secondNumber = input.nextInt();
int addition = firstNumber + secondNumber;
int subtraction = firstNumber - secondNumber;
int product = firstNumber * secondNumber;
int division = firstNumber / secondNumber;
int modulus = firstNumber % secondNumber;
System.out.println(firstNumber +"+"+ secondNumber+"="+addition);
System.out.println(firstNumber +"-"+ secondNumber+"="+subtraction);
System.out.println(firstNumber +"*"+ secondNumber+"="+product);
System.out.println(firstNumber +"/"+ secondNumber+"="+division);
System.out.println(firstNumber +"mod"+ secondNumber+"="+modulus);
}

}
