/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniReto;

/**
 *
 * @author USUARIO
 */
public class Lacteo extends Producto{

    /**
     * @return the cantidadMililitros
     */
    public int getCantidadMililitros() {
        return cantidadMililitros;
    }

    /**
     * @param cantidadMililitros the cantidadMililitros to set
     */
    public void setCantidadMililitros(int cantidadMililitros) {
        this.cantidadMililitros = cantidadMililitros;
    }
    //Atributos
    private int cantidadMililitros;
   
    //Metodo constructor
    public Lacteo(int codigoProducto, String nombreProducto, int valorCompra, int valorVenta, String proveedorProducto, String fechaVencimiento) {
        super(codigoProducto, nombreProducto, valorCompra, valorVenta, proveedorProducto, fechaVencimiento);
    }

    
    
}
