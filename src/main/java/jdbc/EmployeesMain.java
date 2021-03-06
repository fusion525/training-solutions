package jdbc;

import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeesMain {

    public static void main(String[] args) {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL("jdbc:mysql://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("root");
        dataSource.setPassword("admin");

        try (
                Connection conn = dataSource.getConnection();
                PreparedStatement stmt = conn.prepareStatement("insert into employees(emp_name) values (?)")
                ) {
            stmt.setString(1,"Lakatos Klió Ajtonka");
            stmt.executeUpdate();
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
            throw new IllegalStateException("Cannot insert");

        }
    }

}

