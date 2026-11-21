public class TaskSeven{
public static void main(String... args){
int sum = 0;
int product = 1;
 for(int number = 1; number <= 10; number++){
 if(number % 4 == 0){
 for(int repeat = 1; repeat <=5;repeat++){
 product*=number;
 sum+=product;
 }
  System.out.printf("%d ",sum);
  sum = 0;
  product = 1;
 }
 }
System.out.println();
}

}
