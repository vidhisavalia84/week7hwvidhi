package week7;
// Write a java program to input any year like (ex.2007) and find out if it is leap year or  not?
import java.util.Scanner;
public class Programme2 {
    public static void main(String [] args){
Programme2 obj=new Programme2();
obj.leapyear();
    }
    public void leapyear(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=sc.nextInt();
       // int year=1997;
        if(year%4==0){
            System.out.println("The year "+year+" is leap year");
        }
        else{
            System.out.println("The year "+year+" is not leap year");
        }
sc.close();
    }
}
