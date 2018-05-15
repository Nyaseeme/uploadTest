package entity;

import java.io.Serializable;
import java.util.Set;

public class T1 implements Serializable {
	private int id;
	private String name;
	private String password;
	private Set<Account> alist;
	
	
	public T1() {
		super();
	}
	public T1(int id, String name, String password, Set<Account> alist) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.alist = alist;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<Account> getAlist() {
		return alist;
	}
	public void setAlist(Set<Account> alist) {
		this.alist = alist;
	}
	@Override
	public String toString() {
		return "T1 [id=" + id + ", name=" + name + ", password=" + password + ", alist=" +alist + "]";
	}
	
	

}
