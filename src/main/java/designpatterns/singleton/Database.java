package designpatterns.singleton;

/**
 * Example of singleton design pattern
 * A database should have only one database connection
 */
public class Database {
    private static Database database = null;

    private Database(){ }

    public static Database getInstance(){
        if(database == null)
            database = new Database();
        return database;
    }
}
