import java.util.Scanner;

public class Array_creation{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array");

        int n = sc.nextInt();

        int a[]= new int[n];

        System.out.println("Enter the values is Array");

            for(int i = 0;i<n;i++){

                a[i] = sc.nextInt();

            }
         sc.close();
         System.out.println("Values has been Stored");   
            int j=1;
            for(int i = 0;i<n;i++){
                    
                System.out.println("Value "+j+" is: "+a[i]);
                    j++;
            }    
            
    }

}