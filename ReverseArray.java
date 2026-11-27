import java.util.Arrays;
public class ReverseArray {
public static void main(String[]args){
int [] array = {1,2,4,5};
System.out.print(Arrays.toString(reverseArray(array)));
}
public static int[] reverseArray(int [] numbers){
int reverse [] = new int [numbers.length];
for(int index = numbers.length-1; index >=0; index-- ){
  reverse[(numbers.length-1)-index]=numbers[index];
  }
  return reverse;
 } 
}




