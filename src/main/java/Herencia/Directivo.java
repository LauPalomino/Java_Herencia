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
public class Directivo extends Empleado{

    /**
     * @return the sucursalDirectivo
     */
    public String getSucursalDirectivo() {
        return sucursalDirectivo;
    }

    /**
     * @param sucursalDirectivo the sucursalDirectivo to set
     */
    public void setSucursalDirectivo(String sucursalDirectivo) {
        this.sucursalDirectivo = sucursalDirectivo;
    }

    /**
     * @return the oficinaDirectivo
     */
    public int getOficinaDirectivo() {
        return oficinaDirectivo;
    }

    /**
     * @param oficinaDirectivo the oficinaDirectivo to set
     */
    public void setOficinaDirectivo(int oficinaDirectivo) {
        this.oficinaDirectivo = oficinaDirectivo;
    }
    //Atributos
    private String sucursalDirectivo;
    private int oficinaDirectivo;
    
    //Metodo constructor NO SE CHULEARON LOS ATRIBUTOS 
    public Directivo(int codigoEmpleado, String nombreEmpleado, String direccionEmpleado, long telefonoEmpleado) {
        super(codigoEmpleado, nombreEmpleado, direccionEmpleado, telefonoEmpleado);
    }
    
    
    
}
