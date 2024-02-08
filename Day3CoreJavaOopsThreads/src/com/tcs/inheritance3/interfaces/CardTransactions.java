package com.tcs.inheritance3.interfaces;

public class CardTransactions {

	public static void main(String[] args) {
		
		
		//CardIface iface = new CardIface();
		CardIface iface = null;
		
		iface = new Card();
		iface.swipe(12000);
		
		iface = new HDFCVisaDebitCard(12345678, "03/25", 919, "John Doe", 4536, 500000);
		iface.swipe(12000);
		
		iface = new ICICIMasterCreditCard(32323232, "02/27", 999, "Jane Doe", 4343, 200000);
		iface.swipe(35000);
		
		HDFCVisaDebitCard hdfc = (HDFCVisaDebitCard) iface;
		ICICIMasterCreditCard icici = (ICICIMasterCreditCard) iface;
		
		//Object obj = new HDFCVisaDebitCard(12345678, "03/25", 919, "John Doe", 4536, 500000);
		//System.out.println(obj);
		
//		//Card card = new Card();
//		Card card = null;
//		card = new HDFCVisaDebitCard(12345678, "03/25", 919, "John Doe", 4536, 500000);
//		card.swipe(15000);
//		
//		card = new ICICIMasterCreditCard(32323232, "02/27", 999, "Jane Doe", 4343, 200000);
//		card.swipe(25000);
//		
//		
//////		HDFCVisaDebitCard hdfc = new HDFCVisaDebitCard(12345678, "03/25", 919, "John Doe", 4536, 500000);
//////		//HDFCVisaDebitCard hdfc = new HDFCVisaDebitCard();
//////		System.out.println(hdfc);
//////		
//////		ICICIMasterCreditCard icici = new ICICIMasterCreditCard(32323232, "02/27", 999, "Jane Doe", 4343, 200000);
//////		System.out.println(icici);
//////		
//////		//hdfc.swipe(10000);
//////		//icici.swipe(2300);
//////		
//////		// Object obj = new String("Ola"); -> Creates an object of String Class, as Object is a parent class
////		
////		Card card = new HDFCVisaDebitCard(12345678, "03/25", 919, "John Doe", 4536, 500000);
////		card.swipe(12000);
////		
////		//card = new Card();
////		//card.swipe(25000);
////		
////		card = new ICICIMasterCreditCard(32323232, "02/27", 999, "Jane Doe", 4343, 200000);
////		card.swipe(15000);
	}

}
