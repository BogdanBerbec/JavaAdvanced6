package com.cursmysql;

//STEP 1. Import required packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class DbConnector {

    private static Connection connection = null;

    public static Connection getDbConnection() {
        // JDBC driver name and database URL
        String url = "jdbc:mysql://localhost:3306/recapitulare";
        //  Database credentials
        String pass = "";
        String user = "root";
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            connection = DriverManager.getConnection(url, user, pass);
            System.out.println(connection);
            System.out.println("Successfully connected to database.");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static void closeConnection(){
        try{
            if(!connection.isClosed()){
                connection.close();
                System.out.println("Database closed successfully.");
            }
        }
        catch(NullPointerException e){
            System.err.println("Couldn't load driver.");
        }
        catch(SQLException e){
            System.err.println("Couldn't close database.");
        }
    }
}
