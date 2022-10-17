package week7;
/*Write a java program to input any two number and ask user to enter their symbol (+, -,
        /, *) find addition, Subtraction, multiplication and division according to their symbol
        (using if else)*/
import java.util.Scanner;
public class Programme10 {
    public static void main(String[] args){
        Programme10 obj=new Programme10();
        obj.calculate();

    }
    public void calculate(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number: ");
        int b= sc.nextInt();
        System.out.println("Enter the operator you want: +  -  %  *");
        char ch=sc.next().charAt(0);
        if(ch=='+'){
            int c=a+b;
            System.out.println("Addition of two numbers is :"+a+" + "+b+" = "+c);

        } else if (ch=='-') {
            System.out.println("Division of two numbers is :"+a+" - "+b+" = "+(a-b));

        } else if (ch=='*') {
            System.out.println("Multiplication of two numbers is :"+a+" * "+b+" = "+(a*b));

        } else if (ch=='%') {
            System.out.println("Addition of two numbers is :"+a+" % "+b+" = "+(a%b));

        }
        else{
            System.out.println("Invalid operator");
        }
sc.close();
    }

}
