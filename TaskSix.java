public class TaskSix{
public static void main(String... args){
int product =1;
 for(int number = 1; number <= 10; number++){
 if(number % 4 == 0){
 for(int repeat = 1; repeat <=5;repeat++){
 product*=number;
 System.out.printf("%d ",product);
 }
 product = 1;
  System.out.print(" ");
 }
 }
System.out.println();
}

}
