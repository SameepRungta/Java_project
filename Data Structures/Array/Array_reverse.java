import java.util.Scanner;
public class Array_reverse {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
    
            System.out.println("Enter the Size of the Array");
    
            int n = sc.nextInt();
    
            int a[]= new int[n];
    
            System.out.println("Enter the values in Array");
    
                for(int i = 0;i<n;i++){
    
                    a[i] = sc.nextInt();
    
                }

            System.out.println("Values has been Stored");       
            
            int b[] = new int[n];
                int r = n;
            for(int i=0;i<n;i++){

                b[i] = a[r-1];
                r=r-1;
            }

             
                int j=1;
                for(int i = 0;i<n;i++){
                    System.out.println("Value "+j+" is: "+a[i]);
                        j++;
                }  

                System.out.println("~~reverse~~");

                int u=1;
                for(int i = 0;i<n;i++){
                    System.out.println("Value "+u+" is: "+b[i]);
                        u++;
                }
    }

}
