/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


public class Lista {
    public Vertice primero;
    public int size;
    
    public Lista(){
        primero = null;
        size = 0;
    }
    
    public void insert (String nombre){
        Vertice nuevo_usuario = new Vertice(nombre);
        if (primero == null){
            primero = nuevo_usuario;
 
            size++;
        }else{
            Vertice auxiliar = primero;
            while (auxiliar.getSiguiente() != null){
                auxiliar = auxiliar.getSiguiente();
            }
            auxiliar.setSiguiente(nuevo_usuario);
            size++;
        }
    }
    public Vertice search(String nombre){
        Vertice vert = primero;
        while  (vert != null && !vert.getUsuario().equals(nombre) ){
            vert = vert.getSiguiente();}    
        return vert;
    }
    public void delete( String nombre){
        Vertice del = search(nombre);
        if(del != null){         
            Vertice auxiliar = primero;
            while (auxiliar != null && auxiliar.getSiguiente() != del ){
                auxiliar = auxiliar.getSiguiente();
            }
            if (auxiliar != null){
              auxiliar.setSiguiente(del.getSiguiente());
            }
        }     
    }
    
    public Lista reverse(){
        Lista reversed = new Lista();
        Vertice auxiliar = primero;
        while(auxiliar!=null){
            reversed.insert_first(auxiliar.getUsuario());
            auxiliar=auxiliar.getSiguiente();
        }
        return reversed;
        
    }
    public void insert_first(String nombre){
        Vertice vertice = new Vertice(nombre); 
        if (primero==null){
            primero = vertice;
            size++;}
        else{
            vertice.setSiguiente(primero);
            primero = vertice;
            size++;
                    }
    }
    public Lista duplicates(){
        Lista lsd = new Lista();
        Vertice auxiliar = primero;
        while(auxiliar!= null){
            if(lsd.search(auxiliar.getUsuario())== null){
                lsd.insert(auxiliar.getUsuario());
            }
            auxiliar = auxiliar.getSiguiente();
        }
        return lsd;
    }
    public boolean search_bool(String nombre){
        Vertice auxiliar = primero;
        boolean found = false;
        while  (auxiliar != null){
            if (auxiliar.getUsuario().equals(nombre)){
                found = true;
                break;
            }
            auxiliar = auxiliar.getSiguiente();}    
        return found;
    }
    
   

    

    
}
