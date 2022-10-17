package week7;
// Write a java program that tells us that Input number is odd or even?  HINT: use ternary operator (? :)
import java.util.Scanner;
public class Programme1 {
    public static void main(String[] args){
Programme1 obj=new Programme1();
obj.oddEven();
    }
    public void oddEven(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:  ");
        int num=sc.nextInt();
        //int num=12;
      String ouput=(num%2==0) ? "even" : "odd";
        System.out.println("input number is: "+ouput);
        sc.close();
    }
}
