import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {


        /* Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año.
         Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de
         la estación en la que está. También habrá que poner un default para cuando el valor de la variable
         no sea una estación.*/

        String station = "";



        Scanner in = new Scanner(System.in);
        System.out.println("enter station");
        station= in.nextLine();

        switch (station){

            case "summer":

                System.out.println("It's summer");
                break;

            case "winter":

                System.out.println("It's winter");
                    break;

            case "autumn":

                System.out.println("It's autumn");
                break;

            case "spring":
                System.out.println("It's spring");
                break;

            default:
                System.out.println("It's not a station");

        }


    }
}