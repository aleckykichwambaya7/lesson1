import java.util.Scanner; 

public class Main
{
  public static void main (String[]args)
  {


    //name used to stole values in the OutOfMemoryError
    String valuable_name = "dalvin muriuki";
      System.out.println (valuable_name);

    //data types in Java
    /*      String
       boolean-stores true or false 

       char='f' 

       int= 6976
       long=20101201201020120 
       float=201.2322
       double=65.2655464
       Date=''
     */
    // float has the same character as that of double 
    // int should not have character exceeds 4 
    // long int holds a large number 

      valuable_name = "mkuuu";
      System.out.println (valuable_name);
    char gender = 'M';
    char user = 'N';
    boolean Admin = true;
    String fName;
    String lName;
    int age;
    String area;
    // float balance=400.234;
    double amount = 500.00;
      System.out.println ("  Name: " + valuable_name);
      System.out.println ("  Gender: " + gender);
      System.out.println ("  Gender: " + user);
      System.out.println ("Admin: " + Admin);
      System.out.println ("amount: " + amount);
    boolean name = false;
      System.out.println ("  name: " + name);
      int x = 5;
      int y = 6, z = 50;
System.out.println(x + y + z);

      
    //   inputing from the user
    Scanner input=new Scanner(System.in);
    System.out.print("What is your Firs Name :>");
    fName=input.nextLine();
    System.out.print("What is your Second Name :>");
    lName=input.nextLine();
    System.out.print("What is your Age :>");
    age=input.nextInt();
    
    
    System.out.println("Name : "+fName +" "+lName);
    System.out.println("Age :"+age);
    System.out.print("area :"+area);
    area=input.nextLine();
    
    


  }
}
