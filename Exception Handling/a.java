public class a {
public static void main(String[] args){

    try{
    int a = 10, b=1;
     System.out.println(a/b);
        }

    catch(ArithmeticException e){

        System.out.println("Dividing denominator by zero: "+e  );

    }

    System.out.println("Program is Running fine");

    }    
}
