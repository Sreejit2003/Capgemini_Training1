package OopsConcept;

public class acc {
	private String accholder;
	private double accbalance;
	private long accnumber;
	public String getAccholder() {
		return accholder;
	}
	public void setAccholder(String accholder) {
		this.accholder = accholder;
	}
	public double getAccbalance() {
		return accbalance;
	}
	public void setAccbalance(double accbalance) {
		this.accbalance = accbalance;
	}
	public long getAccnumber() {
		return accnumber;
	}
	public void setAccnumber(long accnumber) {
		this.accnumber = accnumber;
	}
	private void withdraw(double accbalance,double withdrawamt)
	{
		if(accbalance<0)
			System.out.println("Negative number not allowed");
		
		else if(accbalance<withdrawamt)
			System.out.println("Not possible, enter less amount");
		
		else
		{
			accbalance-=withdrawamt;
			System.out.println("Withdraw successful");
			System.out.println("Current balance is "+accbalance);
			
		}
	}
		private void depositamt(double accbalance,double depositamt)
		{
			if(accbalance<0)
				System.out.println("Negative number not allowed");
			
			else if(accbalance < depositamt)
				System.out.println("Not possible, enter less amount");
			
			else
			{
				accbalance+=depositamt;
				System.out.println("Deposit successful");
				System.out.println("Current balance is "+accbalance);
				
			}
	}

}

