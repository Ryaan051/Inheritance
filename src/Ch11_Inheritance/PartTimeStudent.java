package Ch11_Inheritance;
public class PartTimeStudent extends Student {
    String mode ;

    PartTimeStudent(){}
    PartTimeStudent(String name,String tel,int age,String stdID,String mode) {
        super(name,tel,age,stdID);
        this.mode = mode;
        System.out.println("PartTimeStudent constructor(with arg)");
    }

    void display(){
        super.display();
        System.out.println("Mode: " + mode);
    }

}
