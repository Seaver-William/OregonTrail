/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.vit260.oregontrial.view;

import byui.cit260.oregontrail.OregonTrail;
import java.io.PrintWriter;

/**
 *
 * @author Moose
 */
public class ErrorView {

    private static final PrintWriter errorFile = OregonTrail.getOutFile();
    private static final PrintWriter logFile = OregonTrail.getLogFile();
    
    public static void display(String className, String errorMessage) {

        errorFile.println(
                "--------------------------"
                + "\n - ERROR - " + errorMessage
                + "\n--------------------------");
        
        logFile.println(className + " - " + errorMessage);
       
    }

}
