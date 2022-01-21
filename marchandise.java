import java.math.BigDecimal;

public class Marchandise {
    private String name;
    private String barcode;
    private String primaryKey;
    private int tvaRate;
    private BigDecimal buyingPrice;
    private BigDecimal sellingPrice;
    private BigDecimal tva;
    private String provider;
    private BigDecimal profitMargin;
    private int quantity;

    Marchandise(String n, String cb, int tva, BigDecimal buyingP, BigDecimal sellingP){
        
    }

    public void setName(String n){

    }

    public void setBarcode(String bc){

    }

    public void setBuyingPrice(BigDecimal p){

    }

    public void setSellingPrice(BigDecimal p){
        
    }

    public void addQuanity(int n){
        quantity+=n;
    }
}