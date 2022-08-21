public class Main {
    public static void main(String[] args) {
        int x = 100; // Начальный баланс
        int y = 2764; // Сумма пополнения
        int z = y / 100;
        int a;
        if (y >= 1000) {
            a = (z + x + y);
        } else {
            a = (x + y);
        }
        System.out.println("Баланс: " + a);
    }
}