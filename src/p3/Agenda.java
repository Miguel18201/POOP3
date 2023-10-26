//Documentation

package p3;

/**
 *Codigo que guarda contactos en una agenda 
 * @author Sanchez Ramirez Miguel Angel
 */
import java.util.Calendar;
import java.util.Date;
import java.util.Hashtable;
import java.text.SimpleDateFormat;


public class Agenda {
  
    private Hashtable<String, Date> agenda;
    /**
     * Constructor de la clase Agenda
     */

    public Agenda() {
        agenda = new Hashtable<>();
    }
/**
 * Metodo que guarda los datos de nombre y cumpleanios de las perosnas
 * @param nombre
 * @param cumpleaños 
 */    

    public void agregarRegistro(String nombre, Date cumpleaños) {
        agenda.put(nombre, cumpleaños);
    }
/**
 * Metodo que nuestra la agenda donde estan guardados la informacion de las personas
 */
    public void mostrarAgenda() {
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Agenda:");
        for (String nombre : agenda.keySet()) {
            Date cumpleaños = agenda.get(nombre);
            System.out.println("Nombre: " + nombre + ", Cumpleaños: " + formatoFecha.format(cumpleaños));
        }
    }
    /**
     * Clase principal que guarda y muestra en pantalla la informacion que se agrega dentro de las variables 
     * @param args 
     */

    public static void main(String[] args) {
        Agenda miAgenda = new Agenda();

        // Agregar registros
        Calendar fecha1 = Calendar.getInstance();
        fecha1.set(1990, Calendar.JANUARY, 15);
        Date cumpleaños1 = fecha1.getTime();
        miAgenda.agregarRegistro("Juan", cumpleaños1);

        Calendar fecha2 = Calendar.getInstance();
        fecha2.set(1985, Calendar.MAY, 22);
        Date cumpleaños2 = fecha2.getTime();
        miAgenda.agregarRegistro("Maria", cumpleaños2);

        Calendar fecha3 = Calendar.getInstance();
        fecha3.set(1995, Calendar.AUGUST, 10);
        Date cumpleaños3 = fecha3.getTime();
        miAgenda.agregarRegistro("Carlos", cumpleaños3);

        Calendar fecha4 = Calendar.getInstance();
        fecha4.set(1980, Calendar.DECEMBER, 5);
        Date cumpleaños4 = fecha4.getTime();
        miAgenda.agregarRegistro("Ana", cumpleaños4);

        Calendar fecha5 = Calendar.getInstance();
        fecha5.set(1992, Calendar.SEPTEMBER, 30);
        Date cumpleaños5 = fecha5.getTime();
        miAgenda.agregarRegistro("Luis", cumpleaños5);

        miAgenda.mostrarAgenda();
    }
}
