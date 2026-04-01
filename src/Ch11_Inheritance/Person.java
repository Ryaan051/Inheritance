package Ch11_Inheritance;
public class Person {
    private String name , tel ;
   private int age;
    //constructor
    Person(){
        this.name="Ali abdirahman";
        this.tel="123";
        this.age=23;
        System.out.println("Person constructor(no arg)");
    }
    Person(String name,String tel,int age)
    {
        this.name=name;
        this.tel=tel;
        this.age=age;
        System.out.println("Person constructor(with arg)");
    }

    void display()
    {
        System.out.println("Name: "+name);
        System.out.println("Tel: "+tel);
        System.out.println("Age: "+age);
    }
}
