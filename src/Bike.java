/**
 * Bike
 */
public class Bike extends Marchandise {
    private String serieNumber;
    private String engine;
    private String speed;
    private String size;

    Bike(String n, String cb, int tva, float buyingP, float sellingP, String prov, String serieNum) {
        super(n, cb, tva, buyingP, sellingP, prov);
        this.serieNumber = serieNum;
    }

    public void setSerieNumber(String s) {
        this.serieNumber = s;
    }

    public void setSpeed(String s) {
        this.speed = s;
    }

    public void setSize(String s) {
        this.size = s;
    }

}