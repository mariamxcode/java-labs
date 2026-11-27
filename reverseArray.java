public class ReverseArray {
public static void main(String[]args){
System.out.print(Arrays.toString(reverseArray({1,2,3,4})))
}
public static int[] reverseArray(int [] numbers){
int reverse [] = new int [numbers.length];
for(let index = numbers.length-1; index >=0; index-- )
  reverse[(numbers.length-1)-index]=number[index];
  }
  return reverse;
  }
}
