import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        int numeroIf;




        Scanner numero = new Scanner(System.in);
        System.out.println("Por favor ingrese un número");
        numeroIf = numero.nextInt();


        if(numeroIf > 0 ) {
            System.out.println("El número es positivo");

        }if (numeroIf < 0){
            System.out.println("El numero es negativo");

        }else
            System.out.println("El numero es Cero");


    }

}
