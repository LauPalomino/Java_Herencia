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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Secretaria secretaria2 = new Secretaria(10, "Laura", "Calle 1", 310256985);
        secretaria2.setComputadorAsignado("Compaq Q58 codigo: 25");
        secretaria2.verEmpleado(secretaria2);
        
        Operario operario2 = new Operario(41, "Liam", "Cra 4", 3215284);
        operario2.setDotacionOperario("Overol, Gafas, Botas, Casco");
        operario2.verEmpleado(operario2);
        
        Directivo director = new Directivo(24, "Hussey", "Cra 15", 6524585);
        director.setOficinaDirectivo(531);
        director.setSucursalDirectivo("Sabana Norte");
        director.verEmpleado(director);
    }
    
}
