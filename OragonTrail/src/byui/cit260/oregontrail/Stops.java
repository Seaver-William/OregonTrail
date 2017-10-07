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
 * @author Vitor
 */
public class Stops implements Serializable {
    //variables
    
    private String obstacle;
    private String traidingPost;
    private String landMark;
    private String town;
    private Location location;

    public Stops() {
    }

    public String getObstacle() {
        return obstacle;
    }

    public void setObstacle(String obstacle) {
        this.obstacle = obstacle;
    }

    public String getTraidingPost() {
        return traidingPost;
    }

    public void setTraidingPost(String traidingPost) {
        this.traidingPost = traidingPost;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.obstacle);
        hash = 47 * hash + Objects.hashCode(this.traidingPost);
        hash = 47 * hash + Objects.hashCode(this.landMark);
        hash = 47 * hash + Objects.hashCode(this.town);
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
        final Stops other = (Stops) obj;
        if (!Objects.equals(this.obstacle, other.obstacle)) {
            return false;
        }
        if (!Objects.equals(this.traidingPost, other.traidingPost)) {
            return false;
        }
        if (!Objects.equals(this.landMark, other.landMark)) {
            return false;
        }
        if (!Objects.equals(this.town, other.town)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Stops{" + "obstacle=" + obstacle + ", traidingPost=" + traidingPost + ", landMark=" + landMark + ", town=" + town + '}';
    }
    
    
}
