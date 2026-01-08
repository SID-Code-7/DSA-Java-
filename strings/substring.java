package strings;
public class substring {
    public static void sub(String str, int si,int ei){
        String subs="";
        for(int i=si;i<ei;i++){
            subs+=str.charAt(i);
        }
        System.out.println(subs);
    }
    public static void main(String[] args) {
        String str="helloworld";
        System.out.println(str.substring(0, 5));
        sub(str, 0, 5);
    }
}
