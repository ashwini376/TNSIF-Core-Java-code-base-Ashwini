package DayThree;

public class Customer {


		// TODO Auto-generated method stub
		private String customerName;
		private int customerId;
		private String customerCity;
		
		//default constructor
		public Customer()
		{
			System.out.println("hello this is Default customer ");
		}
		
		
		
		// two parameter
		public Customer(String customerName, int customerId) {
			super();
			this.customerName = customerName;
			this.customerId = customerId;
		}




		//para constructor

		public Customer(String customerName, int customerId, String customerCity) {
			//this (); //calling default constructor
			this.customerName = customerName;
			this.customerId = customerId;
			this.customerCity = customerCity;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public int getCustomerId() {
			return customerId;
		}

		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}

		public String getCustomerCity() {
			return customerCity;
		}

		public void setCustomerCity(String customerCity) {
			this.customerCity = customerCity;
		}

		//toString
		@Override
		public String toString() {
			return "Customer [customerName=" + customerName + ", customerId=" + customerId + ", customerCity="
					+ customerCity + "]";
		}
		
		
		

	

	

}
