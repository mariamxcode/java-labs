public class InverseNumberPattern{
public static void main(String...args){

inverseNumber(8);
}
public static void inverseNumber(int row){
for(int line = row; line >= 1; line--){
for(int space = row; space > line; space--){
System.out.print(" ");
}
for(int number = line; number >=1; number--){
System.out.print(number);
}
for(int number = 2; number <= line; number++){
System.out.print(number);
}
System.out.println();
}
}
}
