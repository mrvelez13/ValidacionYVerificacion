/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplicationsuma;

/**
 *
 * @author 311B-03
 */
public class Operaciones {
    
    
    public int sumar(int valUno, int valDos){
        return valUno + valDos;
    }
    
    public int restar(int valUno, int valDos){
        return valUno - valDos;
    }
    
    public int multiplicar(int valUno, int valDos){
        return valUno * valDos;
    }
    
    public int dividir(int valUno, int valDos){
        return valUno/valDos;
    }
    
    public void validarEdad(){
        int edad = 3;
        if (edad < 18)
        {
            System.out.println(" Menor de edad ");
        }
        else{
            System.out.println(" Mayor de edad ");
        }
    }
    
    public void complejidadEstructural()
    {
        int matriz[][] = new int[3][3];
        for (int x=0; x < matriz.length; x++)
        {
            for (int y=0; y < matriz[x].length; y++)
            {
                System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                matriz[x][y] = 7;
            }
        }
    }
}
