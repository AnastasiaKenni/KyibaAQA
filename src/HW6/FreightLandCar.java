package HW6;

import java.util.Scanner;

public class FreightLandCar extends LandTransport{
    int payload;
    int weight;


    FreightLandCar(String brand, int power, int maxSpeed, int mass, int wheels, int fuel, int payload) {
        super(brand, power, maxSpeed, mass, wheels, fuel);
        this.payload = payload;
    }

    public String details () {
        return super.details() + String.format(", Грузоподъёмность: %s n, Мощность в киловаттах: %s кВ",payload,powerKV);
    }

    public String occupancyPayload (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес загружаемого груза:");
        weight = scanner.nextInt();
        if (weight <= payload) {
            return String.format("Грузовик загружен");
        } else {
            return String.format("Вам нужен грузовик побольше");
        }
    }

}
