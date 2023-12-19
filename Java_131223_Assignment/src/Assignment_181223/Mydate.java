package Assignment_181223;

public class Mydate
{
	private int dd,mm,yy;

	public Mydate(int dd, int mm, int yy) 
	{        
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		System.out.println("Date is "+dd+"-"+mm+"-"+yy);   
	}

	static void show()
	{
		System.out.println("Reached here");
		System.out.println("This");
	}
	static void show1(int dd, int mm, int yy)
	{
		System.out.println("Reached here");
		System.out.println(dd);
		System.out.println(mm);
		System.out.println(yy);
	}

	public static void main(String[] args) 
	{
		Mydate.show();
		Mydate d= new Mydate(16,12,1996);
		System.out.println("Date is "+d.dd+"-"+d.mm+"-"+d.yy);
		d.show1(22,12,1888);

	}
}

