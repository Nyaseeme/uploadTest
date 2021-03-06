package hibernatedomian;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {
	@Id  
    @GeneratedValue  
    private int id;  
    private String username;  
    private String password;  
    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE},targetEntity=Role.class)  
    @JoinColumn(name="roleid")  
    private Role role;
    
    
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}  
    
    
    
	
}
