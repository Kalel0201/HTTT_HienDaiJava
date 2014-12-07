package DTO;
public class Currency{
	private int currencyId;
	private String currencyName;

	public Currency(){
	}
	public Currency(int currencyId, String currencyName){
		this.currencyId = currencyId;
		this.currencyName = currencyName;
	}
	public int getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(int currencyId) {
		this.currencyId = currencyId;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}

}
