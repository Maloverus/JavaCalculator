import java.util.Scanner;

public class StartCalculator {

        public static void main(String[] args) {

            System.out.println("Правила пользования калькулятором:");
            System.out.println("1. Программа принимает арабские и римские числа от 0 до 10");
            System.out.println("2. При в вводе выражения, между аргументами и знаком операции должен быть пробел");

            try (
                    Scanner scanner = new Scanner(System.in)) {
                String result = new Calculator().calculate(scanner.nextLine().trim().split(" "));
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Введены неверные данные");
            }
        }
    }
