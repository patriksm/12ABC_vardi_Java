import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        //UZD 1 - nodrošināt vārda ievadīšanu

        Scanner scanner = new Scanner(System.in, "UTF-8");
        System.out.println("Uzdevums par vārdiem");
        String input = "";
        

        //UZD 2 - pārbaudīt lietotāja ievadīto vērtību, vai tas ir vārds

        // System.out.println("Ievadi savu vārdu");
        // String input = scanner.nextLine();
        // System.out.println("Ievadītais vārds ir: " + input);
        // String regex = "^[A-Z_a-z][a-z]*";
        // if(!input.matches(regex)){
        //     System.out.println("Vārds tiek sastādits nepareizi!");
        // }

        String regex = "^[A-Z_a-z][a-z]*";
        while(!input.matches(regex)){
            System.out.println("Ievadi savu vārdu");
            input = scanner.nextLine();
            System.out.println("Ievadītais vārds ir: " + input);
            if(!input.matches(regex)){
                System.out.println("Vārds tiek sastādits nepareizi! Ievadi vēlreiz!");
            }
        }

        // UZD 3 - Pārbaudīt, vai pirmais vārda burts ir lielais burts

        String regex2 = "^[A-Z][a-z]*";
        if(input.matches(regex2)){
            System.out.println("Šīs vārds sākas ar lielo burtu");
        }
        
        // otrais variants

        System.out.println(input.length());
        for(int i=0; i< input.length(); i++){   
            System.out.println(input.charAt(i));
        }

        // UZD 3 - 
    }
}

//kompilējot izmanto šādu komandu: 
//  javac -encoding UTF-8 Main.java