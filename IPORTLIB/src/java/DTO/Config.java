package DTO;
public class Config{
	private int configId;
	private String configName;
	private String dataType;
	private String value;
	private int statusId;

	public Config(){
	}
	public Config(int configId, String configName, String dataType, String value, int statusId){
		this.configId = configId;
		this.configName = configName;
		this.dataType = dataType;
		this.value = value;
		this.statusId = statusId;
	}
	public int getConfigId() {
		return configId;
	}
	public void setConfigId(int configId) {
		this.configId = configId;
	}
	public String getConfigName() {
		return configName;
	}
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

}
