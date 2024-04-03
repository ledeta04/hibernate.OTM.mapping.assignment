package hibernate.OTM.mapping.assignment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import hibernate.day2.mappingOTM.Roles;


@Entity
public class Policy {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int policy_id;
	private String policy_name;
	private String description;
	
	//policy to policy_type MTO
	@ManyToOne
	@JoinColumn(name = "policy_type_id")
	private Policy_type policy_type;
	
	//policy to user_policy OTM
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "policy")
	private List<User_policy>roles = new ArrayList<User_policy>();

	public int getPolicy_id() {
		return policy_id;
	}

	public void setPolicy_id(int policy_id) {
		this.policy_id = policy_id;
	}

	public String getPolicy_name() {
		return policy_name;
	}

	public void setPolicy_name(String policy_name) {
		this.policy_name = policy_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Policy_type getPolicy_type() {
		return policy_type;
	}

	public void setPolicy_type(Policy_type policy_type) {
		this.policy_type = policy_type;
	}

	public List<User_policy> getRoles() {
		return roles;
	}

	public void setRoles(List<User_policy> roles) {
		this.roles = roles;
	}

	public Policy(int policy_id, String policy_name, String description, Policy_type policy_type,
			List<User_policy> roles) {
		super();
		this.policy_id = policy_id;
		this.policy_name = policy_name;
		this.description = description;
		this.policy_type = policy_type;
		this.roles = roles;
	}

	public Policy() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Policy [policy_id=" + policy_id + ", policy_name=" + policy_name + ", description=" + description
				+ ", policy_type=" + policy_type + ", roles=" + roles + "]";
	}
	
	
	

}
