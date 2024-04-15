import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Uzdevums par vardiem");
        System.out.println("Ievadi savu vardu");
        String input = scanner.nextLine();
        System.out.println("Ievaditais vards ir: " + input);
    }
}