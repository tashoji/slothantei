//package jp.co.sbps;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//
//public class MachineRowMapper implements RowMapper
//{
//	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
//		Machine machine = new Machine();
//		machine.setCustId(rs.getInt("CUST_ID"));
//		machine.setName(rs.getString("NAME"));
//		machine.setAge(rs.getInt("AGE"));
//		return machine;
//	}
//	
//}
