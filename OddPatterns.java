import java.util.Scanner;
public class OddPatterns{
public static void main(String...args){
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your desired row: ");
int line =scanner.nextInt(); 
if (line % 2 !=0){
for(int row = 1; row <=line; row++){
if (row % 2 !=0){
for(int space =line-1; space >= row; --space){
System.out.print(" ");
}
for(int star = 1; star <= row; star++){
    
    System.out.print("* ");
}
}else{
  continue;
}
System.out.println();

}
for(int row = line-1; row >=1; row--){
if (row % 2 !=0){
for(int space = line-1; space >= row; space--){
System.out.print(" ");
}
for(int star = row; star >= 1; star--){
    System.out.print("* ");
}
}else{
  continue;
}
System.out.println();

}
}

}
}
