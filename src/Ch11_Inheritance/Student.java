package Ch11_Inheritance;
public class Student extends Person{
    //variables
    String  stdID;

    //constructors
  Student(){}
    Student (String name, String tel, int age,
             String stdID) {
        super(name, tel , age);  // call superclass constructor
        this.stdID = stdID;
        System.out.println("Student constructor(with arg)");
    }
    //methods
    void display(){
        super.display(); //call superclass method
        System.out.println("Student ID: " + stdID);
    }
}
