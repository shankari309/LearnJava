public class MethodOverloading {
    public int add(int a, int b){
        return a+b;
    }
    public int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args){
        MethodOverloading obj=new MethodOverloading();
        int a=5;
        int b=10;
        int c=15;
        System.out.println("Sum of a and b : "+obj.add(a,b));
        System.out.println("Sum of a,b and c : "+obj.add(a,b,c));
    }
    
}
