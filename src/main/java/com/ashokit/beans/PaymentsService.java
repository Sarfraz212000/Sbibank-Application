package com.ashokit.beans;

public class PaymentsService {
   public Ipayments pay;
   public PaymentsService(Ipayments pay) {
	   this.pay=pay;
	  
}
	public void doPayments() {
		
		boolean status = pay.processPyments();
		if (status) {
			System.out.println("procress is successfully executed....");
		}
		else {
			System.out.println("procress is  not successfully executed....");
		}
	}

}
