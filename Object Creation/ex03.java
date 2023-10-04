import java.util.Scanner;
class answer {

    int length;
    int breadth;

    public void setDim(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
}
public class ex03 {
    public static void main(String[] args) {
        Scanner Area = new Scanner(System.in);

        answer cr = new answer();

        System.out.print("Enter the length of the rectangle: ");
        int length = Area.nextInt();

        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = Area.nextInt();


        cr.setDim(length, breadth);

        int answer = cr.getArea();
        System.out.println("Area of the rectangle: " + answer);
    }
}


