
public class Saving extends Account {

	private int safetyBoxID;
	private int safetyBoxKey;
	
	/*Creates Savings acocunt*/
	public Saving (String name,String ssn, double initialDeposit) {
		super(name,ssn,initialDeposit);
		accNumber = "1"+accNumber;
		/*set the deposit box*/
		setSafetyBox();
	}
	
	private void setSafetyBox() {
		/*safety box id gets set random*/
		safetyBoxID = (int)(Math.random()*Math.pow(10, 3));
		/*safety box key gets set random*/
		safetyBoxKey = (int)(Math.random()*Math.pow(10, 4));
	}
	
	/*Shows information*/
	public void showInfo() {
		super.showInfo();
		System.out.println(
				"Your Savings Account has been created :"+
				"\nSafety Depositbox ID: "+ safetyBoxID+
				"\nSafety Depositbox Key: "+ safetyBoxKey +
				"\n**************************");
	}

	/*set rate*/
	@Override
	public void setRate() {
		rate = getInterestRate() - .25;
	}
}
