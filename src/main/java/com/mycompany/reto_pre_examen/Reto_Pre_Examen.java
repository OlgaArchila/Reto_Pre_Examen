
package com.mycompany.reto_pre_examen;

//public class Reto_Pre_Examen {

 import java.util.Scanner;// Importa Scanner para leer datos del teclado

class Lectura {// Clase para manejar la lectura de datos
  private static Scanner inp = new Scanner(System.in);// Objeto Scanner global
  //error porque no es inp es int
  public static int nextInt(String mss) {// Método para leer enteros
    System.out.print(mss);// Muestra el mensaje en pantalla
    return inp.nextInt();// Retorna el número ingresado
  }
}
// Clase que representa la fila de soldados
class FilaIndia{ //falta completar el codigo
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
