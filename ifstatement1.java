import java.util.Scanner;
public class ifstatement1{
    public static void main(String[]args){
    Scanner sim = new Scanner(System.in);
    System.out.println("enter a grade");
    
    int n = sim.nextInt();
   
    
    if ( n>=90 && n<=100){
    System.out.println("A");
    } else if(n>=80 && n<=90){
        System.out.println("B");
         } else if(n>=70 && n<=80){
        System.out.println("C");
         } else if(n>=60 && n<=70){
        System.out.println("D");
         } else if(n>=0 && n<=60){
        System.out.println("E");
    }
    }
}
