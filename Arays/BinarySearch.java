package Arays;

public class BinarySearch {
    public static int binary(int numbers[], int key){
       int  start = 0 , end = numbers.length-1;
       
       while(start <=end){
        int mid = (start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]<key){
            start=mid+1;
        }
        else{
            end =mid-1;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,10,60};
        int key= 10;
        int index = binary(numbers, key);

        if(index == -1){
            System.out.println("KEY NOT FOUND");
        }
        else{
            System.out.println("key found at"+index);
        }

    }
}
