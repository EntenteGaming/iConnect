/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development.logger;

import com.ententegaming.development.Iconnect;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iTidez
 */
public class LogManager {
    private final static Logger LOGGER = Logger.getLogger(ConnectLogger.class.getName());
    
    public LogManager() {
        init();
    }
    
    private void init() {
        LOGGER.info("///////////////////////");
        LOGGER.info("//// iConnect V1.0 ////");
        LOGGER.info("/// Logging Enabled ///");
        if(Iconnect.debug) {
        LOGGER.info("// Debug Messages ON //");
        }
        LOGGER.info("///////////////////////");
    }
    
    public void log(String s) {
        LOGGER.info("[iCL-V1] "+s);
    }
    
    public void debug(String s) {
        if(Iconnect.debug) {
            LOGGER.setLevel(Level.INFO);
            LOGGER.info("[DEV][iCL-V1.0000.0] "+s);
        }
    }
    
    public void severe(String s) {
        LOGGER.setLevel(Level.WARNING);
        LOGGER.severe(s);
    }
}
