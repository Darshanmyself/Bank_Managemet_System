
package bank.management.system;

import java.sql.*;

public class concn {
    Connection connection;
    Statement statement;
    public concn(){
        try{
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Darshan2001");
            statement = connection.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
