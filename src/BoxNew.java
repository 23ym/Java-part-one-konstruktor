public class BoxNew {
    double width;
    double height;
    double length;

    BoxNew(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    void  setDimens(double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    double volumeNew() {
        return  width * height * length;
    }
}
