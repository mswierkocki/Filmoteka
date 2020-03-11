/**
 *
 * @author Marcin Świerkocki
 */

public class Polaczenie {
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public Polaczenie() {
        
    }
    public boolean polacz()throws Exception{
        try {
    Class.forName("com.mysql.jdbc.Driver").newInstance();    
    connection = DriverManager.getConnection("jdbc:mysql://addr.net:port/db_name", "user", "password");
} catch (SQLException e) {
    throw new RuntimeException(e);
}
        return true;
        
    }
    
}
