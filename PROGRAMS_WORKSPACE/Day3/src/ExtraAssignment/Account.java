package ExtraAssignment;

public class Account implements AccountInter {

	private int accNo;
	private String name;
	private double accBal;

	public Account() {
		super();
	}

	@Override
	public void create(int accNo, String name, double accBal) {
		this.accNo=accNo;
		this.name = name;
		this.accBal = accBal;

	}

	@Override
	public double delete(int accNo) {

		this.accNo = 0;
		this.accBal=0;
		this.name=null;

		return this.accNo;
	}

	public int getAccNo() {
		return accNo;
	}

	@Override
	public void print(int accNo) {
		// TODO Auto-generated method stub

	}


	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accBal="
				+ accBal + "]";
	}

}



