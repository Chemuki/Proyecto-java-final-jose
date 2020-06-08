/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapiceria;

/**
 *
 * @Clase administrador extendida a trabajador
 */
public class administrador extends trabajador{
    //atributo turno
    private String turno;
    //constructor de administrador
    public administrador(String turno, String nombre, String apellido, int telefono, String dni) {
        super(nombre, apellido, telefono, dni);
        this.turno = turno;
    }
    //getter y setter de turno
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    
     public String toString() {
        return "nombre= " + this.getNombre() + "\n apellido= " + this.getApellido() + "\n telefono= " + this.getTelefono() +
                "\n dni= " + this.getDni() + "\n horas= " + this.getTurno();
    }
}
