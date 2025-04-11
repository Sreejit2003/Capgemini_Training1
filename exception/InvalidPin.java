package exception;

public class InvalidPin extends RuntimeException{
	static String str="Enter valid pin";
	InvalidPin(){
		super(str);

}
}
