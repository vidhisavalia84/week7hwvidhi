package week7;
/*WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
        salary
        HRA = basic salary 10%
        DA = Basic salary 8%
        TA = Basic salary 9%
        PF= Basic salary 20%
        Gross salary = basic salary + HRA + TA + DA –PF*/
import java.util.Scanner;
public class Programme5 {
    public static void main(String[] args){
        Programme5 obj=new Programme5();
        obj.salarySlip();

    }
    public void salarySlip(){
        Scanner sc=new Scanner(System.in);
        //System.out.println();
        System.out.println("Enter Employee Id: ");
        int empId= sc.nextInt();
        System.out.println("Enter Employee Name: ");
       String name= sc.next();
        System.out.println("Enter basic salary:");
       double basicSalary= sc.nextDouble();

double hra=basicSalary/10;//HRA
        System.out.println(hra);

        double ta=(basicSalary*9)/100;//TA
        //System.out.println(ta);
        double da=(basicSalary*8)/100;//DA
       // System.out.println(da);
        double pf=(basicSalary*20)/100;//PF
        //System.out.println(pf);
        double grosssalary=(basicSalary+hra+ta+da)-pf;//Gross salary

        System.out.println("____________________________________");
        System.out.println("|              Salary  Slip         |");
        System.out.println("|___________________________________|");
        System.out.println("|Employee Id    :"+empId+"                  |");
        System.out.println("|Employee Name  :"+name+"               |");
        System.out.println("|___________________________________|");
        System.out.println("|Basic Salary   :"+basicSalary+"            |");
        System.out.println("|HRA 10%        :"+hra+"            |");
        System.out.println("|TA  8%         :"+ta+"            |");
        System.out.println("|DA  9%         :"+da+"            |");
        System.out.println("|PF -20%       :"+pf+"             |");
        System.out.println("|___________________________________|");
        System.out.println("|Gross Salary   :"+grosssalary+"             |   "     );
        System.out.println("|___________________________________|");

    }
}
