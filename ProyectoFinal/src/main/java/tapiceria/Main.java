/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tapiceria;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * Clase Main donde tenemos el menú del proyecto
 *
 * @author Jose Martin Martínez Muñoz
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        //Primer menú
        System.out.println("Que acción desea realizar:");
        System.out.println(" 1-Introducir un Usuario "
                + "\n 2-Introducir un Tapicero"
                + "\n 3- Introducir un Administrador"
                + "\n 4-Realizar un Servicio");
        int accion = Integer.parseInt(sc.nextLine());

        //Valores con sus atributos que necesitamos para llamar a las otras clases
        String nombre = "";
        String apellido = "";
        int telefono = 0;
        String dni = "";
        int nusuario = 0;
        boolean registro = false;
        String email = "";
        String horasTrabajadas = "";
        String turno = "";
        String reg = "";
        String tipo = "";
        String tela = "";
        int precio = 0;
        int dia = 0;
        int mes = 0;
        int año = 0;

        switch (accion) {
            //caso uno, creación de usuario
            case 1:
                usuario[] usuario = new usuario[1];
                int i = 0;
                //nos pide introducir los datos
                System.out.println("Has entrado en creador de usuario, rellene el formulario:");
                //argumentos del usuario
                usuario usu = new usuario(nusuario, nombre, apellido, telefono, dni);
                //Excepcion de los datos de usuario
                try {
                    System.out.println("Introduzca un número de usuario: ");
                    usu.setNusuario(Integer.parseInt(sc.nextLine()));
                    System.out.println("Introduzca su nombre: ");
                    usu.setNombre(sc.nextLine());
                    System.out.println("Introduzca su apellido: ");
                    usu.setApellido(sc.nextLine());
                    System.out.println("Introduzca su telefono: ");
                    usu.setTelefono(Integer.parseInt(sc.nextLine()));
                    System.out.println("Introduzca su dni: ");
                    usu.setDni(sc.nextLine());
                    System.out.println("Introduzca su email: ");
                    usu.setEmail(sc.nextLine());
                    System.out.println("¿Eres un usuario registrado?");

                    reg = sc.nextLine();
                } catch (Exception ex) {
                    System.out.println(ex + "El valor que has insertado no es correcto");
                }
                //if que nos dice si estamos registrados, cualquier otra respuesta dará false
                if (reg.equalsIgnoreCase("si")) {
                    usu.setRegistro(true);
                }

                usuario[i] = usu;
                System.out.println(usu.toString());
                break;
            case 2:
                //Case 2,creación del trabajador tapicero
                tapicero[] tapicero = new tapicero[1];
                int g = 0;

                System.out.println("Has entrado en creador de usuario, rellene el formulario:");
                //agumentos de tapicero
                tapicero tapi = new tapicero(horasTrabajadas, nombre, apellido, telefono, dni);
                //nos pide los datos del tapicero
                System.out.println("Introduzca las horas trabajadas: ");
                tapi.setHorasTrabajadas(sc.nextLine());
                System.out.println("Introduzca su nombre: ");
                tapi.setNombre(sc.nextLine());
                System.out.println("Introduzca su apellido: ");
                tapi.setApellido(sc.nextLine());
                System.out.println("Introduzca su telefono: ");
                tapi.setTelefono(Integer.parseInt(sc.nextLine()));
                System.out.println("Introduzca su dni: ");
                tapi.setDni(sc.nextLine());

                tapicero[g] = tapi;
                System.out.println(tapi.toString());
                break;
            case 3:

                //creacion del trabajador administrador
                administrador[] administrador = new administrador[1];
                int o = 0;

                System.out.println("Has entrado en creador de usuario, rellene el formulario:");
                //argumentos de administrador
                administrador admin = new administrador(turno, nombre, apellido, telefono, dni);
                //Excepción al crear el administrador
                try {
                    System.out.println("Introduzca el turno de mañana o tarde: ");
                    admin.setTurno(sc.nextLine());
                    System.out.println("Introduzca su nombre: ");
                    admin.setNombre(sc.nextLine());
                    System.out.println("Introduzca su apellido: ");
                    admin.setApellido(sc.nextLine());
                    System.out.println("Introduzca su telefono: ");
                    admin.setTelefono(Integer.parseInt(sc.nextLine()));
                    System.out.println("Introduzca su dni: ");
                    admin.setDni(sc.nextLine());
                }catch(Exception ed){
                    System.out.println(ed+"Error al introducir un dato");
                
                }

                    administrador[o] = admin;
                    System.out.println(admin.toString());
                    break;
                
        
    

case 4:
                //caso 4 submenú de servicios 
                System.out.println("Nuestros servicios son:");

                System.out.println("Que acción desea realizar:");
                System.out.println(" 1-Catalogo "
                        + "\n 2-Horario"
                        + "\n 3-Concentar pedido");

                int catalogo = Integer.parseInt(sc.nextLine());

                switch (catalogo) {
                    case 1:
                        //catálogo donde tenemos los datos enlazados de una base de datos en workbenck
                        Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/tapiceria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "tapicero", "tapicero");
                        Statement smt = con.createStatement();
                        ResultSet rs = smt.executeQuery("select * from tapiceria");

                        System.out.println("ESTE ES NUESTRO CATALOGO DESERVICIOS");
                      //muestra los datos disponibles
                        while (rs.next()) {
                            System.out.println("\n TIPO DE SERVICIO: " + rs.getString("tipo") + "\n TELA DEL PRODUCTO: " + rs.getString("tela") + "\n PRECIO FINAL: " + rs.getString("precio") );

                        }
                        rs.close();
                        smt.close();
                        con.close();

                        break;
                    case 2:
                        //Muestra el horario de la tienda
                        System.out.println("Este es nuestro horario");

                        System.out.println(" 9:00-21:00 de Lunes a Viernes"
                                +  "\n Sabados y Domingos cerrados");

                        break;
                    case 3:
                    System.out.println("Has entrado en pedios:");

                horario[] horario = new horario[1];
                int f = 0;

                //atributos de horario
                horario hora = new horario( dia ,  mes , año);

                //itroduce datos del pedido
                System.out.println("Introduzca un día que le venga bien : ");
                hora.setDia(Integer.parseInt(sc.nextLine()));
                System.out.println("Introduzca el mes que le gustía quedar : ");
                hora.setMes(Integer.parseInt(sc.nextLine()));
              
                System.out.println("Introduzca el servicio que desea: ");
                 String servicio=sc.nextLine();

                horario[f] = hora;
                System.out.println(hora.toString());
                    break;
                        
                    default:
                        //mensaje de advertendia sino metes un dato correcto en el menú
                          System.out.println("No ha introducido el dato correctamente");

                }

                break;
            default:
                //mensaje de advertendia sino metes un dato correcto en el menú
                System.out.println("No ha introducido el dato correctamente");

        }

    }

}
