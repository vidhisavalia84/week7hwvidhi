package week7;
/*Write a java program to input student Name, roll No, and three subjects Math, Science and
        English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
        Input, Marks should between 0 to 100”) and find out total, percentage and result.
        If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
        %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format*/
import java.util.Scanner;
public class Programme3 {
    public static void main(String[] args){
Programme3 obj=new Programme3();
obj.marksheet();
    }
    public void marksheet(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student Name: ");
        String name=sc.next();
        System.out.println("Enter roll no: ");
        int rollno=sc.nextInt();
        System.out.println("Enter Maths marks: ");
        int matmarks= sc.nextInt();
        System.out.println("Enter Science marks: ");
        int sciencemark= sc.nextInt();
        System.out.println("Enter English marks: ");
        int englishmark=sc.nextInt();

        if(englishmark>100){
            System.out.println("Invalid input, marka should be betwen 0 to 100");
        }
        else{}
        if(matmarks>100){
            System.out.println("Invalid input, marka should be betwen 0 to 100");



        }
        else
         {}
        if(sciencemark>100){
            System.out.println("Invalid input, marka should be betwen 0 to 100");
        }//else {}

        float total=matmarks+sciencemark+englishmark;
        float percentage=(total/300*100);
       // boolean f1=percentage>35;

       // float precentage=d*100;
        System.out.println(" total marks"+total);
        System.out.println("percentage = "+percentage+"%");
        if(percentage>=35) {
            System.out.println("Result    pass");
        }
            else{
            System.out.println("Result    fail");
        }
            if( percentage>=80){
                System.out.println("Grade:      A+" );}
                else if(percentage>=60){
                System.out.println("Grade:      A"); }
                else if (percentage>=50){
                System.out.println("Grade:      B");
            }
        System.out.println("|------------------------------------------|");
        System.out.println("|               Mark Sheet                 |");
        System.out.println("|__________________________________________|");
        System.out.println("|         Name:         "+name+"               |");
        System.out.println("|         Roll No       "+rollno+"                 |");
        System.out.println("|__________________________________________|");
        System.out.println("|         Subject         Marks            |");
        System.out.println("|         Maths       :   "+matmarks+"               |");
        System.out.println("|         Science     :   "+sciencemark+"               |");
        System.out.println("|         English     :   "+englishmark+"               |");
        System.out.println("|__________________________________________|");
        System.out.println("|         Total       :   "+total+"            |");
        System.out.println("|__________________________________________|");
        System.out.println("|         Percentage :    "+percentage+"            ");
        System.out.println("|         Result     :                     | ");
        System.out.println("|         Grade      :                     |");
        System.out.println("|__________________________________________|");

sc.close();
    }
}
