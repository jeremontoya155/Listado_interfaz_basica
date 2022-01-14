/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package peliculasModelo;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class ImplementacionCatalogoPeliculas implements ICatalogoPeliculas {
    private final ArrayList<String> listaPeliculas;

    public ImplementacionCatalogoPeliculas() {
        this.listaPeliculas = new ArrayList<>();
    }
    
    
    
    @Override
    public void insertarPelicula(Pelicula nombrePelicula) {
        this.listaPeliculas.add(nombrePelicula.toString());
    }

    @Override
    public void listarPelicula() {
        JOptionPane.showMessageDialog(null,
                this.listaPeliculas,
                "LISTA DE ´PELICULAS",
                JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void buscarPeliculas(String nombrePelicula) {
        String resultado=null;
        for(var pelicula:this.listaPeliculas){
            if(pelicula.equals(nombrePelicula)){
            resultado=pelicula;
            break;
            }
            else{
                resultado=pelicula;
            }
        }
        if (nombrePelicula.equals(resultado)) {
            JOptionPane.showMessageDialog(
                null,
                "Resultado->"+resultado,
                "Buscar Pelicula",
                JOptionPane.OK_CANCEL_OPTION
                    
                    );
            
        } else {
            
            JOptionPane.showMessageDialog(
                null,
                "No se encontro la pelicula->"+nombrePelicula,
                "Buscar Pelicula",
                JOptionPane.OK_CANCEL_OPTION
                    
                    );
        }
    }
    
}
