package OOPM;

public class complex {
    int real;
    int img;
    complex(int r,int i){
        real = r;
        img = i;
    }

    public static complex add(complex a, complex b){
        return new complex(a.real+b.real , a.img+b.img);
    }
    public static complex diff(complex a ,complex b){
        return new complex((a.real-b.real),(a.img-b.img));
    }

    void print(){
        if(real == 0 && img !=0){
            System.out.println(img+"i");
        }
        else if(img == 0 && real !=0){
            System.out.println(real);
        }
        else {
            System.out.println(real+"+"+img+"i");
        }
    }
    
    public static void main(String[] args) {
       complex c = new complex(3, 10);
       complex d = new complex(10,22);
       complex e = add(c, d);
       e.print();
       complex f = diff(c, d);
       f.print();
    }
}
