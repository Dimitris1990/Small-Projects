package enums;


public enum Fabric {

    WOOL(5), COTTON(10), POLYESTER(4), RAYON(9), LINEN(2), CASHMERE(10), SILK(20);
    
    private int price;
    
    private Fabric(int price) {
        this.price = price;
    }
    
    public int getFabricPrice() {
        return price;
    }
}
