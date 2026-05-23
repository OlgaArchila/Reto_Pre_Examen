
package com.mycompany.reto_pre_examen;

//public class Reto_Pre_Examen {

 import java.util.Scanner;// Importa Scanner para leer datos del teclado

class Lectura {// Clase para manejar la lectura de datos
  private static Scanner inp = new Scanner(System.in);// 
  public static int nextInt(String mss) {// Método para leer enteros
    System.out.print(mss);// Muestra el mensaje en pantalla
    return inp.nextInt();// Retorna el número ingresado
  }
}
// Clase que representa la fila de soldados
class FilaIndia{ //falta completar el codigo
     private int fila[]; // Arreglo donde se guardan los soldados
     private int cant; // Variable para controlar cuántos hay
    
     public FilaIndia() { // Constructor de la clase
    fila = new int[100]; // Crea espacio para 100 soldados
    cant = 0; // Inicialmente no hay soldados
     }
     
    public void add(int soldado) { // Método para agregar soldados
    fila[cant] = soldado; // Guarda el soldado en la posición actual
    cant++; // Aumenta la cantidad de soldados
  }
    public int buscar(int soldado) { // Método para buscar posición
    for (int i = 0; i < cant; i++) { // Recorre toda la fila
      if (fila[i] == soldado) { // Verifica si encontró el soldado
        return i; // Retorna la posición encontrada
      }
    }
    return -1; // Retorna -1 si no existe
  }
     public void revisar(int comandantes[], int subordinados[]) { // Revisa supervisión

    for (int i = 0; i < comandantes.length; i++) { // Recorre parejas

      int posC = buscar(comandantes[i]); // Busca posición comandante
      int posS = buscar(subordinados[i]); // Busca posición subordinado

      if (posS < posC) { // Verifica si subordinado está antes
        System.out.println("NO. " + comandantes[i] + "-" + subordinados[i]); // Muestra error
        return; // Termina el método inmediatamente
      }
    }

    System.out.println("SI."); // Muestra SI si todo está correcto
  }
}     
    
    public class SupervisionSoldados { // Clase principal
	public static void main(String[] args) {// Método principal

		FilaIndia filaI = new FilaIndia();// Crea objeto fila india
		int comandantes[], subordinados[];// Arreglos para parejas

		int n = Lectura.nextInt("Cuántos soldados en la fila: ");// Lee cantidad de soldados
		for (int i = 0; i < n; i++)// Recorre cantidad de soldados
		  filaI.add(Lectura.nextInt("Siguiente soldado: ")); // Agrega soldado a la fila

		int s = Lectura.nextInt("Cuántos supervisados: ");// Lee cantidad de parejas
		comandantes = new int[s];// Crea arreglo de comandantes
		subordinados = new int[s];// Crea arreglo de subordinados

		for (int i = 0; i < s; i++) {// Recorre las parejas

		  comandantes[i] = Lectura.nextInt("Siguiente soldado supervisor: ");// Lee comandante

		  subordinados[i] = Lectura.nextInt("Siguiente soldado sobordinado: ");// Lee subordinado
		}
		filaI.revisar(comandantes, subordinados);// Llama método de revisión
	}
}

