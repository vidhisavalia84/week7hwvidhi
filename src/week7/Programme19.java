package week7;
//Write a Java program to calculate the average value of array elements.
public class Programme19 {
    public static void main(String[] args) {
        Programme19 obj = new Programme19();
        obj.averageValueOfArray();

    }

    public void averageValueOfArray() {
        int[] myArray = {10, 45, 64, 98};
        int sum = 0;
        for (int i = 0; i <= myArray.length; i++) {
            sum = sum + myArray[i];


            double average = sum / myArray.length;
            System.out.println("Everage value of array elements is: " + average);
        }

    }

}