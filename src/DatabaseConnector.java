
/**
 * DatabaseConnector
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnector {
    DatabaseConnector() {
        Connection c = null;
        try {
            Class.forName("org.postgresql.Driver");
            System.out.println("CONNECTION DONE");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/",
                            "postgres", "123");
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println(e.getClass().getName() + "x: " + e.getMessage());
            System.exit(0);
        }
        System.out.println("database opened successfully");
    }

    public void createCostumersTable() {

    }

    public void createMarchandisesTable() {

    }

    public void createVehiclesTable() {

    }

    public void createUsersTable() {

    }

}