
package electricity.billing.system;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
//import java.sql.DriverManager;

/**
 *
 * @author PRIYANKA
 */

public class Conn {
    Connection c;
    Statement s;
    Conn() {
        try {
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "root");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
