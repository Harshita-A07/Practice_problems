package JAVA.oops;

class Employee {
    private String name;
    private int age;


    //overloading constructors
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Employee(String name){
        this.name=name;
    }
    public void display(){
        System.out.println("Name: "+name);
        if(age!=0){
           System.out.println("Age: "+age);
        }
        
    }
    public static void main(String[] args) {
        Employee em = new Employee("harsha",22);
        em.display();
        Employee em2 = new Employee("harsha");
        em2.display();

    }

}
