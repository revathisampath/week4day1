package week4day1;

public class Bank1 extends SBI {

	@Override
	public void bankBalance() {
		// TODO Auto-generated method stub
		System.out.println("bankBalance");
	}

	@Override
	public void maximumLoanAmount() {
		// TODO Auto-generated method stub
		System.out.println("maximumLoanAmount");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bank1 bnk = new Bank1();
        bnk.bankBalance();
        bnk.maximumLoanAmount();
        
        SBI bnk1 = new Bank1();
        bnk1.ITLoan();
        bnk1.bankBalance();
        bnk1.maximumLoanAmount();
        
	}

	

}
