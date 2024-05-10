package Activities;

public class Activity1 {
    public static void main(String[] args) {
        Car carName = new Car();
        carName.color = "Black";
        carName.Transmission = "Manual";
        carName.make = 2014;
        carName.displayCharacteristics();
        carName.accelarate();
        carName.breaks();
    }
}
