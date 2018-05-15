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
//@GenericGenerator(name="id",strategy="increment") �������������ɲ���
public class User {
	
	@Id
	@GeneratedValue
	private int id;
	private String username;
	private Date birthday;
	
	@ManyToMany
	@Cascade(value= {CascadeType.SAVE_UPDATE})  // ������������
	@JoinTable(   // ָ���м��
	   name="user_role",            //ָ�������ű�
       joinColumns={@JoinColumn(name="user_id")},      //�������м��������Ӧ
	   inverseJoinColumns={@JoinColumn(name="role_id")})  //��һ�ű�������ű������Ķ�Ӧ��ϵ
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
