/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pelicula.ui;
import javax.swing.JOptionPane;
import peliculasModelo.*;

/**
 *
 * @author Administrador
 */
public class UIPeliculas {
    public static void interfazUsuario(){
    ICatalogoPeliculas peliculas=new ImplementacionCatalogoPeliculas();
    Pelicula pelicula;
    
    CERRAR:
    while(true){
        String opcion= JOptionPane.showInputDialog(
        null,
        "1-Insertar Pelicula\n"
        +"2-Listar Peliculas\n"
        +"3 Salir",
        "Ingrese una opcion",
        3);
        
        switch(opcion){
            case"1":
                String nombrePelicula=JOptionPane.showInputDialog(
                        null,
                        "Ingrese el nombre de la pelicula",
                        "Entrada",
                        3);
                
                pelicula= new Pelicula(nombrePelicula);
                peliculas.insertarPelicula(pelicula);
                break;
            case"2":
               peliculas.listarPelicula();
               break;
            
            case"3":
                break CERRAR;
            default:
                JOptionPane.showMessageDialog(
                        null,
                        "OPCION INGRESADA INCORRECTA",
                        "ERROR",
                        JOptionPane.ERROR_MESSAGE);
                
                
        
        
        }
        
        
    }
    
    
    
    
    }
    
}
