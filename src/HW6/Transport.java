package HW6;

public class Transport {
    int power;
    int maxSpeed;
    int mass;
    String brand;
    double powerKV;

    Transport (String brand, int power, int maxSpeed, int mass){
        this.brand = brand;
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.mass = mass;
        powerKV = (power * 0.75);
    }

   /* public void powerKV (){
        powerKV = power * 0.75;
    }*/

    public String details () {
        return String.format("Марка: %s, Мощность: %s л.с., Максимальная скорость: %s км/ч, Масса: %s кг",brand,power,maxSpeed,mass);
    }
}
