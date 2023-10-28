
public class userdefine_exception {

    public static int area(int l, int b) throws NegativeeDimensionException
    {

        if(l<0||b<0){
            throw new NegativeeDimensionException();
        }
        
        return l*b;
    }

    public static void meth1() throws NegativeeDimensionException{
        System.out.println("Area of rectangle is: "+ area(5,-10));
    }

    public static void main(String[] args)  {
    try{ meth1();}
    
    catch(NegativeeDimensionException e){
        System.out.println(e);
    }
    
    }

}


class NegativeeDimensionException extends Exception{

    public String toString(){
        return "The value is in negative";
    }

}