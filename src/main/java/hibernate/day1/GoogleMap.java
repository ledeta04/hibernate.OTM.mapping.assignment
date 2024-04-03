package hibernate.day1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity                      //This Annotation tells to use GoogleMap as a Table name
@Table(name = "googleMap_table")
public class GoogleMap {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)     //auto increment 
	private int mapId;
	private String longtude;
	private String latitude;
	private String zipCode;
	public int getMapId() {
		return mapId;
	}
	public void setMapId(int mapId) {
		this.mapId = mapId;
	}
	public String getLongtude() {
		return longtude;
	}
	public void setLongtude(String longtude) {
		this.longtude = longtude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public GoogleMap(String longtude, String latitude, String zipCode) {
		super();
	
		this.longtude = longtude;
		this.latitude = latitude;
		this.zipCode = zipCode;
	}
	public GoogleMap() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GoogleMap [mapId=" + mapId + ", longtude=" + longtude + ", latitude=" + latitude + ", zipCode="
				+ zipCode + "]";
	}
	

}
