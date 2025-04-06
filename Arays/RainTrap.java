package Arays;

public class RainTrap {
    public static int trapWater(int height[]){
       int n=height.length;
       //calculate left max boundary 
       int leftmax[]=new int[n];
       leftmax[0]=height[0];
       for(int i=1; i<n;i++){
        leftmax[i]=Math.max(height[i],leftmax[i-1]);
       }

       //calculate Right max boundary
       int rightmax[]=new int[n];
       rightmax[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--){
        rightmax[i]=Math.max(height[i],rightmax[i+1]);
       }

       int trapWater=0;
       //loop
       for(int i=0;i<n;i++){
       //waterlevel=min(leftmax[i], righrmax[i])
       int waterlevel=Math.min(leftmax[i],rightmax[i]);

       //trapwater=(waterlevel-height)
       trapWater += (waterlevel - height[i]);

    }
    return trapWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
       System.out.println(trapWater(height));
    }
}
