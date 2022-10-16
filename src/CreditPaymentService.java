public class CreditPaymentService {
    public int payment(double kredit, double years, double percentYears) {
        double month = years * 12;
        double percentMonth = (percentYears / 12) / 100;
        double ratio = (percentMonth * Math.pow((1 + percentMonth), month)) / (Math.pow((1 + percentMonth), month) - 1);
        int result;
        result = (int) (kredit * ratio);
        return result;
    }
}
