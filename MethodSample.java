public class MethodSample {
    int id;
    public static void method1(){
        // static method'
        System.out.println("This is static method");
    }
    public void getId(){
        // getter
        System.out.println("The id is "+this.id);
    }
    public void setId(int i){
        //setter
        this.id=i;
    }
    public int method4(int i){

        return i+this.id;
    }
    public static void main(String[] args){
        method1();
        MethodSample obj=new MethodSample();
        obj.setId(5);
        obj.getId();
        System.out.println("The output is "+ obj.method4(5));
    }
}
