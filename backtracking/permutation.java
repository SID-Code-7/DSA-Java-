package backtracking;
 
//total ways of permutation or total permutations == n!
class permutation{
    public static void perm(String str,String ans){
        //base case
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        //kaam
        for(int  i=0; i<str.length();i++){
            char curr = str.charAt(i);
            //abcde = ab+de == abde means c remove by this formula
            String newstr = str.substring(0,i)+str.substring(i+1); 
            perm(newstr, ans+curr);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        perm(str, "");
    }
}