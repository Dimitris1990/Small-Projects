package enums;

public enum Color {
    
    RED(5), ORANGE(3), YELLOW(7), GREEN(4), BLUE(9), INDIGO(12), VIOLET(15);
    
    private int price;
    
    private Color(int price) {
        this.price = price;
    }
    
    public int getColorPrice() {
        return price;
    }
}
