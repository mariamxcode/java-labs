public class StarTriangles{
public static void main(String...args){
for(int line = 1; line <=10; line++){
for(int star = 1; star <= line; star++){
System.out.print("*");

}
System.out.println();

}
System.out.println();
for(int line = 1; line <=10; line++){
for(int reverseStar = 10; reverseStar >= line; reverseStar--){
System.out.print("*");

}
System.out.println();
}

System.out.println();
for(int line = 1; line <=10; line++){
for(int reverseSpace = 1; reverseSpace <= line; reverseSpace++){
System.out.print(" ");

}
for(int reverseStar = 10; reverseStar >= line; reverseStar--){
System.out.print("*");

}
System.out.println();
}

System.out.println();
for(int line = 1; line <=10; line++){
for(int reverseSpace = 10; reverseSpace >= line; reverseSpace--){
System.out.print(" ");

}
for(int reverseStar = 1; reverseStar <= line; reverseStar++){
System.out.print("*");

}
System.out.println();
}


}

}
