import java. util.*;
public class Prime{
    public static boolean isprime(int n){
        if(n==1 || n<1){
            return false;
        }
        if(n==2){
            return true;
        }
        for(int i=2; i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter any num");
       int n= sc.nextInt();
       boolean ans =isprime(n);
       if (ans==true){
        System.out.println("the number is prime");
       }
       else{
        System.out.println("the number is not prime");
    
       }

    }  
       
}