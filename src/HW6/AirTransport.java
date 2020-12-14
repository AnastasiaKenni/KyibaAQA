package HW6;

public class AirTransport extends Transport {
    int sweep;
    int minlength;

    AirTransport(String brand, int power, int maxSpeed, int mass, int sweep, int minlength) {
        super(brand, power, maxSpeed, mass);
        this.sweep = sweep;
        this.minlength = minlength;
    }

    public String details () {
        return super.details() + String.format(", Размах крыльев: %s м, Мин. длина взлетной полосы: %s",sweep,minlength);
    }
}
