class parent{
    void printString(){
        System.out.println("I am Parent class");
    }
}
class child extends parent{
    void printString(){
        System.out.println("I am child class");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        parent p = new parent();
        child c=new child();
        c.printString();
        p.printString();
    }
}
