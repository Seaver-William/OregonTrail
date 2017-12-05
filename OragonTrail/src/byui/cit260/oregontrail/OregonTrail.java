/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail;

import byui.vit260.oregontrial.view.GameMenuView;
import byui.vit260.oregontrial.view.StartProgramView;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vitor
 */
public class OregonTrail {

    /**
     * The program starts in the main function
     *
     */
    public static Game currentGame = null;
    private static Player player = null;

    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    private static PrintWriter logFile = null;
    public static OregonTrail getHotelTunes;

    public static void main(String[] args) {

        StartProgramView startProgramView = new StartProgramView();
        //startProgramView.displayStartProgramView();
        try {
            OregonTrail.inFile = 
                    new BufferedReader(new InputStreamReader(System.in));

            OregonTrail.outFile = new PrintWriter(System.out, true);
            
            String filePath = "log.txt";
            OregonTrail.logFile = new PrintWriter(filePath);
            
            startProgramView.displayStartProgramView();
        } catch (Throwable te) {
            System.out.println(te.getMessage());
            te.printStackTrace();
            startProgramView.displayStartProgramView();
        } finally {
            try {
                if (OregonTrail.inFile != null) {
                    OregonTrail.inFile.close();
                }

                if (OregonTrail.outFile != null) {
                    OregonTrail.outFile.close();
                }
                    
                if (OregonTrail.logFile != null) {
                    OregonTrail.logFile.close();
                }
                
            } catch (IOException ex) {
                System.out.println("Error Closing Files");
                return;
            }

        }
    }

    /**
     *
     * @return
     */
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        OregonTrail.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        OregonTrail.player = player;
    }

    public static void currentGame(Game game) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutfile(PrintWriter outfile) {
        OregonTrail.outFile = outfile;
    }

    public static BufferedReader getInfile() {
        return inFile;
    }

    public static void setInfile(BufferedReader infile) {
        OregonTrail.inFile = infile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        OregonTrail.logFile = logFile;
    }

    public static void getHotelTunes() {
        System.out.print("\n" +
                "Who is the tall, dark stranger there? \n" +
                "Maverick is the name. \n" +
                "Ridin' the trail to who knows where, \n" +
                "Luck is his companion, \n" +
                "Gamblin' is his game. \n" +
                "Smooth as the handle on a gun. \n" +
                "Maverick is the name. \n" +
                "Wild as the wind in Oregon, \n" +
                "Blowin' up a canyon, \n" +
                "Easier to tame. \n"
);
    }

    

}
