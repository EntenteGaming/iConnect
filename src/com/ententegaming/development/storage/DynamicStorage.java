/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ententegaming.development.storage;

import java.util.HashMap;

/**
 *
 * @author iTidez
 */
public class DynamicStorage {
    private HashMap<String, Object> storage;
    private boolean init;
    
    public DynamicStorage() {
        init();
    }
    
    private void init() {
        storage = new HashMap<>();
        storage.put("init", true);
        init = false;
        boolean isInitiated = (Boolean)storage.get("init");
        if(isInitiated) {
            init = true;
        }
    }
    
    public boolean addStoredObject(String id, Object data) {
        if(storage.containsKey(id)) {
            return false;
        } else {
            storage.put(id, data);
            if(storage.containsKey(id) && (storage.get(id).equals(data))) {
                return true;
            } else {
                return false;
            }
        }
    }
    
    public boolean removeStoredObject(String id) {
        if(storage.containsKey(id)) {
            storage.remove(id);
            if(!storage.containsKey(id)) 
                return true;
            else
                return false;
        } else {
            return false;
        }
    }
    
    public void clearStorage() {
        storage.clear();
        init();
    }
    
    public Object getStoredObject(String id) {
        Object obj = null;
        if(storage.containsKey(id)) {
            obj = storage.get(obj);
        }
        return obj;
    }
}
