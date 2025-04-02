package Arraysss;

public class LrgNSmlValue {
    public static int largestValue(int num[]){
        int Larg=Integer.MIN_VALUE;
        int small=Integer.MAX_VALUE;

        for(int i=0;i<num.length;i++){
            if(Larg < num[i]){
                Larg=num[i];
            }
            if(small>num[i]){
                small=num[i];
            }
        }
        System.out.println("smallest value is"+small);
        return Larg;
    }
    public static void main(String[] args) {
        int num[]={10,157,1,1000,234,456};

        System.out.println("Largest value is"+largestValue(num));
    }
}
