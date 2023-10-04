public class Main2 {
    public static void main(String [] args){

        AccessModifiersDemo obj=new AccessModifiersDemo();

        obj.defaultVar= 2.2 ;
        obj.protectedVar= true ;
        obj.publicVar=" chamod ";

        System.out.println(" defaulVar "+obj.defaultVar);
        System.out.println(" protectedVar "+obj.protectedVar);
        System.out.println(" publicVar "+obj.publicVar);

        SubclassDemo obj1=new SubclassDemo();
        obj1.displayProtectedVar();

    }
}
