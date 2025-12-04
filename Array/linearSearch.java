package Array;

public class linearSearch {
    public static int search(String menu[], String k){
        for(int i =0; i< menu.length; i++){
            if(menu[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
     String menu[] ={"samosa","kachori","vadapav","noodles","pasta","sandwhich"};
     String k ="pasta";
     int index = search(menu, k);
     System.out.println("The index is : "+index);
    }
}
