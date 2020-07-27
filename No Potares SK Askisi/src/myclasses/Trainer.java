
package myclasses;

import java.time.LocalDate;


public class Trainer implements Comparable<Trainer>{
    
    private String name;
    private LocalDate startTeaching;

    public Trainer() {
    }

    public Trainer(String name, LocalDate startTeaching) {
        this.name = name;
        this.startTeaching = startTeaching;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartTeaching() {
        return startTeaching;
    }

    public void setStartTeaching(LocalDate startTeaching) {
        this.startTeaching = startTeaching;
    }

    @Override
    public int compareTo(Trainer e) {
        if (this.startTeaching.equals(e.startTeaching)) {
            return 0;
        } else if (this.startTeaching.isAfter(e.startTeaching)) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Trainer{" + "name=" + name + ", startTeaching=" + startTeaching + '}';
    }
   
    
}
