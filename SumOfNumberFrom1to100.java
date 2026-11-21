public class SumOfNumberFrom1to100{
public static void main(String...args){
long sum = 1;
for(long number = 1; number <=100; number++){
sum+=number;
System.out.printf("Number: %d Sum: %d%n",number,sum);
}
}
}
