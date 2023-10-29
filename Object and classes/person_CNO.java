
class person{

     String name;
     int age;

        public void setDetail(String name, int age){

            this.name= name;
            this.age =age;

        }

        public String getName(){

            return name;
        }

        public int getAge(){

            return age;
        }
}


public class person_CNO {
public static void main(String[] args){

person p1 = new person();
p1.setDetail("Sameep",21);

person p2 = new person();
p2.setDetail("Daksh",21);

System.out.println(p1.getName());
System.out.println(p1.getAge());
System.out.println(p2.getName());
System.out.println(p2.getAge());


}
}
