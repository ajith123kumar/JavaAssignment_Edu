package Assignment_161223;

public class overloadclass {
	void sum(int x,int y) 
	{
		int z = x + y;
		System.out.println("The Sum of the Numbers: "+z);	
	}
	void sub(int x,int y) 
	{
		int z = x - y;
		System.out.println("The Subtration of the Numbers: "+z);
	}
	void prod(int x,int y) 
	{
		int z = x * y;
		System.out.println("The Product of the Numbers: "+z);	
	}
	void div(int x,int y) 
	{
		int z = x / y;
		System.out.println("The Division of the Numbers: "+z);
	}
	void compare(int x,int y) 
	{
		if(x<y)
		{
			System.out.println("Y is Greater than X ");	
		}
		else{
			System.out.println("X is Greater than Y ");	
		}
	}
	void sum1(int x,int y,double z) 
	{
		double a = x + y + z;
		System.out.println("The Sum of the Numbers: "+a);	
	}
	void sub1(int x,int y,double z) 
	{
		double a = x - y - z;
		System.out.println("The X - Y - Z = "+a);	
	}
	void prod1(int x,int y,double z) 
	{
		double a = x * y * z;
		System.out.println("The Product of the Numbers: "+a);	
	}
	void div1(int x,int y,double z) 
	{
		double a = x / y + z/y + x/z + y/x;
		System.out.println("The Magic number is: "+a);	
	}
	void sum2(double x,double y) 
	{
		double z = x + y;
		System.out.println("The Sum of the Numbers: "+z);	
	}
	void sub2(double x,double y) 
	{
		double z = x - y;
		System.out.println("The Subtration of the Numbers: "+z);
	}
	void prod2(double x,double y) 
	{
		double z = x * y;
		System.out.println("The Product of the Numbers: "+z);	
	}
	void div2(double x,double y) 
	{
		double z = x / y;
		System.out.println("The Division of the Numbers: "+z);
	}
	void compare1(float x,float y) 
	{
		if(x<y)
		{
			System.out.println("Y is Greater than X ");	
		}
		else{
			System.out.println("X is Greater than Y ");	
		}
	}
	public static void main(String[] args)
	{
		overloadclass o = new overloadclass();
		o.sum(12, 17);
		o.sub(12, 17);
		o.prod(12, 17);
		o.div(12, 17);
		o.compare(12, 17);
		o.sum1(125, 128, 6.3);
		o.sub1(125, 128, 6.3);
		o.prod1(125, 128, 6.3);
		o.div1(125, 128, 6.3);
		o.sum2(21.342, 17.23);
		o.sub2(12.4, 17.6);
		o.prod2(12.45, 17.45);
		o.div2(12.45, 17.34);
	}
}
