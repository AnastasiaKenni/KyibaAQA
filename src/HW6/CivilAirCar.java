package HW6;

import java.util.Scanner;

public class CivilAirCar extends AirTransport{
    int numberPassengers;
    boolean businessClass;

    int people;

    CivilAirCar(String brand, int power, int maxSpeed, int mass, int sweep, int minlength, int numberPassengers, boolean businessClass) {
        super(brand, power, maxSpeed, mass, sweep, minlength);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;
    }
    public String details () {
        return super.details() + String.format(", Количество пассажиров: %s, Наличие бизнес класса: %s, Мощность в киловаттах: %s кВ",numberPassengers,businessClass,powerKV);
    }

    public String occupancyPassenger () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество пассажиров:");
        people = scanner.nextInt();
        if (people <= numberPassengers) {
            return String.format("Люди загружены на борт");
        } else {
            return String.format("Люди не помещаются на борту. Вам нужен самолет побольше");
        }
    }

}
