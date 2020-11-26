package entities;

import java.util.Objects;
import enums.Color;
import enums.Fabric;
import enums.Size;


public class Tshirt {

    private String name;
//    private double price;
    private Color color;
    private Size size;
    private Fabric fabric;

    public Tshirt() {
    }

    public Tshirt(String name, Color color, Size size, Fabric fabric) {
        this.name = name;
        this.color = color;
        this.size = size;
        this.fabric = fabric;
//        this.price = calulate();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Fabric getFabric() {
        return fabric;
    }

    public void setFabric(Fabric fabric) {
        this.fabric = fabric;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.name);
        hash = 67 * hash + Objects.hashCode(this.color);
        hash = 67 * hash + Objects.hashCode(this.size);
        hash = 67 * hash + Objects.hashCode(this.fabric);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tshirt other = (Tshirt) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (this.color != other.color) {
            return false;
        }
        if (this.size != other.size) {
            return false;
        }
        if (this.fabric != other.fabric) {
            return false;
        }
        return true;
    }
    
    
    
//    private double calulate(){
//        price = getColor().getColorPrice()+ 
//                getSize().getSizePrice()+ 
//                getFabric().getFabricPrice();
//        return price;
//    }
    
    @Override
    public String toString() {
        return "\b\bTshirt: " + "name: " + name + ", color: " + color + ", size: " + size + ", fabric: " + fabric+"\n";
    }
}
