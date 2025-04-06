package Arays;
public class Pairs {
    public static void pairs(int numbers[]){
        int pairs=0;
        for (int i=0; i<numbers.length;i++){
            int curr=numbers[i];
            

            for(int j=i+1; j<numbers.length;j++){
                System.out.print("("+curr+","+numbers[j]+")");
                pairs++;
            }
            System.out.println();
        }
        System.out.println("pairs are"+pairs);
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50};
        pairs(numbers);
    }
}
