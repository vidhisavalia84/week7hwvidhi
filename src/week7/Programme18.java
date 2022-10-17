package week7;
//Write a Java program to sum values of an array.
public class Programme18 {
    public static void main(String[] args){
Programme18 obj=new Programme18();
obj.sumOfArray();
    }
    public void sumOfArray(){
        int[] myArray={3,4,5,6,7,8,9,3,7};
        int sum=0;
        for(int i=0;i<myArray.length;i++){
            sum=sum+myArray[i];}

            System.out.println("The sum is:  "+sum);

    }

}
