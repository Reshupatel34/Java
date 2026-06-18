public class OOPS {
    public static void main(String[] args) {
        Pen p=new Pen();
        p.setColor("Green");
        System.out.println(p.color);
        p.setTip(3);
        System.out.println(p.tip);

    }
}


class Pen{
    String color;
    int tip;
//      set new colour
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
}