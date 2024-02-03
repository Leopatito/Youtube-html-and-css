import java.util.Scanner;

public class inputUser {
    public static void main(String[] args){ 
        Scanner scanner = new Scanner(System.in); 
        System.err.println("what it is  your name?");
        String name = scanner.nextLine();
        System.err.println("how old are u?");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println(("what's your favorite game?"));
        String game = scanner.nextLine();

        System.out.println("Hello "+ name);
        System.out.println("you are "+age);
        System.out.println("four favorite food is "+ game);
    }
}
