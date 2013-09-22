/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development.network;

import com.ententegaming.development.events.DataCollectedEvent;
import com.ententegaming.development.events.EventPublisher;

/**
 *
 * @author iTidez
 */
public class DataProtocol {
    private static final int WAITING = 0;
    private static final int SENTCONF = 1;
    private static final int LISTENING = 2;
    
    private int state = WAITING;
    
    public String processInput(String input) {
        String output = null;
        
        switch(state) {
            case WAITING:
                output = "cntestb";
                state = SENTCONF;
            break;
            
            case SENTCONF:
                if(input.equalsIgnoreCase("cntestb")) {
                    output = "listening";
                    state = LISTENING;
                } else {
                    output = "errestlist";
                    state = WAITING;
                }
            break;
                
            case LISTENING:
                String[] data = input.split(",");
                EventPublisher.raiseEvent(new DataCollectedEvent(data));
            break;
        }
        
        return output;
    }
}
