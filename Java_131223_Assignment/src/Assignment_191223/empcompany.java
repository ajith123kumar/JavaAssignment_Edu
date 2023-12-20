package Assignment_191223;

class empcom
{
	private int eid;
	private String ename;
	private String eaccno;
	private String eDept;
	private String eDesig;
	private double esal;


	empcom(int id,String name,String accno,String dept,String desig,double sal) 
	{
		eid=id;
		ename=name;
		eaccno=accno;
		eDept=dept;
		eDesig=desig;
		esal=sal;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEaccno() {
		return eaccno;
	}


	public void setEaccno(String eaccno) {
		this.eaccno = eaccno;
	}


	public String geteDept() {
		return eDept;
	}


	public void seteDept(String eDept) {
		this.eDept = eDept;
	}


	public String geteDesig() {
		return eDesig;
	}


	public void seteDesig(String eDesig) {
		this.eDesig = eDesig;
	}


	public double getEsal() {
		return esal;
	}


	public void setEsal(double esal) {
		this.esal = esal;
	}
	

}

public class empcompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		empcom e0 = new empcom(101,"AjithKumar","32155654658","SoftwareTesting","Tester",123654987);
		empcom e1 = new empcom(111,"AjithKumar","32154654658","Devops","Dev",100004987);

		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("Employee Id :"+e0.getEid());
		System.out.println("Employee Name :"+e0.getEname());
		System.out.println("Employee AccNo :"+e0.getEaccno());
		System.out.println("Employee Department :"+e0.geteDept());
		System.out.println("Employee Designation :"+e0.geteDesig());
		System.out.println("Employee Salary : Rs. "+e0.getEsal());
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		System.out.println("Employee Id :"+e1.getEid());
		System.out.println("Employee Name :"+e1.getEname());
		System.out.println("Employee AccNo :"+e1.getEaccno());
		System.out.println("Employee Department :"+e1.geteDept());
		System.out.println("Employee Designation :"+e1.geteDesig());
		System.out.println("Employee Salary : Rs. "+e1.getEsal());

		System.out.println("--------------------------------------------------------");
		System.out.println("--------------------------------------------------------");
		
		
		

	}

}
