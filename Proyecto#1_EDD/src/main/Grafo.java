/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;
import org.graphstream.ui.view.Viewer;
import org.graphstream.graph.Edge;

public class Grafo {
    public int max;
    public Lista[] list_users;
    
    
    public Grafo(int max_u){
        list_users = new Lista[max_u];
        max = max_u; 
    }
    
    public void crear_usuario(String nombre){
        boolean espacio_vacio = false;
        for (int i = 0; i < max; i++) {
            if (list_users[i] == null){
                list_users[i] = new Lista();
                list_users[i].insert_first(nombre);
                espacio_vacio = true;
                break;
            }}
        if (!espacio_vacio){
            ampliar_list(nombre);
        }}
    
    
    public void nueva_arista(String destino, String origen){
        boolean origen_encontrado = false;
        boolean destino_encontrado = false;
        int posicion = 0;
        for (int i = 0; i < max; i++) {
            if (destino_encontrado && origen_encontrado){
                break;}
            if (list_users[i].primero.getUsuario().equals(origen)){
                destino_encontrado = true;
                posicion = i;
            }else if (list_users[i].primero.getUsuario().equals(destino)){
                origen_encontrado = true;
            }          
        }
        if (destino_encontrado && origen_encontrado){
            list_users[posicion].insert(destino);
        }
    }
    
    
    public void eliminar_vertice(String nombre){
        if(search_vertice(nombre)!= null){
        Lista[] actualizada = new Lista[max-1];
        int index =0;
         for (int i = 0; i < max ; i++) {
                if (!list_users[i].primero.getUsuario().equals(nombre)){
                    actualizada[index] = list_users[i];
                    actualizada[index].delete(nombre);
                    index++;
                }
         }
            list_users = actualizada;
            max--;
        }
    }
    public void ampliar_list(String usuario){
            Lista[] actualizada = new Lista[max +1];
            for (int i = 0; i < max +1; i++) {
                if (i != max){
                    actualizada[i] = list_users[i] ;
                }else{
                    actualizada[i]= new Lista();
                    actualizada[i].insert_first(usuario);
                }
            }
            this.list_users = actualizada;
            max++;
        }
            
    public void dibujar(){
    Graph graph = new SingleGraph("MyGraph");
    graph.setAttribute("ui.stylesheet", "node { shape: circle; fill-color: #7C47A4; text-color: #000000; size: 40px; } "
            + " edge { size: 2px; shape: line; fill-color: #D3D3D3; }");
    for (int i = 0; i < max; i++) {
        String username = list_users[i].primero.getUsuario();
        Node user = graph.addNode(username);
        user.setAttribute("ui.label", username);
    }

    for (int i = 0; i < max; i++) {
        String source = list_users[i].primero.getUsuario();
        Vertice currentUser = list_users[i].primero.getSiguiente();
        while (currentUser != null) {
            String target = currentUser.getUsuario();
            Edge edge = graph.addEdge(source + "-" + target, source, target, true);
            edge.setAttribute("ui.style", "fill-color: black;");
            currentUser = currentUser.getSiguiente();
        }
    }

    Lista[] components = kosaraju();
    for (int i = 0; i < components.length; i++) {
        Lista component = components[i];
        if (component != null) {
            Vertice currentNode = component.primero;
            Vertice nextNode = component.primero.getSiguiente();
            while (nextNode != null) {
                String source = currentNode.getUsuario();
                String target = nextNode.getUsuario();
                Edge edge = graph.getEdge(source + "-" + target);
                if (edge != null) {
                    edge.setAttribute("ui.style", "fill-color: #CCBF49;");
                }
                currentNode = nextNode;
                nextNode = nextNode.getSiguiente();
            }
            String source = currentNode.getUsuario();
            String target = component.primero.getUsuario();
            Edge edge = graph.getEdge(source + "-" + target);
            if (edge != null) {
                edge.setAttribute("ui.style", "fill-color: #CCBF49;");
            }
        }
    }
    System.setProperty("org.graphstream.ui", "org.graphstream.ui.swing");
    Viewer viewer = graph.display();
}

   
public Grafo reverseGraph() {
    Grafo reversed = new Grafo(max);
    for (int i = 0; i < max; i++) {
        reversed.list_users[i] = new Lista();
    }
    for (int i = 0; i < max; i++) {
        Lista adjList = list_users[i];

        Vertice currentUser = adjList.primero;
        while (currentUser != null) {
            String usuario = currentUser.getUsuario();
            int index = getIndex(usuario);
            reversed.list_users[index].insert(list_users[i].primero.getUsuario());

            currentUser = currentUser.getSiguiente();
        }
    }

    return reversed;
}
public Lista[] kosaraju() {
    Lista order = new Lista();
    boolean[] visited = new boolean[max];

    for (int i = 0; i < max; i++) {
        if (!visited[i]) {
            dfs(i, visited, order);
        }
    }

    Grafo reversedGraph = reverseGraph();

    visited = new boolean[max];
    int numComponents = 0;
    Lista[] components = new Lista[max];

    Vertice currentUser = order.primero;
    while (currentUser != null) {
        int index = getIndex(currentUser.getUsuario());
        if (!visited[index]) {
            components[numComponents] = new Lista();
            reversedGraph.dfs(index, visited, components[numComponents]);
            numComponents++;
        }
        currentUser = currentUser.getSiguiente();
    }

    return components;
}

public void dfs(int userIndex, boolean[] visited, Lista order) {
    visited[userIndex] = true;
    Lista userList = list_users[userIndex];

    Vertice currentUser = userList.primero;
    while (currentUser != null) {
        int neighborIndex = getIndex(currentUser.getUsuario());
        if (neighborIndex != -1 && !visited[neighborIndex]) {
            dfs(neighborIndex, visited, order);
        }
        currentUser = currentUser.getSiguiente();
    }

    order.insert(userList.primero.getUsuario());
}

    public int getIndex(String userName) {
        int index = -1;
        for (int i = 0; i < max; i++) {
            if(list_users[i] != null && list_users[i].primero != null && list_users[i].primero.getUsuario().equals(userName)){
                index = i;
                break;
            }
        }

        return index; 
    }
   public Vertice search_vertice(String nombre){
            for (int i = 0; i < max; i++) { 
                if (list_users[i].primero.getUsuario().equals(nombre)){
                    return list_users[i].primero;
                }
            }
            return null;
        }   
   
    public String print(){
        String grafo = "";
        for (int i = 0; i < max; i++) {
            if (list_users[i]!= null){
            grafo += (this.list_users[i].primero.getUsuario()) + "\n";   
        }}
        return grafo;
    }
    

}
    
    
