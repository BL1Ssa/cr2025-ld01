package exercise;

public class MethodObject {

	class Account {
		public int gamma(int inputVal, int quantity, int yearToDate) {
			return new GammaC(this, inputVal, quantity, yearToDate).Computing();
		}
		
		private int delta() {
			return 10;
		}
	}
	
	class GammaC {
		
		private final Account account;
		private final int inputVal;
		private final int quantity;
		private final int yearToDate;
		
		private int importantValue1;
		private int importantValue2;
		private int importantValue3;
		
		public GammaC(Account account, int inputVal, int quantity, int yearToDate) {
			this.account = account;
			this.inputVal = inputVal;
			this.quantity = quantity;
			this.yearToDate = yearToDate;
		}
		
		public int Computing() {
			importantValue1 = (inputVal * quantity) + account.delta();
			importantValue2 = (inputVal * yearToDate) + 100;
			
			if ((yearToDate - importantValue1) > 100) {
				importantValue2 -= 20;
			}
			
			importantValue3 = importantValue2 * 7;
			
			return importantValue3 - 2 * importantValue1;
		}
	}

	private void test() {
		Account account = new Account();
		System.out.println(account.gamma(15, 10, 2010));
	}

	public static void main(String[] args) {
		MethodObject p = new MethodObject();
		p.test();
	}
}
