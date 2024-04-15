import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //UZD 1 - nodrošināt vārda ievadīšanu

        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Uzdevums par vārdiem");
        System.out.println("Ievadi savu vārdu");
        String input = scanner.nextLine();
        System.out.println("Ievadītais vārds ir: " + input);

        //UZD 2 - pārbaudīt lietotāja ievadīto vērtību, vai tas ir vārds

        //matches()

        String regex = "^[A-Z_a-z][a-z]*";
        System.out.println(input.matches(regex));

        // if(){

        // }
    }
}

//kompilējot izmanto šādu komandu: 
//  javac -encoding UTF-8 Main.java