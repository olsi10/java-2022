class point {
    private final int x;
    private final int y; //한 점을 구성하는 x, y 좌표

    public point() {
        this.x = this.y = 0;
    }

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /*    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }
*/

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class colorPoint extends point {
    private final String color;

//    public void setColor(String color) {
//        this.color = color;
//    }

    public colorPoint(int x, int y, String color) {
        super(x, y); //Point 생성자의 Point(x, y)를호출
        this.color = color;
    }

    public void showColorPoint() {
        System.out.println(color);
        showPoint(); //Point 클래스의 showPoint()
    }
}



public class ColorPointEx {
    public static void main(String[] args) {
        point p = new point();
       // p.set(1,2);
        p.showPoint();

        colorPoint cp = new colorPoint(5, 6, "blue");
        //Color Point(int x, int y, String Color
        //cp.set(3,4);
        //cp.setColor("red");

        cp.showColorPoint();
    }
}



