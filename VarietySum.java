import java.util.Arrays;
public class VarietySum{
public static void main(String[]args){
int [] array = {1,2,4,5};
System.out.println(sumTotal(array));
}
public static int sumTotal(int [] numbers){
   int sum = 0;
   int theIndex = 0
for(int index = 0; index < numbers.length; index++ ){
  
 sum+=numbers[index];
}

while(theIndex < numbers.length){
  
 sum+=numbers[theIndex];
 theIndex++;
 
}
do{
  
 sum+=numbers[theIndex];
 theIndex++;
 
}while(theIndex < numbers.length);


 return sum;
}

}
