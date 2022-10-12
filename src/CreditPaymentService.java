public class CreditPaymentService {
    public int payment(double k, double y, double b) {
        double m = y * 12;
        double bb = (b / 12) / 100;
        double z = 1 + bb;
        double zm = Math.pow(z,m);
        double kf = (bb * zm)/(zm - 1);
        int result;
        result = (int) (k * kf);
        return result;
    }
}
