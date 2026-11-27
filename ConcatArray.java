import java.util.Arrays;
public class ConcatArray{
public static void main(String[]args){
int [] array = {1,2,4,5};
int [] array2 = {6,7,8,9};
System.out.print(Arrays.toString(concatArray(array,array2)));
}
public static int[] concatArray(int [] numberOne,int[]numberTwo){
int theArray [] = new int [numberOne.length + numberTwo.length];
 for(int index =0; index < theArray.length-numberOne.length; index++){
 theArray[index]=numberOne[index];
 System.out.print(theArray[index]=numberOne[index]);
 }
 for(int index =0; index < theArray.length-numberTwo.length ; index++){
 theArray[index+numberTwo.length]=numberTwo[index];
  System.out.print( theArray[index+numberTwo.length]=numberTwo[index]);
 }
 return theArray;
 } 
}


