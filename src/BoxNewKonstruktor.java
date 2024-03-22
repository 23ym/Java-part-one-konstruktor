public class BoxNewKonstruktor {
        double width;
        double height;
        double length;

    public BoxNewKonstruktor(double width, double height, double length) {
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
