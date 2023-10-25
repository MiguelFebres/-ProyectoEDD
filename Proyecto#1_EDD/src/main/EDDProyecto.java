/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import Ventanas.Ventana;



public class EDDProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auxiliares t = new Auxiliares();
        
        Grafo g = t.obtener_datos_archivo("registro_usuarios.txt");
         Ventana v = new Ventana(g);

            

          
        
          
          


        


    }
    
}
