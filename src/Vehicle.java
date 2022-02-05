/**
 * Vehicle
 */
public class Vehicle extends Marchandise {
    private String serieNumber;
    private String frameNumber;
    private String engine;
    private String speed;
    private String size;

    Vehicle(String n, String cb, int tva, float buyingP, float sellingP, String prov, String serieNum) {
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

    public void setFrameNumber(String f) {
        this.frameNumber = f;
    }

}