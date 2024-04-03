package hibernate.OTM.mapping.assignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Role_type {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id;
	private String role_name;
	
	//role_type to users OTM
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
	private List<User>user = new ArrayList<User>();

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

	public Role_type(int role_id, String role_name, List<User> user) {
		super();
		this.role_id = role_id;
		this.role_name = role_name;
		this.user = user;
	}

	public Role_type() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Role_type [role_id=" + role_id + ", role_name=" + role_name + ", user=" + user + "]";
	}
	
	
	

}
