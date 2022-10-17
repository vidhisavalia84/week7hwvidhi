package week7;
/*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/
import java.util.Scanner;
public class Programme9 {
    public static void main(String []args){

        Programme9 obj=new Programme9();
        obj.cityname();
    }
    public void cityname(){
        System.out.println("Enter any alphabet from A to F:  ");
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        //char ch='A';
        switch (ch){
            case 'A':
                System.out.println("Amreli");
                break;
            case 'B':
                System.out.println("Bhavnagar");
                break;
            case 'C':
                System.out.println("Calcutta");
                break;
            case 'D':
                System.out.println("Delhi");
                break;
            case 'E':
                System.out.println("Erumile");
                break;
            case 'F':
                System.out.println("Fatepur");
                break;
            default:
                System.out.println("Invalid alphabet entered ");
        }
        sc.close();
    }
}
