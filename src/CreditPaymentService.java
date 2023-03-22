public class CreditPaymentService {
    public int calculate (int month, int creditSum, double percent) {
        double monthPercent = percent / 100 / 12;
        //double monthlyPayment = creditSum * (monthPercent * (1 + monthPercent) ** / ((1 + monthPercent) - month - 1));
        double monthlyPayment = creditSum * ((monthPercent * Math.pow(1 + monthPercent, month)) / (Math.pow(1 + monthPercent, month) - 1));
        return (int) monthlyPayment;
    }

}
