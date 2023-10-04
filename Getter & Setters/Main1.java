class Student1{
    private String name;
    private int age;
    private char grade;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){

        return name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public char getGrade() {

        return grade;
    }

    public void setGrade(char grade) {

        this.grade = grade;
    }

    public void DisplayInfo(){
        System.out.println(" Name " +name);
        System.out.println(" Age " +age);
        System.out.println(" Grade " +grade);
    }
}
public class Main1{
    public static void main(String [] args){
        Student1 obj=new Student1();
        obj.setName(" chamod ");
        obj.setAge( 20 );
        obj.setGrade('A');
        obj.DisplayInfo();

        Student1 obj1=new Student1();
        obj1.setName(" kajini ");
        obj1.setAge( 20 );
        obj1.setGrade('A');
        obj1.DisplayInfo();

        //System.out.println("st 01"+obj.getName());
        //System.out.println("st 01"+obj.getAge());
        //System.out.println("st 01"+obj.getGrade());

        //System.out.println("st 02"+obj1.getName());
        //System.out.println("st 02"+obj1.getAge());
        //System.out.println("st 02"+obj1.getGrade());
    }
}