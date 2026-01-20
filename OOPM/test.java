package OOPM;

public class test {
    public static void main(String[] args) {
        bank ac = new bank();
        // ac.password = "1276356";
        ac.setPass("hayyp124525");
        student s1 = new student(124, "sid");
        System.out.println(s1.name+" "+s1.rollNo);
        student s2 = new student(s1);
        System.out.println(s2.name +" "+s2.rollNo);
        human h = new human();
        h.dis();
        healthy hl = new healthy();
        junk j = new junk();
        hl.type();
        j.type();
        bear b = new bear();
        b.leaf();
        b.other();
    }
}
class bank{
    public String username;
    private String password;
    public void setPass(String pwd){
        pwd =password;
    }
}

class student{
    int rollNo;
    String name;

    student(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }
    student( student s1){
        this.rollNo = s1.rollNo;
        this.name =s1.name;
    }
}

//overriding
class animal{
    void dis(){
        System.out.println("just eat");
    }
}
class human extends animal{
    void dis(){
        System.out.println("eat 5 star do nothing");
    }
}

//abstract class
abstract class food {
    void banner(){
        System.out.println("food is essential");
    }
    abstract void type();
}

class healthy extends food{
    void type(){
        System.out.println("green vegetables and salad");
    }
}
class junk extends food {
    void type(){
        System.out.println("pizza burger and fried oily food");
    }  
}


//interface doing multiple inheritance

interface herbivores{
    void leaf();
}
interface carnivores{
    void other();
}

class bear implements herbivores, carnivores{
    public void leaf(){
        System.out.println("can eat veggies");
    }
    public void other(){
        System.out.println("can eat other anim");
    }
}

//testing

class inherit{
    public static void main(String[] args) {
        // vehcial ob1 = new cars();
        // ob1.print1();  error in code 
        vehcial ob2 = new vehcial();
        ob2.print();
    }
}
class vehcial{
    void print (){
        System.out.println("vehicle");
    }
}

class cars extends vehcial{
    void print1(){
        System.out.println("cars");
    }
}