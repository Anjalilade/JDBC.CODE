package jdbcDemo;

	import com.pojo.Employee_table;

	public class PSDemoUsingUtilMethod {

		public static void main(String[] args) {

			CRUDDemo cd = new CRUDDemo();
			// Read Employee table
			System.out.println("-----------READ Operation------------");
			//cd.readEmployee();
			
			// Insert Employee
			System.out.println("-----------Write Operation------------");
			Employee_table emp = new Employee_table();
			emp.setEmpid(12);
			emp.setEmpname("abcd");
			emp.setEmpcity("Mumbai");
			//cd.createEmployee(emp);

			System.out.println("-----------Update Operation------------");
			Employee_table empU = new Employee_table();
			empU.setEmpid(14);
			empU.setEmpname("Updated EMployee");
			//cd.updateEmployee(empU);
			
			
			//cd.deleteEmployee(4);
			
			
		}
	}



