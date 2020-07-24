/*
1. Create class Student with name, age, grade.
2. Add constructors, getters/setters.
3. Create 4 students (s1, s2, s3, s4). s3 and s4 will have the same info (different objects, but same info).
4. Create a HashSet and add s1, s2, s3 in this set. Does the set contain s4?
5. Create a TreeSet and add s1, s2, s3, s4.
 */
package mypackage;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CustomExerciceMain {

    public static void main(String[] args) {
        Set<Student> setH = new HashSet();

        Student s1 = new Student("Jamal", 25, 10);
        Student s2 = new Student("Jamal", 25, 10);
        Student s3 = new Student("Jamal", 25, 10);
        Student s4 = new Student("Jamal", 25, 10);

        setH.add(s1);
        setH.add(s2);
        setH.add(s3);

         if (setH.contains(s4)) {
            System.out.println(setH);
        } else {
            boolean check = setH.contains(s4);
            System.out.println(check + ". setH does not contain s4");
        }
        //Edw den katalavenw gt den benei.
        Set<Student> setT = new TreeSet(setH);
    }

}
