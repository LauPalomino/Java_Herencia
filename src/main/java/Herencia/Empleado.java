/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author USUARIO
 */
public class Empleado {
    //ATRIBUTOS
    private int codigoEmpleado;
    private String nombreEmpleado;
    private String direccionEmpleado;
    private long telefonoEmpleado;
    
    //Metodo constructor
    public Empleado(int codigoEmpleado, String nombreEmpleado, String direccionEmpleado, long telefonoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.direccionEmpleado = direccionEmpleado;
        this.telefonoEmpleado = telefonoEmpleado;
    }
    
    //Metodos
    public void verEmpleado(Object objetoIn){
        if(objetoIn.getClass() == Secretaria.class){
            Secretaria secretaria1 = (Secretaria) objetoIn;
            System.out.println("SECRETARIA: ");
            System.out.println("Codigo: " + this.codigoEmpleado);
            System.out.println("Nombre: " + this.nombreEmpleado);
            System.out.println("Direccion: " + this.direccionEmpleado);
            System.out.println("Telefono: "+ this.telefonoEmpleado);
            System.out.println("Computador: "+ secretaria1.getComputadorAsignado());
        }
        else if(objetoIn.getClass() == Operario.class){
            Operario operario1 = (Operario) objetoIn;
            System.out.println("OPERARIO: ");
            System.out.println("Codigo: " + this.codigoEmpleado);
            System.out.println("Nombre: " + this.nombreEmpleado);
            System.out.println("Direccion: " + this.direccionEmpleado);
            System.out.println("Telefono: "+ this.telefonoEmpleado);
            System.out.println("Dotacion: "+ operario1.getDotacionOperario());
        }
        else if(objetoIn.getClass() == Directivo.class){
            Directivo directivo1 = (Directivo) objetoIn;
            System.out.println("DIRECTIVO: ");
            System.out.println("Codigo: " + this.codigoEmpleado);
            System.out.println("Nombre: " + this.nombreEmpleado);
            System.out.println("Direccion: " + this.direccionEmpleado);
            System.out.println("Telefono: "+ this.telefonoEmpleado);
            System.out.println("Sucursa: "+ directivo1.getSucursalDirectivo());
            System.out.println("Oficina: "+ directivo1.getOficinaDirectivo());
        }
    }
    
    
}
