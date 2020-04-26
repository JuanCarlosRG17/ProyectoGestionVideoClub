package gestionvideoclub;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alumno
 */
public class Cliente {
    
    private String nombre;
    private String apellidos;
    private String codigoCli;
	
    private ArrayList <Pelicula> peli;

    public Cliente() {
	peli = new ArrayList<Pelicula>();
    }

    public Cliente(String nombre, String apellidos, String codigoCli) {
	this.nombre = nombre;
	this.apellidos = apellidos;
	this.codigoCli = codigoCli;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public String getApellidos() {
    	return apellidos;
    }

    public void setApellidos(String apellidos) {
    	this.apellidos = apellidos;
    }

    public String getCodigoCli() {
	return codigoCli;
    }

    public void setCodigoCli(String codigoCli) {
	this.codigoCli = codigoCli;
    }

    @Override
    public String toString() {
	return "Nombre=" + nombre + ", apellidos=" + apellidos + ", codigoCli=" + codigoCli + "]";
    }
	
    public boolean alquilar(Pelicula pelicula) {
	if(peli.contains(pelicula)) {
            return false;
            }else {
		peli.add(pelicula);
		return true;
	}	
    }
    
    
    public void mostrarPeliculas(){
        for (int i = 0; i < peli.size(); i++) {
            Pelicula pel = peli.get(i);
            System.out.println(pel.getTitulo());
        }
    }
}
