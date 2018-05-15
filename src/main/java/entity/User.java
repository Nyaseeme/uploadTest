package entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="user")
//@GenericGenerator(name="id",strategy="increment") 声明主键的生成策略
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private Date birthday;
	
	@ManyToMany
	@Cascade(value= {CascadeType.SAVE_UPDATE})  // 设置联级操作
	@JoinTable(   // 指定中间表
	   name="user_role",            //指定第三张表
       joinColumns={@JoinColumn(name="user_id")},      //本表与中间表的外键对应
	   inverseJoinColumns={@JoinColumn(name="role_id")})  //另一张表与第三张表的外键的对应关系
	private Set<Role> rlist = new HashSet<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Set<Role> getRlist() {
		return rlist;
	}

	public void setRlist(Set<Role> rlist) {
		this.rlist = rlist;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", birthday=" + birthday + ", rlist=" + rlist + "]";
	}
	

	
	
	
	
	
	

}
