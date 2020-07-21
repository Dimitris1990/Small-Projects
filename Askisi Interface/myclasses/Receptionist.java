
package myclasses;

import myInterfaces.Driving;


public class Receptionist extends Employee implements Driving{

    
    
    public Receptionist(String name, int salary) {
        super(name, salary);
    }

    public static void greet(){
        System.out.println("Greetings customer. ");
    }
    
    @Override
    public void work(){
        greet();
    }
    
    @Override
    public void drive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Receptionist{" +getName()+ '}';
    }
    
}
