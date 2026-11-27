import java.util.Arrays;
public class OddIndex{
public static void main(String[]args){
int [] array = {1,2,4,5};
System.out.println(Arrays.toString(oddIndex(array)));
}
public static int [] oddIndex(int [] numbers){
int [] oddArray = new int [numbers.length/2] ;
   int theIndex = 0;
for(int index = 0; index < numbers.length; index++ ){
  if (index % 2 != 0){
    oddArray[theIndex++] =numbers[index];
   }
}

 return oddArray;
}

}
