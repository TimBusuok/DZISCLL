package DZ2;
import java.util.Scanner;

class Program{
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите текст: ");
        String input = scan.nextLine();

        try {
            if (input.isEmpty()) {
                throw new Exception("Пустые строки недопустимы!");
            }
            System.out.println("Введенный текст: " + input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scan.close();
    }
}