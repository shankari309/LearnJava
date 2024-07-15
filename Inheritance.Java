class Employee {
    int salary = 50000;
}

class Programmer extends Employee {
    int bonus = 10000;
}

public class Inheritance {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary: " + p.salary);
        System.out.println("Programmer bonus: " + p.bonus);
    }
}
