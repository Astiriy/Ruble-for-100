public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int sum = 2764;
        int total = sum / 100;
        int result;
        if (sum >= 1000) {
            result = (total + balance + sum);
        } else {
            result = (balance + sum);
        }
        System.out.println("Баланс: " + result);
    }
}
