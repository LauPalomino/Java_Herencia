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
public class Carnico extends Producto{

    /**
     * @return the tipoCarnico
     */
    public String getTipoCarnico() {
        return tipoCarnico;
    }

    /**
     * @param tipoCarnico the tipoCarnico to set
     */
    public void setTipoCarnico(String tipoCarnico) {
        this.tipoCarnico = tipoCarnico;
    }

    /**
     * @return the pesoKg
     */
    public int getPesoKg() {
        return pesoKg;
    }

    /**
     * @param pesoKg the pesoKg to set
     */
    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }
    //Atributos
    private String tipoCarnico;
    private int pesoKg;
    
    //Metodo Constructor

    public Carnico(int codigoProducto, String nombreProducto, int valorCompra, int valorVenta, String proveedorProducto, String fechaVencimiento) {
        super(codigoProducto, nombreProducto, valorCompra, valorVenta, proveedorProducto, fechaVencimiento);
    }
    
}
