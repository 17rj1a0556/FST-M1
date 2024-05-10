package Activities;

public class Car {
    String color;
    String Transmission;
    int make;
    int tyres;
    int doors;
    Car() {
       tyres = 4;
         doors = 4;
    }
    public void displayCharacteristics()
    {
        System.out.println(color);
        System.out.println(Transmission);
        System.out.println(make);
        System.out.println(doors);
        System.out.println(tyres);

    }

    public void accelarate(){
        System.out.println("Car is moving forward");
    }
    public void breaks(){
        System.out.println("Car has stopped");
    }

}
