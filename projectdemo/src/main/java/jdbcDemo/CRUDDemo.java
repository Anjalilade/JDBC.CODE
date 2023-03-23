package jdbcDemo;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import com.pojo.Employee_table;
	import com.jdbc.utils.DBUtil;
	

	public class CRUDDemo {

		public void readEmployee() {
			Connection con = DBUtil.getMySQLConnection();
			try {
				PreparedStatement ps = con.prepareStatement("SELECT * FROM employee_table;");
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		public void createEmployee(Employee_table ed) {
			Connection con = DBUtil.getMySQLConnection();
			try {
				PreparedStatement ps = con.prepareStatement(
						"INSERT INTO employee.employee_table (`empid`, `empnamel`, `empcity`) VALUES (?,?,?);");
				ps.setInt(1, ed.getEmpid());
				ps.setString(2, ed.getEmpname());
				ps.setString(3, ed.getEmpcity());
				int a = ps.executeUpdate();
				System.out.println(a);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		
		
		public void updateEmployee(Employee_table ed) {
			Connection con = DBUtil.getMySQLConnection();
			try {
				PreparedStatement ps = con.prepareStatement(
						"UPDATE `employee`.`employee_table` SET `empnamel` = ? WHERE (`empid` = ?);");
				ps.setString(1, ed.getEmpname());
				ps.setInt(2, ed.getEmpid());
				int a = ps.executeUpdate();
				System.out.println(a);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
//
//		
//		public void deleteEmployee(int employeeid) {
//			Connection con = DBUtil.getMySQLConnection();
//			try {
//				PreparedStatement ps = con.prepareStatement(
//						"DELETE FROM `employee`.`employee_table` WHERE (`empid` = ?);");
//				ps.setInt(1, employeeid);
//				int a = ps.executeUpdate();
//				System.out.println(a);
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//
//	
//
}
