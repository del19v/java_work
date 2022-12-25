public class java {

    private static int param1;
    private static String operation;



    /**
     * Калькулятор:
     * 1. Принимает 2 значения
     * 2. принимает тип операции
     * 3. в зависимости от операции выполняет действие
     * 4. выводит результат действия в консоль
     */

//оператор switch(){} case(){}

//double param1, double param2, double result, operation : sum + , min - , mult * , div /

    static void calc(double param1, double param2, String operation) {
        switch (operation) {
            case "+":
                System.out.println(param1 + param2);
                break;
            case "-":
                System.out.println(param1 - param2);
                break;
            case "*":
                System.out.println(param1 * param2);
                break;
            case "/":
                System.out.println(param1 / param2);
                break;
            default:
                System.out.println("something wrong");
        }
    }
    public static void main(String[] args) {
        double param2;
        calc(param1 = 12, param2 = 11, operation = "+");
        calc(param1 = 10, param2 = 1, operation = "-");
        calc(param1 = 2, param2 = 9, operation = "*");
        calc(param1 = 22, param2 = 11, operation = "/");

    }
}





