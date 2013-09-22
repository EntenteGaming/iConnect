/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development.events.listeners;

import com.ententegaming.development.events.DataCollectedEvent;
import com.ententegaming.development.events.EventHandler;
import net.xeoh.plugins.base.annotations.PluginImplementation;

/**
 *
 * @author iTidez
 */
@PluginImplementation
public class DataCollectedEventListener {
    @EventHandler
    public void onDataCollected(DataCollectedEvent event) {
        String msg = "";
        for(String s : event.getData()) {
            msg = msg + s;
        }
        
        if(msg == null || msg.isEmpty()) {
            return;
        } else {
            System.out.println(msg);
        }
    }
}
