package week4day1;

public class Bank implements CIBIL , PNB {


	public void cibilscore() {
		// TODO Auto-generated method stub	
		System.out.println("cibilscore");
	}

    public void maximumLoanAmount() {
	    // TODO Auto-generated method stub
    	System.out.println("maximumLoanAmount");
}

    public void creditScore() {
	    // TODO Auto-generated method stub
    	System.out.println("creditScore");
}

    public void minimumBalance() {
	   // TODO Auto-generated method stub
    	System.out.println("minimumBalance");
	}
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	Bank obj = new Bank();
    	obj.cibilscore();
    	obj.maximumLoanAmount();
    	obj.creditScore();
    	obj.minimumBalance();
    	
    	 CIBIL obj1 = new Bank();
    	 obj1.cibilscore();
    	
    	 PNB obj2 = new Bank();
    	 obj2.maximumLoanAmount();
    	 obj2.creditScore();
    	 obj2.minimumBalance();
    }
}
