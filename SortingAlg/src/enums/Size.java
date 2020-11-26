package enums;


public enum Size {
    
    XS(2), S(4), M(5), L(8), XL(10), XXL(12), XXXL(15);
    private int price;
    
    private Size(int price) {
        this.price = price;
    }
    
    public int getSizePrice() {
        return price;
    }
}
