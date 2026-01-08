package strings;

public class shortestPath {
    public static float distance(String str){
        int x=0,y=0;
        for(int i=0;i<str.length();i++){
            char dir = str.charAt(i);
            if(dir =='s'){
                y--;
            }
            else if(dir == 'n'){
                y++;
            }
            else if(dir == 'e'){
                x++;
            }
            else{
                x--;
            }
            
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
        String str ="wessnwwenswnens";
        System.out.println(distance(str));
    }
}
