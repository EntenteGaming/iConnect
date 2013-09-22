/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development;

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
        
        int totalClients = 0;
        
        SocketServer server;
        int i = 0;
        while(!isStopped()) {
            lm.log(""+i);
            if(i == 60) {
                // TODO: Edit out timer
                stopped = true;
                pm.shutdown();
                System.exit(0);
            }
            server = new SocketServer(4445);
            /*try {
                server.start();
            } catch (IOException ex) {
                Logger.getLogger(Iconnect.class.getName()).log(Level.SEVERE, null, ex);
            }*/
            i++;
            Thread.sleep(1000);
        }
    }
    
    public static LogManager getLogManager() {
        return lm;
    }
    
    public static boolean isStopped() {
        return stopped;
    }
}
