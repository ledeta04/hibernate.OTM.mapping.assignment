package hibernate.OTM.mapping.assignment;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private String fname;
	private String lname;
	
	@Column(length = 200)
	private String address;
	private String phone;
	private String email;
	private String password;
	
	//users to user_policy OTM
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
	private List<User_policy>roles = new ArrayList<User_policy>();
	
	//users to role_type MTO
	@ManyToOne
	@JoinColumn(name = "role_id")
	private Role_type role;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<User_policy> getRoles() {
		return roles;
	}

	public void setRoles(List<User_policy> roles) {
		this.roles = roles;
	}

	public Role_type getRole() {
		return role;
	}

	public void setRole(Role_type role) {
		this.role = role;
	}

	public User(int user_id, String fname, String lname, String address, String phone, String email, String password,
			List<User_policy> roles, Role_type role) {
		super();
		this.user_id = user_id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.roles = roles;
		this.role = role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", phone=" + phone + ", email=" + email + ", password=" + password + ", roles=" + roles + ", role="
				+ role + "]";
	}
	
	
	

}
