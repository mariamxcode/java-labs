import java.util.Arrays;
public class EvenIndex{
public static void main(String[]args){
int [] array = {1,2,4,5};
System.out.println(Arrays.toString(evenIndex(array)));
}
public static int [] evenIndex(int [] numbers){
int [] evenArray = new int [numbers.length/2] ;
   int theIndex = 0;
for(int index = 0; index < numbers.length; index++ ){
  if (index % 2 == 0){
   evenArray[theIndex++] =numbers[index];
   }
}

 return evenArray;
}

}
