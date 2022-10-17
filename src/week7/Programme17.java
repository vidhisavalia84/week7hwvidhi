package week7;

import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Programme17 {
    public static void main(String[] args){
Programme17 obj=new Programme17();
obj.sortArray();
    }
    public void sortArray(){
        int[] myArray1={1563,89,1265,2365,785,1265};
        String[] myArray2={"Krishna","Radha","Rukmani","Yamunaji","Kokila"};
        System.out.println("Original numeric array :  "+ Arrays.toString(myArray1));
        Arrays.sort(myArray1);
        System.out.println("Sorted numeric array :"+Arrays.toString(myArray1));

        System.out.println("Original string array :"+Arrays.toString(myArray2));
        Arrays.sort(myArray2);
        System.out.println("Sorted string array : "+Arrays.toString(myArray2));

    }

}
