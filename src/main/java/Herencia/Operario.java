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
public class Operario extends Empleado{

    /**
     * @return the dotacionOperario
     */
    public String getDotacionOperario() {
        return dotacionOperario;
    }

    /**
     * @param dotacionOperario the dotacionOperario to set
     */
    public void setDotacionOperario(String dotacionOperario) {
        this.dotacionOperario = dotacionOperario;
    }
    //Atributos
    private String dotacionOperario;
    
    //Metodo constructor

    public Operario(int codigoEmpleado, String nombreEmpleado, String direccionEmpleado, long telefonoEmpleado) {
        super(codigoEmpleado, nombreEmpleado, direccionEmpleado, telefonoEmpleado);
    }
    
    
}
