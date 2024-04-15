import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzdevums par vārdiem");
        System.out.println("Ievadi savu vārdu");
        String input = scanner.nextLine();
        System.out.println("Ievadītais vārds ir: " + input);
    }
}

//kompilējot izmanto šādu komandu: 
//  javac -encoding UTF-8 Main.java