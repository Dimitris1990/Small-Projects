
package myclasses;

import myInterfaces.Advisable;
import myInterfaces.Driving;


public class Director extends Employee implements Advisable, Driving{
    
    
    

    public Director(String name, int salary) {
        super(name, salary);
    }
    
    public static void guide(){
        System.out.println("Roger roger. ");
    }
   
    @Override
    public void giveAdvice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void drive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void work(){
        guide();
    }
    
    @Override
    public String toString() {
        return "Director{" +getName() + '}';
    }
    
        
}
