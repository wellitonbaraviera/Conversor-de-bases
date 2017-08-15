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
public class OctalDecimal {
    public void octalDecimal()
   // public static void main(String[] args) 
        
    
             throws Exception

    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entrar com numero octal: ");
        int no = Integer.parseInt(reader.readLine(), 8);
        System.out.println("Decimal: " + no);

    }
}
