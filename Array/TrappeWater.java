package Array;

public class TrappeWater {
    public static int Water(int height[]){
        int n = height.length;
        //left bound
        int leftMax [] = new int[n];
         leftMax[0] = height[0];

        for(int i =1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        // right bound
        int rightMax [] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i = n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        //water level = min of left and right bound
        int trap=0;
        for(int i =0; i< n ; i++){
            int wl = Math.min(leftMax[i], rightMax[i]);
            //trapwater = (waterlevel - height[i])
            trap = trap + (wl - height[i]);
        }
        return trap;
        
    }
    public static void main(String[] args) {
        int height[] ={4,2,0,6,3,2,5};
        System.out.println(Water(height));
    }
}
