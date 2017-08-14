/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversordebases;

import java.util.Scanner;

/**
 *
 * @author welliton
 */
public class BinarioDecimal {

    public void binarioDecimal(){
        Scanner leitor = new Scanner(System.in);
        String entrada = leitor.next();
        int potencia = 0;
        int decimal = 0;
        for (int i = entrada.length() - 1; i >= 0; i--) {
            decimal += Math.pow(2, potencia)
                    * Character.getNumericValue(entrada.charAt(i));
            potencia++;
        }
        System.out.println(decimal);
    }
}
