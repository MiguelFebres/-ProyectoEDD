package main;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;


public class Auxiliares {
    
    public Auxiliares(){
    }
    
    public String validacion_nombre(String nombre){
            if(!nombre.contains("@")){
                nombre ="@"+nombre; 
            }
            nombre = nombre.replace(" ", "");
            
            return nombre;
        }
    
    public void modificarArchivo(Grafo graph,String archivo){
        String path = archivo;
        File file = new File(path);
        try{
            if (!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            PrintWriter pw = new PrintWriter(fw);
            pw.write("usuarios" + "\n");
            for (int i = 0; i < graph.max; i++) {
                try{
                    pw.write(graph.list_users[i].primero.getUsuario() + "\n");

                }catch (Exception e){
                    System.out.println("En " + i + " no hay usuario registrado");
                }
            }
            pw.write("relaciones");
            for (int i = 0; i < graph.max; i++) {
                Vertice seguidor = graph.list_users[i].primero;
                while(seguidor.getSiguiente() != null){
                    pw.write("\n" + graph.list_users[i].primero.getUsuario() + ", " + seguidor.getSiguiente().getUsuario());
                    seguidor = seguidor.getSiguiente();
                }
            }
            pw.close();
        }catch( Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
        }

    
    public Grafo obtener_datos_archivo(String archivo){
        Grafo grafo = new Grafo(1);
        String linea;
        String datos_txt = "";
        String path = archivo;
        int estado = 1;
        File file = new File(path);
        String lineas[]; 
        try{
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((linea = br.readLine())!= null){
                    if(!linea.isEmpty() && !linea.equals("usuarios")){
                        if(linea.equals("relaciones")){
                            estado =2;
                        }else if (estado == 1){
                            grafo.crear_usuario(linea);
                        }else if (estado ==2){
                            linea = linea.replace(",", "");
                            lineas = linea.split(" ");
                            grafo.nueva_arista(lineas[0], lineas[1]);
                        }                      
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Se ha leido el archivo");
            }
        }catch( Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }

        return grafo;
    }
        
}
