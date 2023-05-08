package codetalksdna.ExceptionClassPrograms.CheckedException;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ThrowsSQLException {

    static final String DB_URL = "jdbc:mysql://localhost/TUTORIALSPOINT";
    static final String USER = "guest";
    static final String PASS = "guest123";
    static final String QUERY = "{call getEmpName (?, ?)}";

    public static void main(String[] args) throws java.sql.SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        CallableStatement stmt = conn.prepareCall(QUERY);
        stmt.setInt(1, 1);
        stmt.registerOutParameter(2, java.sql.Types.VARCHAR);
        System.out.println("Executing stored procedure...");
        stmt.execute();
        String empName = stmt.getString(2);
        System.out.println("Emp Name with ID: 1 is " + empName);
    }
}
