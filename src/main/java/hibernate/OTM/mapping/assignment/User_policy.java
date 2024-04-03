package hibernate.OTM.mapping.assignment;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User_policy {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_policy_id;
	private String offered_date;
	private String expiry_date;
	private boolean is_active;
	
	
	//user_policy to policy MTO
	@ManyToOne
	@JoinColumn(name = "policy_id")
	private Policy policy;
	
	//user_policy to users MTO
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public int getUser_policy_id() {
		return user_policy_id;
	}

	public void setUser_policy_id(int user_policy_id) {
		this.user_policy_id = user_policy_id;
	}

	public String getOffered_date() {
		return offered_date;
	}

	public void setOffered_date(String string) {
		this.offered_date = string;
	}

	public String getExpiry_date() {
		return expiry_date;
	}

	public void setExpiry_date(String string) {
		this.expiry_date = string;
	}

	public Boolean getIs_active() {
		return is_active;
	}

	public void setIs_active(Boolean string) {
		this.is_active = string;
	}

	public Policy getPolicy() {
		return policy;
	}

	public void setPolicy(Policy policy) {
		this.policy = policy;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User_policy(int user_policy_id, String offered_date, String expiry_date, Boolean is_active, Policy policy,
			User user) {
		super();
		this.user_policy_id = user_policy_id;
		this.offered_date = offered_date;
		this.expiry_date = expiry_date;
		this.is_active = is_active;
		this.policy = policy;
		this.user = user;
	}

	public User_policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User_policy [user_policy_id=" + user_policy_id + ", offered_date=" + offered_date + ", expiry_date="
				+ expiry_date + ", is_active=" + is_active + ", policy=" + policy + ", user=" + user + "]";
	}

	public void setIs_active(String string) {
		// TODO Auto-generated method stub
		
	}
	
	

}
