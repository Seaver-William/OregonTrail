/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

import byui.cit260.oregontrail.Location;
import byui.cit260.oregontrail.Map;

/**
 *
 * @author Moose
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map();
        Location[] locations = new Location[5];
        
        locations[0] = new Location("Independence, Missouri");
        locations[1] = new Location("Grand Canyon");
        locations[2] = new Location("Grand Junction Colorado");
        locations[3] = new Location("San Fransisco");
        locations[4] = new Location("Seattle Washington");
        
        map.setLocations(locations);
        
        return map;
    }
}
