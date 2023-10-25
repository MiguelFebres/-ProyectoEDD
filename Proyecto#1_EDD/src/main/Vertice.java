/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


public class Vertice {
    private String nombre_de_usuario ;
    private Vertice nextVertice;
    
    public Vertice (String nombre){
        nombre_de_usuario = nombre;
        nextVertice = null;
    }

    /**
     * @return the nombre_de_usuario
     */
    public String getUsuario() {
        return nombre_de_usuario;
    }

    /**
     * @param usuario the nombre_de_usuario to set
     */
    public void setUsuario(String usuario) {
        this.nombre_de_usuario = usuario;
    }

    /**
     * @return the nextVertice
     */
    public Vertice getSiguiente() {
        return nextVertice;
    }

    /**
     * @param siguiente the nextVertice to set
     */
    public void setSiguiente(Vertice siguiente) {
        this.nextVertice = siguiente;
    }
    
}
