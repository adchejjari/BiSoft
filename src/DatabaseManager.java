
/**
 * DatabaseManager
 * Handle requests 
 */

import java.util.*;

public class DatabaseManager {
    private String path;

    public DatabaseManager(String p) {
        this.path = p;
    }

    public void openDatabase() {

    }

    public void createMarchandise(Marchandise m) {

    }

    public void deleteMarchandise(Marchandise m) {

    }

    public void updateMarchandise(Marchandise m) {

    }

    public void createVehicle(Vehicle v) {

    }

    public void deleteVehicle(Vehicle v) {

    }

    public void updateVehicle(Vehicle v) {

    }

    public ArrayList<Marchandise> getMarchandises() {
        ArrayList<Marchandise> marchandises = new ArrayList<Marchadise>();
        // Fetch Marchadise from db..

        return marchandises;
    }

    // public ArrayList<>

    public ArrayList<User> getUsers() {
        ArrayList<User> users;
        // Fetch users from db ..
        return users;
    }

}