/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

import model.modelprogram;

/**
 *
 * @author Fahri Afif
 */
public class functionnn {
    public String returnName (modelprogram modelprogram){
        return "Hello, your name must be " + modelprogram.getName();
    }
       public String returnNull (modelprogram modelprogram) {
        return "Your name couldn't be empty" + modelprogram.getName();
    
   
    }
}

