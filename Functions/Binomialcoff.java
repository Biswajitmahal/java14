import java.util.*;

public class Binomialcoff{
    public static int factorial( int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact=fact*i;

        }
        return fact;
    }

    public static int binomcoff(int n, int r){
        int a= factorial(n);
        int b= factorial(r);
        int c= factorial(n-r);

        int value= a/(b*c);
        return value;
    }

    public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
      System.out.println("Value of N");
      int n = sc.nextInt();
      System.out.println("Value of R");
      int r = sc.nextInt();

      System.out.println("The binomial coff is"+binomcoff(n,r));
    }
}