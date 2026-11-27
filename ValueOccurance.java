import java.util.Arrays;
public class ValueOccurance{
public static void main(String[]args){
int [] array = {1,2,4,5};
System.out.println(valueOccurance(array,2));
}
public static boolean valueOccurance(int [] numbers, int target){
boolean value = true;
for(int index = 0; index < numbers.length; index++ ){
  if (numbers[index] == target){
     value = true;
     break;
  }else{
  value = false;
  }
  
 }
 return value;
}


}

