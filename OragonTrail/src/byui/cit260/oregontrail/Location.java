/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail;

import java.io.Serializable;

/**
 *
 * @author Vitor
 */
public class Location implements Serializable {

    //variables
    private double millageTotal;
    private double millageEnd;
    private double millageStop;
    private Stops stop;

    public Location() {
    }

    public Stops getStop() {
        return stop;
    }

    public void setStop(Stops stop) {
        this.stop = stop;
    }

    public double getMillageTotal() {
        return millageTotal;
    }

    public void setMillageTotal(double millageTotal) {
        this.millageTotal = millageTotal;
    }

    public double getMillageEnd() {
        return millageEnd;
    }

    public void setMillageEnd(double millageEnd) {
        this.millageEnd = millageEnd;
    }

    public double getMillageStop() {
        return millageStop;
    }

    public void setMillageStop(double millageStop) {
        this.millageStop = millageStop;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.millageTotal) ^ (Double.doubleToLongBits(this.millageTotal) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.millageEnd) ^ (Double.doubleToLongBits(this.millageEnd) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.millageStop) ^ (Double.doubleToLongBits(this.millageStop) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.millageTotal) != Double.doubleToLongBits(other.millageTotal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.millageEnd) != Double.doubleToLongBits(other.millageEnd)) {
            return false;
        }
        if (Double.doubleToLongBits(this.millageStop) != Double.doubleToLongBits(other.millageStop)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "millageTotal=" + millageTotal + ", millageEnd=" + millageEnd + ", millageStop=" + millageStop + '}';
    }

}
