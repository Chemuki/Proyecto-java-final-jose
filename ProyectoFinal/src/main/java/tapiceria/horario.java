/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapiceria;

/**
 *
 * @Clase horario
 */
public class horario {
    //atributos de horario
    private int dia;
    private int mes;
    private int año;
    //Constructor de horario
    public horario(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    //getter y setter de dia
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
     //getter y setter de mes
    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
     //getter y setter de año
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    
}
