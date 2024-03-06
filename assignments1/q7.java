package assignments1;
import java.util.*;
  abstract class account{
	private int accNo;
	private double balance;
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo=accNo;
	}
	public double getBal() {
		return balance;
	}
	public void setBal(double balance) {
		this.balance=balance;
	}
	abstract void deposite();
	abstract void withdrawl();
}
  class SavingsAccnt extends account{
	  private double interest;
	  Scanner in=new Scanner(System.in);
	  public double getinterest() {
		  return interest;
	  }
	  public void setinterest(double interest) {
		  this.interest=interest;
	  }
	  void deposite() {
		  double amount=(getBal()*interest)/100;
		  System.out.println("your Interest is "+amount);
		  setBal(getBal()+amount);
		  System.out.println("Your total balance is " +getBal());
	  }
	  void withdrawl() {
		  System.out.println("Enter the amount you want to withdraw: ");
		  double amt=in.nextDouble();
		  if(amt>getBal()) {
			  System.out.println("Sorry!! NOt enough Balance");
		  }
		  else {
			  System.out.println("Money Withdrawl RS: "+amt);
			  setBal(getBal()-amt);
			  System.out.println("Your Current Balance is "+getBal());
		  }
	  }
  }
  class CurrAcnt extends account{
	  private double overDraft;
	  Scanner in=new Scanner(System.in);
	  public double getoverDraft(){
		  return overDraft;
	  }
	  public void setoverDraft(double overDraft) {
		  this.overDraft=overDraft;
		  
	  }
	  void deposite() {
		  System.out.println("Enter the amount you want to diposite: ");
		  double amt=in.nextDouble();
		  setBal(getBal()+amt);
		  System.out.println("Money Diposited: ");
		  System.out.println("Your total balance is " +getBal());
	  }
	  void withdrawl() {
		  System.out.println("Enter the amount you want to withdraw: ");
		  double amt=in.nextDouble();
		  if(amt>getoverDraft()) {
			  System.out.println("Caution!! Out Of Limnit");
		  }else {
			  System.out.println("Money Withdrawl RS: "+amt);
			  if(getBal()<amt) {
				  System.out.println("Not Enough Money");
			  }
			  else {
				  setBal(getBal()-amt);
				  System.out.println("Withdrawl of Rs"+amt+" is done ");
				  System.out.println("Your total balance is RS" +getBal());
			  }
		  }
			  
		  }
  
public class q7 {

	public static void main(String[] args) {
		SavingsAccnt sa= new SavingsAccnt();
		CurrAcnt ca=new CurrAcnt();
		sa.setBal(20000);
		sa.setinterest(10);
		sa.deposite();
		sa.withdrawl(); 
		
		ca.setBal(40000);
		ca.setoverDraft(2000);
		ca.deposite();
		ca.withdrawl();

	}
}}

