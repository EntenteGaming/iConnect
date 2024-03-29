/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development;

import com.ententegaming.development.events.DataCollectedEvent;
import com.ententegaming.development.events.HandlerRegistry;
import com.ententegaming.development.logger.LogManager;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.xeoh.plugins.base.PluginManager;
import net.xeoh.plugins.base.impl.PluginManagerFactory;

/**
 *
 * @author iTidez
 */
public class Iconnect {
    private static boolean stopped = false;
    public static PluginManager pm;
    public static boolean debug = false;
    private static LogManager lm;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        /* Begin Plugin System */
        pm = PluginManagerFactory.createPluginManager();
        File pluginFolder = new File("plugins/");
        pluginFolder.mkdirs();
        pm.addPluginsFrom(pluginFolder.toURI());
        /* End Plugin System */
        
        /* Begin Logger */
        lm = new LogManager();
        /* End Logger */
    }
    
    public static LogManager getLogManager() {
        return lm;
    }
    
    public static boolean isStopped() {
        return stopped;
    }
    
    private static void initEvents() {
        HandlerRegistry.register(DataCollectedEvent.class);
    }
}
