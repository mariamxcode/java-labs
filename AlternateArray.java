import java.util.Arrays;
public class AlternateArray{
public static void main(String[]args){
int [] array = {1,2,4,5};
int [] array2 = {6,7,8};
System.out.print(Arrays.toString(concatArray(array,array2)));
}
public static int[] concatArray(int [] numberOne,int[]numberTwo){
int theArray [] = new int [numberOne.length + numberTwo.length];
int counter=0;
 for(int index =0; index < theArray.length; index+=2){
 theArray[index]=numberOne[counter++];
 }
 counter=0;
for(int index =1; index < theArray.length; index+=2){
 theArray[index]=numberTwo[counter++];
 }
 
 return theArray;
 } 
}


