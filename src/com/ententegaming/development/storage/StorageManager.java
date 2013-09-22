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
public class StorageManager {
    private HashMap<String, DynamicStorage> stores;
    
    public StorageManager() {
        init();
    }
    
    public void init() {
        stores = new HashMap<>();
        stores.put("default", new DynamicStorage());
    }
    
    public void removeStore(String id) {
        if(stores.containsKey(id)) {
            stores.remove(id);
        }
    }
    
    public DynamicStorage getStore(String id) {
        if(stores.containsKey(id)) {
            return stores.get(id);
        } else {
            return null;
        }
    }
    
    public void createStore(String id) {
        stores.put(id, new DynamicStorage());
    }
}
