
    public class Calculator {
        private final Converter converter;

        public Calculator() {
            this.converter = new Converter();
        }

        public String calculate(String [] args) {
            if (args.length!=3) throw new IllegalArgumentException();
            try {
                int result = calculate(Integer.parseInt(args[0]), Integer.parseInt(args[2]), args[1]);
                return String.valueOf(result);
            } catch (NumberFormatException e) {
                int result = calculate(converter.toArabic(args[0]), converter.toArabic(args[2]), args[1]);
                return converter.toRoman(result);
            }
        }

        private int calculate(int firstNumber, int secondNumber, String arithmetic) {
            if (firstNumber < 1 || firstNumber > 10 || secondNumber < 1 || secondNumber > 10) throw new IllegalArgumentException();
            switch (arithmetic) {
                case "+":
                    return firstNumber + secondNumber;
                case "/":
                    return firstNumber / secondNumber;
                case "*":
                    return firstNumber * secondNumber;
                case "-":
                    return firstNumber - secondNumber;
                default:
                    throw new IllegalArgumentException();
            }
        }
    }

