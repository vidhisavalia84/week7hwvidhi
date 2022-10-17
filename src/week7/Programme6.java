package week7;
//Write a java program to input any number and find out if it’s odd or even
import java.util.Scanner;
public class Programme6 {
    public static void main(String[] args){
        Programme6.findOddEven();

    }
    public static void findOddEven(){
      Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number:  ");
        int a= sc.nextInt();
        if(a%2==0){
            System.out.println("The number "+a+" is even number");
        }
        else {
            System.out.println("The number "+a+" is odd number");
        }
        sc.close();
    }
}
