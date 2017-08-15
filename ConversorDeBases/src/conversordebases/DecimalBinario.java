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
public class DecimalBinario {
   
    //public void decimalBinario()
    public static void main(String[] args) {
         Scanner leitor = new Scanner(System.in);
        int resto = 0;
        System.out.println("Digite o numero decimal: ");
        String num = leitor.nextLine();
        int cociente = Integer.parseInt(num);
        
        while(cociente != 0){
            resto = cociente % 2;
            cociente = cociente / 2;
            
            System.out.print(resto);
        
    }
}
