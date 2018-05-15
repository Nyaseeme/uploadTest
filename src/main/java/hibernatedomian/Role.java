package hibernatedomian;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	
	    @Id
	    @GeneratedValue  
	    private int id;  
	    private String rolename;  
	    @ManyToMany  
	    private Set<Permission> permissions;
	    
	    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getRolename() {
			return rolename;
		}
		public void setRolename(String rolename) {
			this.rolename = rolename;
		}
		public Set<Permission> getPermissions() {
			return permissions;
		}
		public void setPermissions(Set<Permission> permissions) {
			this.permissions = permissions;
		} 
	    
	    

}
