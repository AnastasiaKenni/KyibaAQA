public class AQA1 {

    public static void main(String args[]) {
        System.out.println("Hello Kyriba");
        int a = 1;
        boolean b = true;
        long c = 123547684;
        double d = 2.1;
        String g = "brugada";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(g);

        double j = 2.13;
        a = (int) j;
        System.out.println(a);

        //переменные
        double param1 = 2;
        double param2 = 5;
        double sum = param1 / param2;
        System.out.println(sum);

        //++
        //--
        int increment = 0;
        increment++;
        System.out.println(increment);
        increment--;
        System.out.println(increment);

        //>
        //<
        //==
        //!=
        //<=
        //>==

        //условные операторы
        int number = -210;
        if (number <0) {
            System.out.println("отрицательный");

        }
        if (number > 0) {
            System.out.println("положительный");
        }
        if (number == 0) {
            System.out.println("НОЛЬ");
        }
        if (number <0) {
            System.out.println("отрицательный");

        } else {
            System.out.println("положительный");
        }
    }
}
