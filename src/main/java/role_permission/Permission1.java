package role_permission;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="permission1")
public class Permission1 {

	@Id
	@GeneratedValue
	private Long id;
	private String permissionName; 
	private String url;   

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPermissionName() {
		return permissionName;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String permissionUrl) {
		this.url = permissionUrl;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", permissionName=" + permissionName + ", url=" + url + "]";
	}

	public Permission1(Long id, String permissionName, String url) {
		super();
		this.id = id;
		this.permissionName = permissionName;
		this.url = url;
	}

	public Permission1() {
		super();
	}

	
	

	

}
