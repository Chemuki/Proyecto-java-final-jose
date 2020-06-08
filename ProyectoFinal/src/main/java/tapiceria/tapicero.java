/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapiceria;

/**
 *
 * @author Usuario
 */
public class tapicero extends trabajador {
    private String horasTrabajadas;
    //construcor
    public tapicero(String horasTrabajadas, String nombre, String apellido, int telefono, String dni) {
        super(nombre, apellido, telefono, dni);
        this.horasTrabajadas = horasTrabajadas;
 
        
    }
    //Getter y setter de Horas de trabajo
    public String getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(String horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public String toString() {
        return "nombre= " + this.getNombre() + "\n apellido= " + this.getApellido() + "\n telefono= " + this.getTelefono() +
                "\n dni= " + this.getDni() + "\n horas= " + this.getHorasTrabajadas();
    }
    
    
    
    
    
}
