/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordebases;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author welliton
 */
public class DecimalOctal {

    // public void decimalOctal() 
    public static void main(String[] args)
            throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entra com numero decimal: ");
        int numero = Integer.parseInt(reader.readLine());
        StringBuffer buff = new StringBuffer();

        while (numero != 0) {

            int digito = numero % 8;
            buff.append(digito);
            numero = numero / 8;

        }
        buff.reverse();
        System.out.println("octal: " + buff);
    }
}
