package mypackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import myclasses.Assignment;
import myclasses.Student;
import myclasses.Trainer;

public class ComparableForTheWKMain {

    public static void main(String[] args) {
        

        //ti prepi na kanoume sto 4,5 ??? den katalavenw tin ekfonisi!! (╯°o°)╯︵ ʞooqǝɔɐɟ
        
        List<Student> stlist = new ArrayList();
        List<Trainer> trlist = new ArrayList();
        List<Assignment> aslist = new ArrayList();
        
        System.out.println("-------------Student--------------");
        

        stlist.add(new Student("Manolis", 22));
        stlist.add(new Student("Parmenion", 25));
        stlist.add(new Student("Kosmas", 32));
        stlist.add(new Student("Thimios", 15));

        Collections.sort(stlist);

        for (int i = 0; i < stlist.size(); i++) 
            System.out.println("STLIST: " + stlist.get(i).getName() + " " + stlist.get(i).getAge());
        
        System.out.println("");
        System.out.println("-------------Trainer--------------");
        
        trlist.add(new Trainer("Xatzixatzis", dFormat("30/01/2000")));
        trlist.add(new Trainer("Poulopoulakis", dFormat("30/03/2000")));
        
        Collections.sort(trlist);
        
        for (Trainer trainer : trlist) {
            System.out.println("TRLIST: " + trainer);
        }
        System.out.println("");
        System.out.println("-------------Assignment--------------");
        
        //ti kanoume ????????? (╯°o°)╯︵ ʞooqǝɔɐɟ
        aslist.add(new Assignment(dFormat("25/10/2000")));
        aslist.add(new Assignment(dFormat("24/11/2000")));

        Collections.sort(aslist);
        for (Assignment assignment : aslist) {
            System.out.println("ASLIST: " + assignment);
        }
    }

    public static LocalDate dFormat(String a) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/y");
        LocalDate dateFromString = LocalDate.parse(a, formatter);

        return dateFromString;
    }

}
