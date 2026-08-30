
package com.mycompany.biblioteca;


public class Cliente extends Persona {
    
    String email;

    public Cliente() {
    }

    public Cliente(String email, String nombre, String id, String telefono) {
        super(nombre, id, telefono);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
   
    
    
}
