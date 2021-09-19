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
public class Secretaria extends Empleado{

    /**
     * @return the computadorAsignado
     */
    public String getComputadorAsignado() {
        return computadorAsignado;
    }

    /**
     * @param computadorAsignado the computadorAsignado to set
     */
    public void setComputadorAsignado(String computadorAsignado) {
        this.computadorAsignado = computadorAsignado;
    }
    //Atributos
    private String computadorAsignado;

    //Metodo constructor
    public Secretaria(int codigoEmpleado, String nombreEmpleado, String direccionEmpleado, long telefonoEmpleado) {
        super(codigoEmpleado, nombreEmpleado, direccionEmpleado, telefonoEmpleado);
    }
    
    
}
