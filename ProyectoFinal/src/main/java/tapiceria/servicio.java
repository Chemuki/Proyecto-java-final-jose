/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapiceria;

/**
 *
 * @Clase servicio
 */
public class servicio {
    //atributo de servicio
    private String tipo;
    private String tela;
    private int precio;
    //Constructor de sevicios
    public servicio(String tipo, String tela, int precio) {
        this.tipo = tipo;
        this.tela = tela;
        this.precio = precio;
    }
    //Getter y setter de tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    //getter y setter de tela
    public String getTela() {
        return tela;
    }

    public void setTela(String tela) {
        this.tela = tela;
    }
    //getter y setter de precio
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
