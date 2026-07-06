
class Human{
    String name;
    Human(){

    }
    Human(String name){
        this.name=name;
    }
}

class Student extends Human{
    int sid;
    Student()
    {

    }
    Student(int sid){
        this.sid = sid;
    }
    Student(int sid,String name){
        super(name);
        this.sid=sid;
    } 
}
class Male extends Student{
    int age;
    Male(){
        super();
    }
    Male(int age){
        this.age=age;
    }
}
class Female extends Student{
    int age;
    Female(int age,int sid){
        super(sid);
        this.age=age;
    }
}

public class InnerMultilevelInheritance {

    public static void main(String[] args) {
        Student s = new Student(101, "Dhiraj");
        Male m = new Male(10);
        Female f = new Female(11,181);
        System.out.println(s.name);
        System.out.println(m.sid);
        System.out.println(m.age);

    }
}