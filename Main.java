
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Sports();
        Vehicle v2 = new Normal();
        Vehicle v3 = new Offroading();

        v1.drive();
        v2.drive();
        v3.drive();
    }
}