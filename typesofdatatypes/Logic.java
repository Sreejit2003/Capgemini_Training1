package typesofdatatypes;

public class Logic {
public static void main(String args[])
{
	int ram=8;
	double price=40000;
	boolean fiveg=false;
	if(ram==8 && price<=48000)
	System.out.println(true);
	else
		System.out.println(false);
	if(ram==8 || price >50000)
		System.out.println(true);
		else
			System.out.println(false);
	if(!fiveg)
		System.out.println(!fiveg);     
	int n=24;
	String s=n%2==0? "Even" : "Odd";
	System.out.println(s);
	int a=5;
	int b=10;
	int c=8;
	int g=(a>b?(a>c?a:c) :(b>c?b:c));
	System.out.println(g);
	int ch='a';
	if(Character.isUpperCase(ch))
	System.out.println("Upper Case");
	else
		System.out.println("Lower Case");
	int marks=40;
	String grade=marks>=90? "A+" :(marks>=85 ? "A": (marks>=75? "B" :"C"));
	System.out.println(grade);
	
}
}
