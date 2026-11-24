public class SumOfSquare{
public static void main(String...args){

int sum = 0;
for(int number = 100; number < 1000;number++){
    while (number != 0){
	    int digit = number % 10;
	   int number = number / 10;
	    sum+=digit*digit;
	    }
    if (sum == number){
        System.out.print(number);
       
    }
    }
    }

}
