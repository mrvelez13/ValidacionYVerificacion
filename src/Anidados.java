import java.util.Scanner;
public class Anidados{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int number = input.nextInt();
        //Evaluamos la condición inicial
        if (number > 3){
            System.out.println("Ha introducido un número mayor de 3");
            //Evaluamos una condición anidada
            if (number > 5){
                System.out.println("El número es mayor a 5 también");

            }
        }

    }
}