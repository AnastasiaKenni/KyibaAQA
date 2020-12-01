import java.sql.SQLOutput;

public class AQA2 {
    public static void main(String[] args) {
        int age = 20;
        if (age < 18 || age > 63) {
            System.out.println("кредит не выдаем");
        } else {
            System.out.println("кредит дадим");
        }
// switch case
        String color = "green";
        switch (color) {
            case "red":
                System.out.println("Stop");
                break;
            case "yelow":
                System.out.println("warn");
                break;
            case "green":
                System.out.println("GO");
                break;
            default:
                System.out.println("ты что ввел?");
                break;
        }

        //массивы
        String[] names = {"Рак","Лысенко","Стрельцова","Орлеанская","Бондаловский"};
        //System.out.println(names[3]);

        //while do
        int index = 4;
        boolean isFound = false;
       /* String searchName = "Стрельцова";
        while (index >= 0) {
            System.out.println("попытка номер "+index);
            if (names[index] == searchName){
                System.out.println("найдено по индексу "+index);
                break;
            }
            index--;
        }
        while (index >= 0 && isFound == false) {
            System.out.println("попытка номер "+index);
            if (names[index] == searchName){
                System.out.println("найдено по индексу "+index);
                isFound = true;
            }
            index--;
        }*/
        //do while

       /* do {
            System.out.println("попытка номер "+index);
            if (names[index] == searchName){
                System.out.println("найдено по индексу "+index);
                isFound = true;
            }
            index--;
        } while (index >= 0 && isFound = false);*/

        // for
        for (int i = 0; i <names.length; i++) {
            System.out.println(names[i]);
            }

        //for each
        for (String name:names){
            System.out.println(name);
        }

    }
}

