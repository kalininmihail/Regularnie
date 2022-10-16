import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 words");
        String wrd = scanner.nextLine();

        Found.Find(wrd);
    }
}