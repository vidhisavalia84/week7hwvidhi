package week7;
//Write a program that tells us input value is number or an alphabet or symbol.
import java.util.Scanner;
public class Programme12 {
    public static void main(String [] args){
Programme12 obj=new Programme12();
obj.inputNumber();
    }
    public void inputNumber(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value from keyboard:  ");
        char ch= sc.next().charAt(0);
        if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')){
            System.out.println("Entered value "+ch+" is character");
        } else if (ch>=0&&ch<=9) {
            System.out.println("Entered value  "+ch+" is number");

        }
        else {
            System.out.println("Entered value  "+ch+" is special character");

        }
sc.close();
    }

}
