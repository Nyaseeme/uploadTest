package role_permission;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="role1")
public class Role1 {

	@Id
	@GeneratedValue
	private Long id;
	private String roleName;
	private String roleDesc;
	
	@ManyToMany
	@Cascade(value= {CascadeType.SAVE_UPDATE})  // 设置联级操作
	private List<Permission1> plist = new ArrayList<>(); 

	public Role1() {
		super();
	}

	public Role1(Long id, String roleName, String roleDesc, List<Permission1> plist) {
		super();
		this.id = id;
		this.roleName = roleName;
		this.roleDesc = roleDesc;
		this.plist = plist;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public List<Permission1> getPlist() {
		return plist;
	}

	public void setPlist(List<Permission1> plist) {
		this.plist = plist;
	}

	
	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", roleDesc=" + roleDesc + ", plist="  +plist+ "]";
	}

	

	

}
