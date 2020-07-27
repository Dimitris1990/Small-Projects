/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import java.time.LocalDate;

/**
 *
 * @author Tsosman
 */
public class Assignment implements Comparable<Assignment> {

    LocalDate dateOfSubmition;

    public Assignment() {
    }

    public Assignment(LocalDate dateOfSubmition) {
        this.dateOfSubmition = dateOfSubmition;
    }

    public LocalDate getDateOfSubmition() {
        return dateOfSubmition;
    }

    public void setDateOfSubmition(LocalDate dateOfSubmition) {
        this.dateOfSubmition = dateOfSubmition;
    }

    @Override
    public int compareTo(Assignment e) {
        if (this.dateOfSubmition.equals(e.dateOfSubmition)) {
            return 0;
        } else if (this.dateOfSubmition.isAfter(e.dateOfSubmition)) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Assignment{" + "dateOfSubmition=" + dateOfSubmition + '}';
    }

}
