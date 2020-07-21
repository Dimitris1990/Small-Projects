/*
1. Create class Employee with name and salary.
2. Create subclasses Teacher, Receptionist, Director
3. Teacher teach(), Receptionist greet(), Director guide()
4. Interfaces Advisable, Driving
5. Advisable has method giveAdvice(), Driving has method drive().
6. Teacher-->Advisable, Receptionist-->Driving, Director-->both.
7. Create 2 Teachers, 1 Receptionist, 2 Director. Put them in a list.
7a. Add abstract method work() in Employee.
7b. Each work() method will call the special method each Subclass has.
7c. Ask each employee to work().
8. Separate those that can drive from those that can advice.
 */
package mypackage;

import java.util.ArrayList;
import java.util.List;
import myclasses.Director;
import myclasses.Employee;
import myclasses.Receptionist;
import myclasses.Teacher;

public class MainClass {

    public static void main(String[] args) {

        Employee teacher1 = new Teacher("Magda", 500);
        Employee teacher2 = new Teacher("Babis", 500);
        Employee receptionist = new Receptionist("Elsa", 400);
        Employee director1 = new Director("Zisis", 700);
        Employee director2 = new Director("Makis", 700);

        List<Employee> listEmployee = new ArrayList();

        listEmployee.add(teacher1);
        listEmployee.add(teacher2);
        listEmployee.add(receptionist);
        listEmployee.add(director1);
        listEmployee.add(director2);

        for (Employee e : listEmployee) {
            e.work();
        }
        List<Employee> drivers = new ArrayList();
        List<Employee> advisors = new ArrayList();

        for (Employee e : listEmployee) {
            if ((e instanceof Receptionist) || (e instanceof Director)) {
                drivers.add(e);
            }
        }
        for (Employee a : listEmployee) {
            if ((a instanceof Teacher) || (a instanceof Director)) {
                advisors.add(a);
            }
        }
        System.out.println(drivers + " can drive.");
        System.out.println(advisors + " can advise.");

    }
}
