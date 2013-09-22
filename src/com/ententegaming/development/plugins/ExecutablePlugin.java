/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development.plugins;

import net.xeoh.plugins.base.Plugin;

/**
 *
 * @author iTidez
 */
public interface ExecutablePlugin extends Plugin {
    
    // Include @PluginLoaded
    public void onEnable();
    
    //Include @Shutdown
    public void onDisable();
}
