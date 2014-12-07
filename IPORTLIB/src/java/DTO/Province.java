package DTO;
public class Province{
	private int provinceId;
	private int countryId;
	private String provinceNo;
	private String provinceName;

	public Province(){
	}
	public Province(int provinceId, int countryId, String provinceNo, String provinceName){
		this.provinceId = provinceId;
		this.countryId = countryId;
		this.provinceNo = provinceNo;
		this.provinceName = provinceName;
	}
	public int getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public String getProvinceNo() {
		return provinceNo;
	}
	public void setProvinceNo(String provinceNo) {
		this.provinceNo = provinceNo;
	}
	public String getProvinceName() {
		return provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
