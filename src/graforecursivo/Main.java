/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graforecursivo;

/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        GrafoRecursivo grafo = new GrafoRecursivo(4);
        
        grafo.insertarNodo('A'); //Indice 0
        grafo.insertarNodo('B'); //Indice 1
        grafo.insertarNodo('C'); //Indice 2
        grafo.insertarNodo('D'); //Indice 3
        
        
        grafo.conectar(0, 1); //ARISTA (A,B)
        grafo.conectar(0, 2); //ARISTA (A,C)
        grafo.conectar(1, 3); //ARISTA (B,D)
        grafo.conectar(2, 3); //ARISTA (C,D)
        
        System.out.println("Recorrido Depth First Search (DFS) desde el nodo A");
        
        grafo.dfs(0);
        //TEORICAMENTE EL RECORRIDO ES:
        //VISITA NODO A
        //LUEGO VISITA NODO B (SERÍA EL PRIMER ADYACENTE DE A)
        //LUEGO VISITA D (QUE SERÍA EL ADYACENTE DE B)
        //LUEGO RETROCEDE (VUELVE A LA RAÍZ) Y VISITA C (QUE SERÍA EL ADYACENTE NO VISITADO DE A)
        
    }
    
}