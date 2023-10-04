public class ex02 {
    int length;
    int Breadth;

    public void setDim (int length,int Breadth){
        this.Breadth=Breadth;
        this.length=length;

    }

    int getArea(){
        return Breadth*length;
    }

    public static void main (String[] args){

        ex02 cr=new ex02();
        cr.setDim(5,10);

        int area= cr.getArea();

        System.out.println("answer is : " + area);




    }


}
