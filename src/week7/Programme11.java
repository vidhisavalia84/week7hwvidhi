package week7;
/*Write a java program to print the numbers between 1 to 100 which can be divided by 3
        and 5 separately.*/
public class Programme11 {
    int a[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,
             51,52,53,54,55};
    public static void main(String[] args){
Programme11 obj=new Programme11();
obj.seperatNumber();
   }
   public void seperatNumber(){
      // int a[]=new int[32];
       for (int i=0;i<=a.length;i++)
       {
           //int i1 = 3;
           if(a[i] %03==0){
               System.out.println(a[i]);

           }
           else if (a[i]%5==0) {
               System.out.println(a[i]);

           }
           else {
               //System.out.println("Number is not devided by either 3 or 5");

           }
       }


   }

}

