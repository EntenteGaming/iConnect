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
    public void onEnable();
    
    public void onDisable();
}
