import java.math.BigDecimal;

public class Marchandise {
    private String name;
    private String barcode;
    private String primaryKey;
    private int tvaRate;
    private float buyingPrice;
    private float buyingPriceHTVA;
    private float sellingPrice;
    private float tva;
    private String provider;
    private float profitMargin;
    private int quantity;

    Marchandise(String n, String cb, int tva, float buyingP, float sellingP, String prov) {
        this.name = n;
        this.barcode = cb;
        this.tvaRate = tva;
        this.buyingPrice = buyingP;
        this.sellingPrice = sellingP;
        this.provider = prov;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setBarcode(String bc) {
        this.barcode = bc;
    }

    public void setBuyingPrice(float p) {
        this.buyingPriceHTVA = p;
        this.buyingPrice = this.buyingPriceHTVA * this.tvaRate + this.buyingPriceHTVA;
    }

    public void setSellingPrice(float p) {
        this.sellingPrice = p;
    }

    public void addQuanity(int n) {
        this.quantity += n;
    }

    public void getMargin() {
        this.profitMargin = this.sellingPrice - this.buyingPrice;
    }

    public void TvaAmount() {

    }
}