/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapiceria;

/**
 *
 * Clse usuario que se extiende a la superclase cliente
 */
public class usuario extends cliente {
    //Atributos del usuario
    private int nusuario;// Número del usuario 
    private boolean registro;//si esta o no registrado
    private String email;//correo del usuario
//Constructor de usuario
    public usuario(int nusuario, String nombre, String apellido, int telefono, String dni) {
        super(nombre, apellido, telefono, dni);
        this.nusuario = nusuario;
    }
    //Getter y setter de Nusuario
    public int getNusuario() {
        return nusuario;
    }

    public void setNusuario(int nusuario) {
        this.nusuario = nusuario;
    }
     // is y setter de Registro
    public boolean isRegistro() {
        return registro;
    }

    public void setRegistro(boolean registro) {
        this.registro = registro;
    }
     //Getter y setter de Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    //Devuelve los datos de cliente y usuario
     public String toString() {
        return "nombre= " + this.getNombre() + "\n apellido= " + this.getApellido() + "\n telefono= " + this.getTelefono() +
                "\n dni= " + this.getDni() + "\n Numero usuario= " + this.getNusuario()+ "\n Resgistrado= " + this.isRegistro()+ "\n Email= " + this.getEmail();
    }
}
