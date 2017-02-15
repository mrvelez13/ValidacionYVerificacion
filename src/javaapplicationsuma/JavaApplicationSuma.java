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
public class JavaApplicationSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //ContainerSuma cont = new ContainerSuma();
        //cont.setVisible(true);
//        int edad = 3;
//        if (edad < 18)
//        {
//            System.out.println(" Menor de edad ");
//        }
//        else{
//            System.out.println(" Mayor de edad ");
//        }

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
