
class circle{

float radius;

public circle(float radius){
 this.radius= radius;
}


public float getRadi(){
return radius;
}

public void setRadi(float radius){
    this.radius=radius;
}

public float getArea(){
float a=(3.14f)*radius*radius;
return a;
}

public float getPerimeter(){
float a=2*3.14f*radius;
return a;
}


}

public class Circle_CnO {
 
    public static void main(String[] args){

        circle c1 = new circle(4);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        
    }

}
