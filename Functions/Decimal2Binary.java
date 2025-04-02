import java.util.Scanner;

public class Decimal2Binary {

    public static void decTobin(int num){
        int Rnum=num;

        int pow=0;
        int Binnum=0;

        while(num<0){
            int rem=num%10;
            Binnum=Binnum+(rem * (int)Math.pow(2, pow));
            pow++;
            num=num/10;
        }
        System.out.println("the Binary number of "+ Rnum + "is" + Binnum);
    }
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Decimal number to convert into Binary");
       int DecNum=sc.nextInt();

       decTobin(DecNum);
    }
}
