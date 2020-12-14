package HW6;

import java.util.Scanner;

public class PassengerLandCar extends LandTransport{
    String bodyType;
    int numberPassengers;

    private double allway;
    private double valueoil;
    private int time;

    PassengerLandCar(String brand, int power, int maxSpeed, int mass, int wheels, int fuel, String bodyType, int numberPassengers) {
        super(brand, power, maxSpeed, mass, wheels, fuel);
        this.bodyType = bodyType;
        this.numberPassengers = numberPassengers;
    }

    public String details () {
        return super.details() + String.format(", Тип кузова: %s, Количество пассажиров: %s, Мощность в киловаттах: %s кВ",bodyType,numberPassengers,powerKV);
    }

    private void way (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время пути машины в часах:");
        time = scanner.nextInt();
        allway = time * maxSpeed;
        valueoil = (allway * fuel) / 100;
    }

    public String infoway () {
        way();
        return String.format("За время %s ч, автомобиль %s двигаясь с максимальной скоростью %s км/ч проедет %s км и израсходует %s литров топлива.",time,brand,maxSpeed,allway,valueoil);
    }
}
