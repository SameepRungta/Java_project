public class base_TC {
public static void main(String[] args){

    try{
    int a = 10, b=0;
     System.out.println(a/b);
        }

    catch(ArithmeticException e){

        System.out.println("Dividing denominator by zero: "+e  );

    }

    System.out.println("Program is Running fine");

    }    
}
