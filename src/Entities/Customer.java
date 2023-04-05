package Entities;

public class Customer {
	
	private String nationalityid;
	private String firstname;
	private String lastname;
	private int yearofbirth;
	
	public Customer() {}

	public Customer(String nationalityid, String firstname, String lastname, int yearofbirth) {
		
		this.nationalityid = nationalityid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.yearofbirth = yearofbirth;
	}

	public String getNationalityid() {
		return nationalityid;
	}

	public void setNationalityid(String nationalityid) {
		this.nationalityid = nationalityid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getYearofbirth() {
		return yearofbirth;
	}

	public void setYearofbirth(int yearofbirth) {
		this.yearofbirth = yearofbirth;
	}
	
	
	
}
