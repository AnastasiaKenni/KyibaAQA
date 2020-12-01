package HW4;

public class HW4 {
    public static void main(String[] args) {
        double randome;
        PC pc1 = new PC("Integer","256","255",2);

        pc1.displayInfoPC();
        pc1.checkLimit();
        pc1.enable();
        pc1.off();
        pc1.checkLimit();

    }
}
