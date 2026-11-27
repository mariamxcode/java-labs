import java.util.Arrays;
public class Total{
public static void main(String[]args){
int [] array = {1,2,4,5};
System.out.println(sumTotal(array));
}
public static int sumTotal(int [] numbers){
   int sum = 0;
for(int index = 0; index < numbers.length; index++ ){
  
 sum+=numbers[index];
}

 return sum;
}

}
