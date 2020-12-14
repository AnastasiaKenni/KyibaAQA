package HW6;

public class LandTransport extends Transport{
    int wheels;
    int fuel;

    LandTransport(String brand, int power, int maxSpeed, int mass, int wheels, int fuel) {
        super(brand, power, maxSpeed, mass);
        this.wheels = wheels;
        this.fuel = fuel;
    }

    public String details () {
        return super.details() + String.format(", Количество колес: %s, Расход топлива: %s л/100км",wheels,fuel);
    }
}
