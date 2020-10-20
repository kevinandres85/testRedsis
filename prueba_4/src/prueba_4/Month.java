/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_4;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author kluna
 */
public class Month {

    public void escribirMes(int mes, String ds) {

        int dmax = 30;
        String calen = "";
        //primer semestre 
        if (mes <= 7) {
            if (mes == 2) { //validamos febrero
                dmax = 28;
                calen = iterarDias(ds, dmax);
            } else {
                if (mes % 2 != 0) { //meses de 31 dias
                    dmax = 31;
                    calen = iterarDias(ds, dmax);
                } else { //meses con 30 dias 
                    calen = iterarDias(ds, dmax);
                }
            }
        } else {
            if (mes % 2 != 0) { //meses de 30 dias
                calen = iterarDias(ds, dmax);
            } else { //meses con 31 dias 
                dmax = 31;
                calen = iterarDias(ds, dmax);
            }

        }
        writeFile(mes, calen);
    }

    public String iterarDias(String ds, int dmax) {
        String calen = "";
        String semana = "LMXJVSD";
        int i = 1;
        while (i <= dmax) {

            int pos = 0;
            if (i == 1) {
                pos = semana.indexOf(ds);
            }
            for (int j = pos; j < semana.length() && i <= dmax; j++) {
                calen += String.valueOf(i) + semana.charAt(j);
                i++;
            }

            //calendario = String.valueOf(i) + d;
        }
        return calen;
    }

    public void writeFile(int mes, String calen) {
        FileWriter txt = null;
        PrintWriter pw = null;
        try {
            String ruta = "c:/mes" + mes + ".txt";
            File file = new File(ruta);
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            txt = new FileWriter(file);
            pw = new PrintWriter(txt);

            pw.println(calen);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                // Nuevamente aprovechamos el finally para 
                // asegurarnos que se cierra el fichero.
                if (null != txt) {
                    txt.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
