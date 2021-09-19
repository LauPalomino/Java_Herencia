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
public class Electrodomestico extends Producto{

    /**
     * @return the tamañoElectrodomestico
     */
    public String getTamañoElectrodomestico() {
        return tamañoElectrodomestico;
    }

    /**
     * @param tamañoElectrodomestico the tamañoElectrodomestico to set
     */
    public void setTamañoElectrodomestico(String tamañoElectrodomestico) {
        this.tamañoElectrodomestico = tamañoElectrodomestico;
    }
    //Atributos
    private String tamañoElectrodomestico;
    
    //Metodo constructor

    public Electrodomestico(int codigoProducto, String nombreProducto, int valorCompra, int valorVenta, String proveedorProducto, String fechaVencimiento) {
        super(codigoProducto, nombreProducto, valorCompra, valorVenta, proveedorProducto, fechaVencimiento);
    }
    
}
