
package myclasses;

import myInterfaces.Advisable;


public class Teacher extends Employee  implements Advisable{

   
    
    
    
    public Teacher(String name, int salary) {
        super(name, salary);
    }
    
    public static void teach(){
        System.out.println("Yes sir! "); 
     }

    
    @Override
    public void giveAdvice() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void work(){
        teach();
    }
    
    
    @Override
    public String toString() {
        return "Teacher{" + getName()+'}';
    }
     
}
