public class overloading {

    static int area(int x, int y){
        int rect=x*y;
        return rect;
    }

    static int area(int s){
        int squ=s*s;
        return squ;

    }


    public static void main(String[] args){

        int l = 2;
        int b = 4;
        int s = 3;

       int rect= area(l,b);
       int squ= area(s);

        System.out.println("Area of Rectange is "+rect);
        System.out.println("Area of Square is "+squ);
    }

}
