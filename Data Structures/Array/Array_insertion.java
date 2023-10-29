import java.util.Scanner;

public class Array_insertion {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array");

        int n = sc.nextInt();

        int a[]= new int[n];

        System.out.println("Enter the values in Array");

            for(int i = 0;i<n;i++){

                a[i] = sc.nextInt();

            }
        
        int b[] = new int[n+1];

        System.out.println("Enter the index value of new Element");
        int m=sc.nextInt();
        System.out.println("Enter the new value");
        int p=sc.nextInt();

        for(int i=0;i<n+1;i++){

            if(i<m){
                b[i]=a[i];
            }

            else if(i==m){
            b[i]=p;
            }

            else{
                b[i]=a[i-1];
            }
        }

         System.out.println("Values has been Stored");   
            int j=1;
            for(int i = 0;i<n+1;i++){
                    
                System.out.println("Value "+j+" is: "+b[i]);
                    j++;
            }   

}
}