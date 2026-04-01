package Ch11_Inheritance;

public class Teacher extends Person{
    //variables
    double salary;
    Teacher(String name, String tel, int age, double salary) {
        super(name, tel, age);
        this.salary = salary;
    }

    //

//    @Override
//    public String toString() {
//        return "Teacher{" +
//                "name='" + name + '\'' +
//                ", tel='" + tel + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }

    void display(){
        super.display();
        System.out.println("Salary: " + salary);
    }
}
