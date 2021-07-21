/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.HashMap;

/**
 *
 * @author danie
 */
public class Cliente {
    
    static HashMap<String, String> usuarios = new HashMap<String, String>();
    
    public Cliente(){
        usuarios.put("usuario1", "1234");
        usuarios.put("usuario2", "12");
    }
    
    static public Boolean logIn(String usuario, String contrasenna){
        if (usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasenna)) {
            return true;
        }
        return false;
    }
}
