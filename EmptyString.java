import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args) {
        try {
            String input = readNonEmptyString();
            System.out.println("Введенная строка: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String readNonEmptyString() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            throw new Exception("Пустые строки вводить нельзя.");
        }

        return input;
    }
}
