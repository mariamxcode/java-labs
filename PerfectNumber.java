public class PerfectNumber{
public static void main(String...args){

System.out.println(isPerfectNumber(153));

}

public static boolean isPerfectNumber(int number){
int factorSum = 0;
int counter = 0;
for (int value = 1; value < number ; value++ ){
  if (value % number == 0){
  
 factorSum +=value;
    
  }
}
if (factorSum == number){
  return true;
}else{
  return false;
}
}
}
