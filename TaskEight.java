public class TaskEight{
public static void main(String... args){
int sum = 0;
int total= 0;
int product = 1;
 for(int number = 1; number <= 10; number++){
 if(number % 4 == 0){
 for(int repeat = 1; repeat <=5;repeat++){
 product*=number;
 sum+=product;
 }
 total+=sum;
 sum = 0;
 product = 1;
 }
 }
System.out.printf("%d%n",total);
}

}
