package entities;

public class Address {
	private int id;
	private String province;
	private String district;
	private String ward;
	
	
	
	public Address() {
		super();
	}
	public Address(int id, String province, String district, String ward) {
		super();
		this.id = id;
		this.province = province;
		this.district = district;
		this.ward = ward;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getWard() {
		return ward;
	}
	public void setWard(String ward) {
		this.ward = ward;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", province=" + province + ", district=" + district + ", ward=" + ward + "]";
	}
	
	
	
}
