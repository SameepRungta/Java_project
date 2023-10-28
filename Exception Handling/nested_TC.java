
public class nested_TC {
    public static void main(String[] args){
        try{
        int a[] ={1,2,3,4,0};
        System.out.println(a[1]/a[3]);
        

            try{
            System.out.println(a[6]);
            }

            catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is invalid "+e);
            }
        }
        catch(ArithmeticException e){
            System.out.println("Dividing denominator by zero: "+e  );
        }

    }
}
