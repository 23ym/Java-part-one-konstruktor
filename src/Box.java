public class Box {
    double width;
    double height;
    double length;

    Box() {
        width = 10;
        height = 10;
        length = 10;
    }

    void  setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volume() {
        return  width * height * length;
    }
}
