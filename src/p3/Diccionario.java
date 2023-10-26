/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package p3;

/**
 * Clase que guarda informacion en un diccionario
 * @author Sanchez Ramirez Miguel Angel 
 */

import java.util.Hashtable; 



public class Diccionario {

/**
 * INICIO DEL PROGRAMA
 *  La informacion de un pero,gato,coche,avion y celular cada una la guarda como variables de tipo string
 * @param args 
 */    
    public static void main(String[] args) {
        // Crear un diccionario (Hashtable) para almacenar palabras y sus definiciones
        Hashtable<String, String> diccionario = new Hashtable<>();

        // Agregar palabras y definiciones al diccionario
        diccionario.put("perro", "Un animal domesticado que es conocido por su lealtad y compañía.");
        diccionario.put("gato", "Un animal domesticado que es conocido por su independencia y elegancia.");
        diccionario.put("coche", "Un medio de transporte motorizado de cuatro ruedas.");
        diccionario.put("avion", "Un medio de transporte de alas y turbinas.");
        diccionario.put("celular", "dispositivo movil que nos permite comunicar.");
        

        // Acceder a las definiciones
        String definicionPerro = diccionario.get("perro");
        String definicionGato = diccionario.get("gato");
        String definicionCoche = diccionario.get("coche");
        String definicionAvion = diccionario.get("avion"); 
        String definicionCelular = diccionario.get("celular");
        
        //Imprimir Definiciones
        System.out.println("Definición de 'perro': " + definicionPerro);
        System.out.println("Definición de 'gato': " + definicionGato);
        System.out.println("Definición de 'coche': " + definicionCoche);
        System.out.println("Definicon de 'avion': " + definicionAvion);
        System.out.println("Definicion de 'celular': " + definicionCelular);
    
}
}