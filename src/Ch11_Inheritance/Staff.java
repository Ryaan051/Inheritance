package Ch11_Inheritance;

public class Staff extends Person{
    String  shift;

    Staff(String name,String tel,int age , String shift){
        super(name,tel,age);
        this.shift=shift;
    }
    void display(){
        super.display();
        System.out.println("Shift: " + shift);
    }

}
