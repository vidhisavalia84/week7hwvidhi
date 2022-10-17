package week7;
//Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
//any other alphabet should be invalid entry
import java.util.Arrays;
import java.util.Scanner;
public class Prigramme8 {

    public static void main(String[] args) {
alphabet();
    }



    public static void alphabet() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any alphabet from A to F:  ");

        char city=sc.next().charAt(0);
        if(city=='A'){
            System.out.println("Amreli");

        } else if (city=='B') {
            System.out.println("Bhavnagar");

        } else if (city=='C') {
            System.out.println("Calcutta");
        }
        else if(city=='D') {
            System.out.println("Dubai");
        } else if (city=='E') {
            System.out.println("Erumeli");
        } else if (city=='F') {
            System.out.println("Fatepur");
        }

     else {

            System.out.println("Invalid input");

        }

sc.close();


        }
}