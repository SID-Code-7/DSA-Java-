package backtracking;

// one more formula for linear time complexit
//its like permutation arrangment == (n-1 + m-1)!/(n-1)1*(m-1)!
// for 3x3 == 3-1 +3-1 !/3-1! * 3-1! == 6

public class gridways{
    public static int grids(int i,int j,int n,int m){
        //base case 
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n || j==m){//boundary ke paar
            return 0;
        }
        //kaam
        int w1 = grids(i+1, j, n, m);//down
        int w2 = grids(i, j+1, n, m);//right
        return w1+w2;
    }
    public static void main(String[] args){
        int n=3,m=3;
       System.out.print( "total ways = "+grids(0,0,n,m));
    }
}