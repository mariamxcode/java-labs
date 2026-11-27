import java.util.Arrays;
public class  NumberToArray{
public static void main(String[]args){
String number = "1234";
System.out.println(Arrays.toString(numberToArray(number)));
}
public static int[] numberToArray(String num){
int digit [] = new int [num.length()];
int counter=num.length()-1;
int number = Integer.parseInt(num);

while(number != 0){
int value = number % 10;
number = number / 10;
digit[counter--]=value;
}

  return digit;
 } 
}




