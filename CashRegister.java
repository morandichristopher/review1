

public class CashRegister {

private double purchase;
private double payment;

CashRegister(){
	purchase = 0;
	payment = 0;
	
	
}
public void recordPurchase(double pur){
	purchase = purchase + pur;
}

public void recievePayement(double pay) {
	payment = payment + pay;
}
public double giveChange() {
	double change = payment - purchase;
	return change;
	
}


}
