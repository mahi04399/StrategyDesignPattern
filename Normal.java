import Strategy.NormalDrive;

public class Normal extends Vehicle {
    public Normal () {
        super (new NormalDrive());
    }
}
