package Recursion;

public class duplicate {
    public static void remove(String str , int idx,StringBuilder newStr,boolean map[]){
        //base case
        if(idx == str.length()){
            System.out.println(newStr);
            return;
        }

        //kaam
        char current = str.charAt(idx);
        if(map[current-'a'] == true){
            //means duplicate
            remove(str, idx+1, newStr, map);
        }
        else{
            map[current-'a'] = true;
            remove(str, idx+1, newStr.append(current), map);
        }

    }
    public static void main(String[] args) {
        String str = "acropolis";
        remove(str, 0,new StringBuilder(""), new boolean[26]);
    }
}
