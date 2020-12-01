package HW4;

public class PC {
    String processor;
    String ran;
    String hd;
    int limit;
    double random1;
    double random2;

    //todo конструктор на 4 параметра
    PC (String processor, String ran, String hd, int limit) {
        this.processor = processor;
        this.ran = ran;
        this.hd = hd;
        this.limit = limit;
    }

    //todo метод описания, т.е. все полей

    void displayInfoPC (){
        System.out.println("Процессор: "+processor);
        System.out.println("Оперативка: "+ran);
        System.out.println("Жесткий диск: "+hd);
        System.out.println("Ресурс полных циклов работы: "+limit);
    }

    //todo вкл. если при включении при рандоме будет 2 и более, то будем включать комп, при другом значении комп сгорает

    void enable () {
        random1 = (Math.random() * 2) + 1;
        if (limit > 0 & random1 >= 2) {
            System.out.println("Компьютер включен");
            limit--;
        } else {
            System.out.println("Компьютер сгорел");
            limit = -1;
        }
    }


    //todo выкл. если при выключении при рандоме будет меньше 2, то будем выключать комп, при другом значении комп сгорает
      void off (){
              random2 = (Math.random()*2)+1;
        if (limit>0 & random2 < 2) {
            System.out.println("Компьютер выключен");
            limit--;
        } else {
            System.out.println("Компьютер сгорел");
            limit = -1;
        }
    }


        /*todo limit. За каждую попытку включения и выключения будем вычитать значение из переменной лимит
        и если лимит будет превышен (когда попыток 0, а мы еще раз вызываем ресурс) будем выводить сообщение что лимит превышен*/
        void checkLimit () {
            if (limit >0){
                System.out.println("Компьютер еще можно включть или выключить");
        } else if (limit == 0) {
                System.out.println("Компьтер уже нельзя включить или выключить иначе он сгорит");
            } else {
                System.out.println("Компьютер уже сгорел");
            }


}}
