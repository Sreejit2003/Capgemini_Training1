package PlayingwithObjects;

public class Person {
	
	private String name;
	private Passport passport;
	
	Person(String name, Passport passport){
		this.name = name;
		this.passport = passport;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Passport getPassport() {
		return this.passport;
	}
	
	public void display() {
		System.out.println(getName()+" has passport with "+passport);
	}
}
