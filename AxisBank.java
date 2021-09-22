package assignments;

public class AxisBank extends BankInfo {
	
	public int deposit(int amount) {
		return amount;
	}
		public static void main(String[] args) {
			AxisBank Ab = new AxisBank();
			Ab.saving();
			Ab.fixed();
			Ab.deposit();
			System.out.println();
			int dep = Ab.deposit(6000);
			System.out.println("Deposited :");
			System.out.println(dep);

		}

}
