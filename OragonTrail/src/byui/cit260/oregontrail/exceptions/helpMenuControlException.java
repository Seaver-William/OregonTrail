/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.oregontrail.exceptions;

/**
 *
 * @author Moose
 */
public class helpMenuControlException extends Exception {

    public helpMenuControlException() {
    }

    public helpMenuControlException(String string) {
        super(string);
    }

    public helpMenuControlException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public helpMenuControlException(Throwable thrwbl) {
        super(thrwbl);
    }

    public helpMenuControlException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}
