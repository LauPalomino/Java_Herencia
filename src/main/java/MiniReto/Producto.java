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
public class Producto {
    //Atributos
    private int codigoProducto;
    private String nombreProducto;
    private int valorCompra;
    private int valorVenta;
    private String proveedorProducto;
    private String fechaVencimiento;
    
    //Metodo Constructor

    public Producto(int codigoProducto, String nombreProducto, int valorCompra, int valorVenta, String proveedorProducto, String fechaVencimiento) {
        this.codigoProducto = codigoProducto;
        this.nombreProducto = nombreProducto;
        this.valorCompra = valorCompra;
        this.valorVenta = valorVenta;
        this.proveedorProducto = proveedorProducto;
        this.fechaVencimiento = fechaVencimiento;
    }
    
    //Metodos
     public void verProducto(Object objetoIn){
        if(objetoIn.getClass() == Carnico.class){
            Carnico carnico1 = (Carnico) objetoIn;
            System.out.println("CARNICO: ");
            System.out.println("Codigo: " + this.codigoProducto);
            System.out.println("Nombre: " + this.nombreProducto);
            System.out.println("Valor compra: " + this.valorCompra);
            System.out.println("Valor venta: "+ this.valorVenta);
            System.out.println("Proveedor producto: "+ this.proveedorProducto);
            System.out.println("Fecha vencimiento: "+ this.fechaVencimiento);
            System.out.println("Tipo de carnico: "+ carnico1.getTipoCarnico());
            System.out.println("Peso (Kg): " + carnico1.getPesoKg());
        }
        else if(objetoIn.getClass() == Lacteo.class){
            Lacteo lacteo1 = (Lacteo) objetoIn;
            System.out.println("LACTEO: ");
            System.out.println("Codigo: " + this.codigoProducto);
            System.out.println("Nombre: " + this.nombreProducto);
            System.out.println("Valor compra: " + this.valorCompra);
            System.out.println("Valor venta: "+ this.valorVenta);
            System.out.println("Proveedor producto: "+ this.proveedorProducto);
            System.out.println("Fecha vencimiento: "+ this.fechaVencimiento);
            System.out.println("Cantidad (mL): "+ lacteo1.getCantidadMililitros());
        }
        else if(objetoIn.getClass() == Electrodomestico.class){
            Electrodomestico electrodomestico1 = (Electrodomestico) objetoIn;
            System.out.println("ELECTRODOMESTICO: ");
            System.out.println("Codigo: " + this.codigoProducto);
            System.out.println("Nombre: " + this.nombreProducto);
            System.out.println("Valor compra: " + this.valorCompra);
            System.out.println("Valor venta: "+ this.valorVenta);
            System.out.println("Proveedor producto: "+ this.proveedorProducto);
            System.out.println("Fecha vencimiento: "+ this.fechaVencimiento);
            System.out.println("Tamaño electrodomestico: "+ electrodomestico1.getTamañoElectrodomestico());
            
        }
}}
