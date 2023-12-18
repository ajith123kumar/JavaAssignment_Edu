package Assignment_161223;

public class Bank {
    private int cid;
    private String cname;
    private long accno;
    private String branch;
    private String bank;
    private double accbal;
    private String acctype;

    public Bank(int cid, String cname, long accno, String branch,
                String bank, double accbal, String acctype) {
        this.cid = cid;
        this.cname = cname;
        this.accno = accno;
        this.branch = branch;
        this.bank = bank;
        this.accbal = accbal;
        this.acctype = acctype;
    }

    public void displayAccountInfo() {
        System.out.println("Customer ID: " + cid);
        System.out.println("Customer Name: " + cname);
        System.out.println("Account Number: " + accno);
        System.out.println("Branch Name: " + branch);
        System.out.println("Bank Name: " + bank);
        System.out.println("Account Balance: Rs." + accbal);
        System.out.println("Account Type: " + acctype);
    }

    public static void main(String[] args) 
    {
        System.out.println("Welcome our valuable customer");

        Bank b = new Bank(1, "Ajith Kumar", 1234567890, "Chennai Branch", "HDFC Bank", 12523632025.0, "Savings");
        b.displayAccountInfo();
    }
}

	

