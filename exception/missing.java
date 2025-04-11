package exception;



public class missing {
	public static void main(String[] args) {
		int a[]= {9,6,4,2,3,5,7,0,1};
		int c=0;
		for(int i=0;i<a.length;i++)
		c+=a[i];
		
		for(int i=0;i<a.length;i++)
			c-=a[i];
		
		if(c>0)
			System.out.println(c);
	}

}
