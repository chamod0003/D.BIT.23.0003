public class ex01 {
    int id;
    String name;
}
class student01{

    public static void main (String [] args){

        ex01 s1=new ex01();
        ex01 s2=new ex01();

        s1.id=1;
        s1.name="sam";

        s2.id=2;
        s2.name="john";

        System.out.println(s1.id+" "+s1.name);
        System.out.println(s2.id+" "+s2.name);

    }
}