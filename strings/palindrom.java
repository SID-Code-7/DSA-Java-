package strings;
public class palindrom {
    public static void main(String[] args) {
        String str = "racecar";
        int n = str.length();
        boolean flag=false;
        for(int i=0;i<n/2; i++){
            if(str.charAt(i)==str.charAt(n-1-i)){
                flag=true;
            }
        }
        if(flag==true){
            System.out.println("yes it is a palindrom");
        }
        else{
            System.out.println("not a palindrom");
        }
    }

}
