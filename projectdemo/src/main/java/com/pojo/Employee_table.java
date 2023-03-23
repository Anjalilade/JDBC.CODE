package com.pojo;


	public class Employee_table {
		private Integer empid;
		private String empnamel;
		private String empcity;

		public Employee_table() {
			// TODO Auto-generated constructor stub
		}

		public Employee_table(Integer empid, String empnamel, String empcity) {
			super();
			this.empid = empid;
			this.empnamel = empnamel;
			this.empcity = empcity;
		}

		public Integer getEmpid() {
			return empid;
		}

		public void setEmpid(Integer empid) {
			this.empid = empid;
		}

		public String getEmpname() {
			return empnamel;
		}

		public void setEmpname(String empnamel) {
			this.empnamel = empnamel;
		}

		public String getEmpcity() {
			return empcity;
		}

		public void setEmpcity(String empcity) {
			this.empcity = empcity;
		}

	

}
