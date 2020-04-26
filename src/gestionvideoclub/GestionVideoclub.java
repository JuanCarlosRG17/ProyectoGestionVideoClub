/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionvideoclub;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class GestionVideoclub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    ArrayList <Pelicula> peli = new ArrayList<Pelicula>();
		
	peli.add(new Pelicula("Avengers","Charly","4545G"));
	peli.add(new Pelicula("Sonic","Jimmy","1212A"));
	peli.add(new Pelicula("Mulan","Xiang","7878W"));
	peli.add(new Pelicula("El Rey Leon","Dinsey","6565T"));
	peli.add(new Pelicula("Aladin","Mahoma","9595B"));
	peli.add(new Pelicula("Star Wars","Pepe","9999H"));
	peli.add(new Pelicula("Stand By Me Doraemon","Mitsubisi","3333Ñ"));
	peli.add(new Pelicula("Tintanic","Juanjo","7777V"));
	peli.add(new Pelicula("Joker","El Risas","1111L"));
	peli.add(new Pelicula("Batman","Bruce","8686P"));
		
		
	ArrayList <Cliente> cli = new ArrayList<Cliente>();
        
        Scanner sc = new Scanner(System.in);
        boolean iniciado = true;
        int op; 
        
        
        while (iniciado == true) {  
            System.out.println("1. Crear nuevo cliente");
            System.out.println("2. Consultar datos cliente");
            System.out.println("3. Alquilar pelicula");
            System.out.println("4. Salir");
            System.out.print("Elige una opcion del menú: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op){
                case 1:
                    String codCli, nombre, apellidos;
                    
                    System.out.println("Introduce un codigo para el cliente: ");
                    codCli = sc.nextLine();
                    System.out.println("Introduce el nombre del cliente");
                    nombre = sc.nextLine();
                    System.out.println("Introduce los apellidos del cliente");
                    apellidos = sc.nextLine();
                    
                    cli.add(new Cliente(nombre, apellidos, codCli));
                    break;
                    
                case 2:
                    String codCliDatos;
                    System.out.println("Introduce el codigo del cliente");
                    codCliDatos = sc.nextLine();
                    for (int i = 0; i < cli.size(); i++) {
                        Cliente clien = cli.get(i);
                        if (clien.getCodigoCli().equalsIgnoreCase(codCliDatos)) {
                            System.out.println(cli);
                        }
                    }
                    break;
                    
                case 3:
                    
                    String codCliAlquilar, nomPeliAlquilar;
                    Cliente cliAlquilar = null;
                    Pelicula peliAlquilar = null;
                    System.out.print("Introduce el nombre del cliente: ");
                    codCliAlquilar = sc.nextLine();
                    for (int i = 0; i < cli.size(); i++) {
                        Cliente clien = cli.get(i);
                        if (clien.getCodigoCli().equalsIgnoreCase(codCliAlquilar)) {
                            cliAlquilar = clien;
                        }
                    }
                    
                    System.out.print("Introduce el nombre de la pelicula que va a alquilar el cliente");
                    nomPeliAlquilar = sc.nextLine();
                    for (int i = 0; i < peli.size(); i++) {
                        Pelicula pelic = peli.get(i);
                        if (pelic.getTitulo().equalsIgnoreCase(nomPeliAlquilar)) {
                            peliAlquilar = pelic; 
                        }
                    }
                    
                    if (cliAlquilar.alquilar(peliAlquilar)) {
                        System.out.println("Pelicula alquilada correctamente");
                    } else {
                        System.out.println("Esta pelicula ya ha sido alquilada solo se puede alquilar una vez la pelicula");
                    }
                    
                    
                    break;
                
                case 4:
                    iniciado = false;
                    System.out.println("Adios!");
                    
                    break;
                
                    
                default:
                    
            }
        }
    }
    
}
