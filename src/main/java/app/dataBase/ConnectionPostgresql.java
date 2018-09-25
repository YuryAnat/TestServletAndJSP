package app.dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPostgresql {
    private Connection connection = null;

    public Connection getConnection(){
        String url = "jdbc:postgresql://"+Config.host+":"+Config.port+"/"+Config.base;
        if (connection == null){
           try {
                Class.forName(Config.driver);
                connection = DriverManager.getConnection(url,Config.name,Config.password);
            } catch (SQLException | ClassNotFoundException e) {
               e.printStackTrace();
           }
        }
        return connection;
    }
}
