package Array;

public class stocks {
    public static int Stock(int[] price){
        int Buy = Integer.MAX_VALUE;
        int Pmax = 0;

        for(int i =0; i<price.length; i++){
            if(Buy<price[i]){   // buy store smallest
                int profit = price[i] - Buy;
                Pmax = Math.max(Pmax, profit);
            }
            else{
                Buy = price[i];
            }

        }
        return Pmax;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(Stock(price));
    }
}
