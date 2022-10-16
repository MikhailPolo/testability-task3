public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double kredit = 1_000_000; // сумма кредита
        double years = 1; // количество лет кредита
        double percentYears = 9.99; // процентная ставка
        double payment = service.payment(1_000_000, 1, 9.99);
        System.out.println(payment);

        payment = service.payment(1_000_000, 2, 9.99);
        System.out.println(payment);

        payment = service.payment(1_000_000, 3, 9.99);
        System.out.println(payment);
    }
}