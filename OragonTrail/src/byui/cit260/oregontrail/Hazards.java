/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Ben
 */
public class Hazards implements Serializable {

    //variables
    private String weatherCondition;
    private String sickness;
    private String animal;

    public String getWeatherCondition() {
        return weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public String getSickness() {
        return sickness;
    }

    public void setSickness(String sickness) {
        this.sickness = sickness;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Hazards() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.weatherCondition);
        hash = 83 * hash + Objects.hashCode(this.sickness);
        hash = 83 * hash + Objects.hashCode(this.animal);
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
        final Hazards other = (Hazards) obj;
        if (!Objects.equals(this.weatherCondition, other.weatherCondition)) {
            return false;
        }
        if (!Objects.equals(this.sickness, other.sickness)) {
            return false;
        }
        return Objects.equals(this.animal, other.animal);
    }

    @Override
    public String toString() {
        return "Hazards{" + "weatherCondition=" + weatherCondition + ", sickness=" + sickness + ", animal=" + animal + '}';
    }

}
