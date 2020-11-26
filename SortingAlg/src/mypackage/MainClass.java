package mypackage;

import functions.RandomTshirt;

public class MainClass {

    public static void main(String[] args) {
        RandomTshirt rt = new RandomTshirt();
        
        System.out.println(rt.randomTshirtListFill());
        rt.ascendingSizeOrder();
        rt.descendingSizeOrder();
        rt.ascendingColorOrder();
        rt.descendingColorOrder();
        rt.ascendingFabricOrder();
        rt.descendingFabricOrder();
    }
    
        
}
