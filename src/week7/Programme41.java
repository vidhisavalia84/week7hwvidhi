package week7;

public class Programme41 {
    public static void main(String[] args) {
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2018);
    }
    public static void isLeapYear(int year) {
        boolean result;
        if (year >= 1 && year <= 9999) {
            System.out.println(result = true);
        } else {
            System.out.println(result = false);
        }
        boolean step;

        if (year == (year % 4)) {
            if (year == (year % 100)) {
                step = result;
            }
        }
        if (year == (year % 100)) {
            if (year == (year % 400)) {
                step = result;
            }
        }
        if (year == (year % 400)) {
            step = result;
        } else {
            step = result;
        }
    }

}
