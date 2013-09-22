/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iTidez
 */
public class ConnectLogger {
    
    public void setup() {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.setLevel(Level.INFO);
    }
}
