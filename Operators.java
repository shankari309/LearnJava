public class Operators {
    public static int add(int a, int b){
        return a+b;
    }
    public static int sub(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public static float divide(int a, int b){
        if(b==0){
            return 0;
        }
        return a/b;
    }
    public static float modulo(int a, int b){
        if(b==0){
            return 0;
        }
        return a%b;
    }
    public static void main(String[] args) {
        //Arithmetic Operators
        int a=10; // '=' --> Assignment operator
        int b=5;
        System.out.println("ADDING two numbers "+add(a,b));
        System.out.println("SUBTRACTING two numbers "+sub(a,b));
        System.out.println("MULTIPLYING two numbers "+multiply(a,b));
        System.out.println("DIVIDING two numbers "+divide(a,b));
        System.out.println("MODULO two numbers "+modulo(a,b));
        
        // Assignment operators
        a+=5; // literaaly means a=a+5 (here 15)
        //also can be done for -,*,/,%
        System.out.println("Incremented using assignemnt operator "+a);

    }
}
