/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package peliculasModelo;

/**
 *
 * @author Administrador
 */
public interface ICatalogoPeliculas {
    
    void insertarPelicula(Pelicula nombrePelicula);
    void listarPelicula();
    void buscarPeliculas(String nombrePelicula);
    
    
    
}
