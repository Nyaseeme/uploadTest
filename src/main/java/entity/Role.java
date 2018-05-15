package entity;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="role")
public class Role {
  
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String desc;
	
	/* @Cascade(value={CascadeType.SAVE_UPDATE})        //级联关系
	   @JoinTable(name="user_role",                     //中间表的名称
	      joinColumns={@JoinColumn(name="role_id")},   //本表与中间表的外键对应关系
	      inverseJoinColumns={@JoinColumn(name="user_id")}) //另一张表与中间表的外键的对应关系
	private HashSet<User> ulist;*/
	
	public Role() {
		super();
//		ulist = new HashSet<User>();
	}
	public Role(int id, String name, String desc, Set<User> ulist) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
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
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", desc=" + desc + ", ulist="  + "]";
	}
	
	
}
