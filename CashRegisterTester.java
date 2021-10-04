import java.util.Scanner;

public class CashRegisterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CashRegister cash = new CashRegister();
		Scanner in = new Scanner(System.in);
		boolean loop = true;
		
		while (loop == true) {
			
			System.out.println("Enter a purchase amount, or -1 to stop: ");
			double x = in.nextDouble();
			if (x == -1) {
				
				break;
			}
			else {
				cash.recordPurchase(x);
				
			}
			
			
		}
		System.out.println("Enter a payment: ");
		double pur = in.nextDouble();
		cash.recievePayement(pur);
		System.out.printf("Your change is: %.2f" , cash.giveChange());
	}

}
