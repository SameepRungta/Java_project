import java.util.*;

public class Student_CNO {

    public static void main(String[] args) {
    
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Roll no");
        int roll = s.nextInt();
        s.nextLine(); // Consume the newline left-over
        
        System.out.println("Enter Name");
        String name = s.nextLine();

        System.out.println("Enter Course");
        String course = s.nextLine();

        
        System.out.println("Enter Marks for 3 subject");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        student s1 = new student();
        s1.setDetails(roll, name, course);
            int tt=s1.total(a,b,c);
        System.out.println("Total marks is: "+tt);
    
        System.out.println("Average is: "+s1.average(tt));
            
        s1.grade(s1.average(tt));

    }
}

class student{

    int roll;
    String name;
    String course;

    int m1,m2,m3;

    public void setDetails(int roll,String name,String course){

        this.roll = roll;
        this.name= name;
        this.course = course;

    }

    public int total(int m1,int m2,int m3){

        int t= m1+m2+m3;
        
        return t;

    }

    public double average(int tt){

        double avg=0;
        avg= tt/3.0 ;

        return avg;

    }

    public void grade(double avg){

      double g= avg;  

        if(g>=70){
            System.out.println("Grade is A");
        }

        else if(g>=60 && g<70){
            System.out.println("Grade is B");
        }

        else if(g>=50 && g<60){
            System.out.println("Grade is C");
        }

        else if(g>=40 && g<50){
            System.out.println("Grade is D");
        }

        else if(g<40){
            System.out.println("Grade is F");
        }

        else {
            System.out.println("Error");
        }

       
    }

}
