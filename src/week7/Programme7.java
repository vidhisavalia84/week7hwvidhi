package week7;
import java.util.Scanner;
public class Programme7 {
    public static void main(String[] args){
sales();
    }
    public static void sales(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sales ID:  ");
        sc.nextInt();
        System.out.println("Enter Seller's name:   ");
        sc.next();
        System.out.println("Enter sales amount:    ");
        int salesamount=sc.nextInt();
        System.out.println("Enter basic salary:    ");
        int basicsalary=sc.nextInt();
        if(basicsalary>=50000) {
            int commision=(salesamount*35)/100;
            System.out.println("Sales commision is 35%");
            System.out.println("Commision is:  "+commision);

        }
            else if(basicsalary>=30000) {
                int b=(salesamount*20)/100;

            System.out.println("sales commision is 20%");
            System.out.println("Commision is:  "+b);
        } else if (basicsalary>=20000) {
            int x=(salesamount*10)/100;

            System.out.println("salesamount is 10%");
            System.out.println("Commision is:  "+x);
        } else if (basicsalary>=10000) {
                int y=(salesamount*5)/100;

            System.out.println("salesamount is 5%"+y);
        } else if (basicsalary<=10000) {
            int z=(salesamount*2)/100;
            System.out.println("salesamount is 2%");
            System.out.println("Commision is:  "+z);
        }
            sc.close();
    }
}
