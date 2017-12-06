/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byu.cit260.oregontrail.control;

import byui.cit260.oregontrail.Actor;
import byui.cit260.oregontrail.Team;

/**
 *
 * @author Moose
 */
public class TeamControl {
    
    public static Team createTeam() {
        Team team = new Team();
        Actor[] actor = new Actor[5];
        
        actor[0] = new Actor("Bat Masterson");
        actor[1] = new Actor("Belle Starr");
        actor[2] = new Actor("Big Jim Courtright");
        actor[3] = new Actor("Oliver Loving");
        actor[4] = new Actor("StagecoachMary");
        
        team.setActor(actor);
        
        return team;
    }
}

