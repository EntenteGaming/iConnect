/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development.events;

/**
 *
 * @author iTidez
 */
public class DataCollectedEvent extends Event {
    private String[] data;
    
    public DataCollectedEvent(String[] data) {
        this.data = data;
    }
    
    public String[] getData() {
        return data;
    }
}
