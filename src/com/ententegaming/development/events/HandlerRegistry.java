/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development.events;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author iTidez
 */
public class HandlerRegistry {
    private static List<Class> handlers = new ArrayList<Class>();
    
    public static void register(Class clazz) {
        handlers.add(clazz);
    }
    
    public static List<Class> getHandlers() {
        return handlers;
    }
}
