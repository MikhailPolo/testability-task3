public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double k = 1_000_000; // сумма кредита
        double y = 3; // количество лет кредита
        double b = 9.99; // процентная ставка
        double payment = service.payment(k, y, b);
        System.out.println(payment);
    }
}