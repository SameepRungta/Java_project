import java.util.*;


class area{

 double lenght;
 double height;

 public void setDim(double lenght, double height){

        this.lenght= lenght;
        this.height= height;   

 }

public double getArea(){

        return lenght*height;

}
}
public class Area_using_CnO{

public static void main(String[] args){
    
Scanner s = new Scanner(System.in);

    double lenght= s.nextDouble();
    double height= s.nextDouble();

  area rectangle = new area();
  rectangle.setDim(lenght,height);
  
 double area = rectangle.getArea();

 System.out.println(area);
}

}

