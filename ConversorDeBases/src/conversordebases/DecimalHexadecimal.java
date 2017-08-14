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
public class DecimalHexadecimal {
    public void decimalHexadecimal(){
    
     Scanner num = new Scanner(System.in);
        System.out.println("Entrar com numero decimal: ");
        int decimal = num.nextInt();
        
        String hexadecimal = "";
        
        while(decimal != 0){
        int hexValue = decimal % 16;
        char hexChar;
        
        if(hexValue <= 9 && hexValue >= 0){
        hexChar = (char)(hexValue + '0');
        
        }else{
        
            hexChar =(char)(hexValue -10 + 'A');
        }
        hexadecimal = hexChar + hexadecimal;
        decimal = decimal / 16;
        }
        System.out.println("Numero hexadecimal: " + hexadecimal);
       
    
    }
}
