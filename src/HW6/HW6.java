package HW6;

import static java.lang.System.*;
import java.util.Scanner;

public class HW6 {

    public static void main(String[] args) {

        LandTransport bmw = new LandTransport("bmw",85,250,570,4,77);
        PassengerLandCar qqw = new PassengerLandCar("volvo",89,200,780,6,55,"хз",6);
        FreightLandCar belaz = new FreightLandCar("Belaz",89,125,770,8,77,40);
        CivilAirCar boing = new CivilAirCar("Boing",880,12000,99900,450,100,47,false);
        MilitaryAirCar sokol = new MilitaryAirCar("WWS",555,44000,9000,50,100,true,0);

       //out.println(bmw.details());
      // out.println(qqw.details());

        //out.println(qqw.infoway());


       // out.println(belaz.occupancyPayload());
      //  out.println(boing.occupancyPassenger());
        out.println(sokol.escape());
        out.println(sokol.bang());

    }

}
