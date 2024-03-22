//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BoxNew box = new BoxNew(10, 15, 20);
        System.out.println(box.volumeNew());
        BoxNew box2 = new BoxNew(30, 30, 30); // Ctrl + P
        System.out.println(box2.volumeNew());
    }
}