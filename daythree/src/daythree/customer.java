package daythree;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String city;
	
	//Types 
	//1.default-no arguement
	//2.user defined - no arguement and arguemented/parameterized
	
	public Customer( ) {
		System.out.println("user defined no arguement");
	}
	
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customer;
	}
	public void setCustomerName(String customer) {
		this.customer = customer;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
