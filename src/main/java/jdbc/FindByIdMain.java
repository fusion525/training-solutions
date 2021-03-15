package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;

public class FindByIdMain {

    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("root");
        dataSource.setPassword("admin");

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement ps = conn.prepareStatement("select emp_name from employees where id = ?");
                ) {
            ps.setLong(1,2L);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    String name = rs.getString("emp_name");
                    System.out.println(name);
                }
                throw new IllegalStateException("No result");
            }

        }
        catch (SQLException se) {
            throw new IllegalStateException("Cannot query", se);
        }

    }


}
