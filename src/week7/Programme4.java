package week7;

import java.util.Scanner;

public class Programme4 {
    public static void main(String[] args) {
              isLeapYear(1600);
       getDaysInMonth(2,9);

    }

    public static void  isLeapYear(int year) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        year = input.nextInt();
        boolean isLeap = false;

        if (year >= 1 && year <= 9999 && year % 4 == 0) {
            if (year % 100 == 0) {

                if (year % 400 == 0)

                    isLeap = true;
                 else
                    isLeap = false;
                } else isLeap = true;
            } else {
                isLeap = false;
            }

            if (isLeap == true) {
                System.out.println(year + "is a Leap year");
            } else
                System.out.println(year + " is not a leap year");
        }

    public static int getDaysInMonth(int month, int year) {
        Scanner input = new Scanner(System.in);

        int number_Of_DaysInMonth = 0;
        String monthOfName = "Unknown";
        System.out.println("Input a month number: ");
        month = input.nextInt();
        System.out.println("Input a year: ");
        year = input.nextInt();

        switch (month) {

            case 1:
                monthOfName = "January";
                 number_Of_DaysInMonth=31;
                break;
            case 2:
                monthOfName = "Febaruary";
                if ((year % 400 == 0) || (year % 4 == 0) && (year % 100 != 0))
            {
                number_Of_DaysInMonth = 29;}
            else{
                number_Of_DaysInMonth = 28;
            }
            break;

            case 3:
                monthOfName = "March";
                 number_Of_DaysInMonth = 31;
                break;
            case 4:
                monthOfName = "April";
                 number_Of_DaysInMonth = 30;
                break;
            case 5:
                monthOfName = "May";
                 number_Of_DaysInMonth = 31;
                break;
            case 6:
                monthOfName = "June";
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                monthOfName = "July";
                 number_Of_DaysInMonth = 31;
                break;
            case 8:
                monthOfName = "August";
                 number_Of_DaysInMonth = 31;
                break;
            case 9:
                monthOfName = "September";
                 number_Of_DaysInMonth = 30;
                break;
            case 10:
                monthOfName = "October";
                 number_Of_DaysInMonth = 31;
                break;
            case 11:
                monthOfName = "November";
                 number_Of_DaysInMonth = 30;
                break;
            case 12:
                monthOfName = "December";
                 number_Of_DaysInMonth = 31;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + month);
        }
        System.out.println(monthOfName + " " + year + " has  " + number_Of_DaysInMonth + " Days ");
        return number_Of_DaysInMonth;

    }
}










