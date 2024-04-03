package hibernate.day1B;

import javax.persistence.Embeddable;

@Embeddable
public class AdditionalInfo {
	
	private String SSN;
	private String PhoneNum;
	private String city;
	
	
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getPhoneNum() {
		return PhoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public AdditionalInfo(String sSN, String phoneNum, String city) {
		super();
		SSN = sSN;
		PhoneNum = phoneNum;
		this.city = city;
	}
	
	

}
