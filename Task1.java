import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        float userInput = readFloatFromUser();
        System.out.println("Вы ввели: " + userInput);
    }

    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float number = 0.0f;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            try {
                number = Float.parseFloat(input);
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Некорректный ввод. Повторите попытку.");
            }
        }

        return number;
    }

}
