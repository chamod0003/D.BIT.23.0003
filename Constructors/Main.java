class Student{
    private String name;
    private int age;
    private char grade;
    public Student (String name,int age,char grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
    public Student(){
        this.name="name";
        this.age=1;
        this.grade='A';
    }
    public void displayInfo(){
        System.out.println("name "+name);
        System.out.println("age "+age);
        System.out.println("grade "+grade);
    }
}
public class Main{
    public static void main (String [] args){
        Student obj=new Student("chamod",20,'B');
        System.out.println("st 1 info");
        obj.displayInfo();

        Student obj1=new Student("kaji",21,'A');
        System.out.println("st 2 info");
        obj1.displayInfo();
    }
}