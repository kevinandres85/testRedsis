/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba1;

import java.math.BigInteger;

/**
 *
 * @author kluna
 */
public class chageNumberForLetter {

    public String changeNumberXLetter(String sNumber) {
        String cadenaS = "";
        if (sNumber.length() == 10) { //validamos el tamaño de los 10 digitos 
            for (int i = 0; i < sNumber.length(); i++) { //iterar hasta el tamaño 
                char p = sNumber.charAt(i); 
                switch (p) { //asignamos el valor segun el numero 
                    case '0':
                        cadenaS = cadenaS + "S";
                        break;
                    case '1':
                        cadenaS = cadenaS + "U";
                        break;
                    case '2':
                        cadenaS = cadenaS + "T";
                        break;
                    case '3':
                        cadenaS = cadenaS + "P";
                        break;
                    case '4':
                        cadenaS = cadenaS + "A";
                        break;
                    case '5':
                        cadenaS = cadenaS + "G";
                        break;
                    case '6':
                        cadenaS = cadenaS + "M";
                        break;
                    case '7':
                        cadenaS = cadenaS + "E";
                        break;
                    case '8':
                        cadenaS = cadenaS + "L";
                        break;
                    case '9':
                        cadenaS = cadenaS + "C";
                        break;
                }
            }
        } else {
            cadenaS = "Ingrese un numero con 10 digitos ";
        }

        return cadenaS;
    }
}
