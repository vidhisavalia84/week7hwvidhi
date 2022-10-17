package week7;

public class Person {
    String firstName;
    String lastName;
    int age;

    public static void main(String[] args){
              Person obj=new Person();
               String s=obj.getFirstName();
              System.out.println(s);
              String s1=obj.getLastName();
        System.out.println(s1);
        int x=obj.getAge();
        System.out.println(x);
        String s3=obj.setFirstName("panth");//solve it
        System.out.println(s3);
       String s4= obj.setLastName("Savalia");
        System.out.println(obj.setLastName("Savalia"));
       int x1= obj.setAge(152);
        System.out.println(x1);
        boolean b=obj.isTeen();
        System.out.println(b);
        String s5=obj.getFullName();
        System.out.println(s5);

    }//Method named getFirstName without any parameters, it needs to return the value of the firstName feild
    public String getFirstName(){
        String firstName="Vidhi";
        return firstName;
    }
//*Method named getLastName without any parameters, it needs to return the value of the lastName
//field.
public String getLastName(){
    String lastName="Patel";
    return lastName;
}
//*Method named getAge without any parameters, it needs to return the value of the age field.
public int getAge(){
        int age=27;
        return age;
}
//*Method named setFirstName with one parameter of type String, it needs to set the value of the
//firstName field.
    public String setFirstName(String firstName){
        this.firstName =firstName;
        return firstName;

    }
//*Method named setLastName with one parameter of type String, it needs to set the value of the
//lastName field.

public String setLastName(String lastName){
        String name1=lastName;
        return name1;
}
//*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
//the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
public int  setAge(int age) {
    //int a = age;
    this.age = age;
    return age;}
    //*Method named isTeen without any parameters, it needs to return true if the value of the age field is
    //greater than 12 and less than 20, otherwise, return false.
public boolean isTeen(){
    if(age>12 && age<20){
        return true;
    }
    return false;
    }

public String getFullName(){
        if(firstName.isEmpty()){
            return lastName;
        }
        if(lastName.isEmpty()){
            return firstName;
        }
        if(firstName.isEmpty()&&lastName.isEmpty()){
            return "  ";
        }
        else {
            return firstName+"  "+lastName;
        }
}



}
















