/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapiceria;

/**
 *
 * @Superclase trabajor
 */
public abstract class trabajador  {
    //atributos de  trabajador
    private String nombre;
    private String apellido;
    private int telefono;
    private String dni;
    //constructor de trabajador
    public trabajador(String nombre, String apellido, int telefono, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.dni = dni;
    }
    //Gatter y setter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
     //Gatter y setter de apellido
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
     //Gatter y setter de telefono
    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
     //Gatter y setter de dni
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "trabajador{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", dni=" + dni + '}';
    }
    
    
    
}
