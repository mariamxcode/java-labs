public class NumberPattern{
public static void main(String...args){

patternNumber();
}
public static void patternNumber(){
for(int line =0 ; line <= 5; line++){
for(int number = 1;number<=line;number++){
if(number % 2 == 0){
System.out.print(line);
}else{
System.out.print(number);
if(number != 1){
System.out.print("1");
}
}
}
System.out.println();

}
}
}
