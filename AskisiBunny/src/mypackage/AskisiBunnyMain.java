/*
• Create a class called Bunny with an int bunnyNumber initialized in the constructor.
• Give it a method called hop() that prints out which gerbil number this is, and that it’s hopping.
• Create an ArrayList and add 5 Bunny objects to the List.
• Now use the get() method to move through the List and call hop() for each Bunny.
• Loop through the ArrayList using an Iterator
*/
package mypackage;

import java.util.ArrayList;
import java.util.List;


public class AskisiBunnyMain {

    
    public static void main(String[] args) {
        
        Bunny b1 =new Bunny(5);
        Bunny b2 =new Bunny(2);
        Bunny b3 =new Bunny(1);
        Bunny b4 =new Bunny(9);
        Bunny b5 =new Bunny(19);
        
        List<Bunny> bunnyHop = new ArrayList();
        
        bunnyHop.add(b1);
        bunnyHop.add(b2);
        bunnyHop.add(b3);
        bunnyHop.add(b4);
        bunnyHop.add(b5);
        
        for (int i = 0; i < bunnyHop.size(); i++) {
            bunnyHop.get(i).hop();
        }
        
         while(bunnyHop.iterator().hasNext()){
             
            
        }
        
        
        
    }
    
}
