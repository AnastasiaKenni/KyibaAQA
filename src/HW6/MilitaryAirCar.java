package HW6;

public class MilitaryAirCar extends AirTransport {
    boolean catapult;
    int numberMissiles;

    MilitaryAirCar(String brand, int power, int maxSpeed, int mass, int sweep, int minlength, boolean catapult, int numberMissiles) {
        super(brand, power, maxSpeed, mass, sweep, minlength);
        this.catapult = catapult;
        this.numberMissiles = numberMissiles;
    }

    public String details() {
        return super.details() + String.format(", Сист. катапультирования: %s, Кол. ракет на борту: %s, Мощность в киловаттах: %s кВ", catapult, numberMissiles, powerKV);
    }

    public String bang() {
        if (numberMissiles > 0) {
            return String.format("Ракета была запущена");
        } else {
            return String.format("Невозможно сделать выстрел");
        }
    }

    public String escape() {
        if (catapult == true) {
            return String.format("Катапультирование прошло успешно");
        } else {
            return String.format("У вас нет такой системы");
        }
    }
}
