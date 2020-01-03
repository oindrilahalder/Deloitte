package designp;

public class Bank {

	public static void main(String[] args) {
		Payment payment = Payment.getPaymentObject();
				payment.pay(10000);
		Payment payment1 = Payment.getPaymentObject();
				payment1.pay(20000);
		Payment payment2 = Payment.getPaymentObject();
				payment2.pay(14000);

	}

}
