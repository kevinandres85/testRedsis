/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_2;

import java.util.Random;

/**
 *
 * @author kluna
 */
public class TriplePitago {

    public void generateABC(int prod) {

        int a = 1, b = 1, c = 1; //inicializamos las variables desde 1
        Random r = new Random(); //usamos libreria de java para generar aleatorios
        while (Math.pow(a, 2) + Math.pow(b, 2) != Math.pow(c, 2)) { //creamos un bucle hasta validar que exista la igualdad de la tripleta pitagórica
            a = r.nextInt(prod) + 1; // realizamos un aleatorio entre 1 a el numero ingresado para a
            b = r.nextInt(prod) + 1; // realizamos un aleatorio entre 1 a el numero ingresado para b
            c = prod - a - b; // asignamos al restante a c 
        }
        System.out.println("A=" + a + "\nB=" + b + "\nC=" + c + "\nA+B+C=" + (a + b + c));
    }
}
