package org.example.connectionPool;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ConnectionPool {
    public final String databaseUrl;
    public final String userName;
    public final String password;

    private int maxPoolSize = 5;
    private int connectionNumber = 0;

    private static final String SQL_VERIFIATION = "select 1";

    Stack<Connection> freePool = new Stack<>();
    Set<Connection> occupiedpool = new HashSet<>();

    public ConnectionPool(String databaseUrl, String userName, String password, int maxSize){
        this.databaseUrl = databaseUrl;
        this.userName = userName;
        this.password = password;
        this.maxPoolSize = maxSize;

    }

    public synchronized Connection getConnection() throws SQLException{
        Connection conn = null;
        if(isFull()){
            throw new SQLException("The connection pool is full.");
        }
        conn = getConnectionFromPool();
        if(conn == null){
            conn = createNewConnectionForPool();
        }
        conn = makeAvailable(conn);
        return conn;
    }

    public synchronized void returnConnection(Connection connection) throws SQLException{
        if(connection == null){
            throw new NullPointerException();
        }
        if(!occupiedpool.remove(connection)){
            throw new SQLException(
                "The connection is returned already or it isn't for this pool."
            );
        }
        freePool.push(connection);
    }

    private synchronized boolean isFull(){
        return ((freePool.size() == 0) && (connectionNumber >= maxPoolSize));
    }

    private Connection createNewConnectionForPool() throws SQLException{
        Connection connection = creatNewConnection();
        connectionNumber++;
        occupiedpool.add(connection);
        return connection;
    }

    private Connection creatNewConnection() throws SQLException{
        Connection connection = null;
        connection = DriverManager.getConnection(databaseUrl, userName, password);
        return connection;
    }

    private Connection getConnectionFromPool(){
        Connection connection = null;
        if (freePool.size() > 0) {
            connection = freePool.pop();
            occupiedpool.add(connection);
        }
        return connection;
    }

    private Connection makeAvailable(Connection connection) throws  SQLException{
        if(isConnectAvailable(connection)){
            return connection;
        }
        occupiedpool.remove(connection);
        connectionNumber--;
        connection.close();
        connection = creatNewConnection();
        occupiedpool.add(connection);
        connectionNumber++;
        return connection;
    }
    private boolean isConnectAvailable(Connection connection){
        try(Statement st = connection.createStatement()){
            st.executeQuery(SQL_VERIFIATION);
            return true;
        }
        catch (SQLException e){
            return false;
        }
    }

    public String getDatabaseUrl() {
        return databaseUrl;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}
