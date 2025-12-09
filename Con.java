package bank.management.system;

import java.sql.*;

public class Con {
    Connection connection;
    Statement statement;
    public Con(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Khada@4121");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
