package entity;

public class Account {

	private int cid;
	private double money;
	private T1 t1;
	
	
	public Account() {
		super();
	}
	public Account(int cid, double money, T1 t1) {
		super();
		this.cid = cid;
		this.money = money;
		this.t1 = t1;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	public T1 getT1() {
		return t1;
	}
	public void setT1(T1 t1) {
		this.t1 = t1;
	}
	@Override
	public String toString() {
		return "Account [cid=" + cid + ", money=" + money + ", t1="  + "]";
	}
	
	
	
}
