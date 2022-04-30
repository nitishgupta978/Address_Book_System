package Com.bridgelabz.address;

public class Address_Persinal_Details {
		private	String firstName;
		private String lastName;
		private String address;
		private	String city;
		private	String state;
		private	int zip;
		private String phoneNo;
		private	String email;

		Address_Persinal_Details(String firstName, String lastName, String address, String city, String state, int zip, String phoneNo,
					String email) {
				this.firstName = firstName;
				this.lastName = lastName;
				this.address = address;
				this.city = city;
				this.state = state;
				this.zip = zip;
				this.phoneNo = phoneNo;
				this.email = email;
			}

			public Address_Persinal_Details(String firstName2, String lastName2, String address2, String city2,
				String state2, int zip2, long phoneNo2, String email2) {
			// TODO Auto-generated constructor stub
		}

			public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}

		

			@Override
		public String toString() {
			return "Address_Persinal_Details [firstName=" + firstName + ", lastName=" + lastName + ", address="
					+ address + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phoneNo=" + phoneNo
					+ ", email=" + email + "]";
		}



			
			public static void main(String[] args) {
				System.out.println("Welcome to Address Book Program");
				Address_Persinal_Details contact = new Address_Persinal_Details("Nitish","Gupta","BR","BIHAR","BH",3215,"123456","abc@gmail.com");
				contact.displayContact();

			}

			private void displayContact() {
				// TODO Auto-generated method stub
				
			}
}

	
