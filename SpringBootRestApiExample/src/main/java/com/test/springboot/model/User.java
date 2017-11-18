package com.test.springboot.model;
	
public class User {

	private long id;
	private String fName;
	private String lName;
	private String email;
	private int pincode;
	private String birthDate;
	private boolean isActive;

	public User(){
		id=0;
	}
	
	
	
	
	public User(long id, String fName, String lName, String email, int pincode, String birthDate, boolean isActive) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.pincode = pincode;
		this.birthDate = birthDate;
		this.isActive = isActive;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (id != other.id)
			return false;
		return true;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getfName() {
		return fName;
	}



	public void setfName(String fName) {
		this.fName = fName;
	}



	public String getlName() {
		return lName;
	}



	public void setlName(String lName) {
		this.lName = lName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public int getPincode() {
		return pincode;
	}



	public void setPincode(int pincode) {
		this.pincode = pincode;
	}



	public String getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}


	
	


	public boolean isActive() {
		return isActive;
	}




	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", pincode=" + pincode
				+ ", birthDate=" + birthDate + ", isActive=" + isActive + "]";
	}



	


	
	
	
}
