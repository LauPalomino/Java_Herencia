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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carnico carnico2 = new Carnico(256, "Salchichas", 2500, 50000, "Laura", "16/12/2021");
        carnico2.setTipoCarnico("Embutidos");
        carnico2.setPesoKg(2);
        carnico2.verProducto(carnico2);
        System.out.println("------------------------------");
        
        Lacteo lacteo2 = new Lacteo(854,"Yogur", 1500, 15000, "Laura", "11/11/2021");
        lacteo2.setCantidadMililitros(3500);
        lacteo2.verProducto(lacteo2);
        System.out.println("------------------------------");
        
        Electrodomestico electrodomestico2 = new Electrodomestico(754, "Nevera", 1500000, 1500000, "Laura", "NA");
        electrodomestico2.setTamañoElectrodomestico("Grande");
        electrodomestico2.verProducto(electrodomestico2);
        
    }
    
}
