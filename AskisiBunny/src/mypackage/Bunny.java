
package mypackage;


public class Bunny {
    
    private int bunnyNumber;

    public Bunny() {
    }

    public Bunny(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public int getBunnyNumber() {
        return bunnyNumber;
    }

    public void setBunnyNumber(int bunnyNumber) {
        this.bunnyNumber = bunnyNumber;
    }

    public void hop(){
        System.out.printf("Gerbil %d is hopping\n",bunnyNumber);
    }
    
    @Override
    public String toString() {
        return "Bunny{" + "bunnyNumber=" + bunnyNumber + '}';
    }
        
}
