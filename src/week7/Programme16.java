package week7;
import java.util.Scanner;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”
public class Programme16 {
    public static void main(String[] args){
     Programme16 obj=new Programme16();
     obj.checkNumber();


    }

public void checkNumber(){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number:  ");
    int num=sc.nextInt();
    if(num<0){
        System.out.println("Entered number is Negative:  ");
    } else if (num>0) {
        System.out.println("Entered number is Positive");
    }
    else {
        System.out.println("entered number is Zero");
    }
sc.close();
}





}