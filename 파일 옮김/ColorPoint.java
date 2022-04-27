public class ColorPoint extends point {
    private String color;

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.println(color);
        showPoint(); //Point 클래스의 showPoint()
    }
}
