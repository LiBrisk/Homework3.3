public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int monthlyPayment12 = service.calculate (12, 1000000, 9.99);
        System.out.println("Ежемесячный платеж (12 мес): " + monthlyPayment12);
        System.out.println();
        int monthlyPayment24 = service.calculate (24, 1000000, 9.99);
        System.out.println("Ежемесячный платеж (24 мес):  " + monthlyPayment24);
        System.out.println();
        int monthlyPayment36 = service.calculate (36, 1000000, 9.99);
        System.out.println("Ежемесячный платеж (36 мес): " + monthlyPayment36);
    }
}