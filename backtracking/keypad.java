package backtracking;

public class keypad {
  public static String keys[] = {"","","abc","def","ghi","jkl","mno","pqrs","tu","wxyz"};

    public static void dail(String str, int idx,String combination){
        //base case 
        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char curchar = str.charAt(idx);
        String mapping = keys[curchar -'0'];

        //recursion
        for(int i=0; i<mapping.length(); i++){
            dail(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        dail("23", 0, "");
    }   
}
