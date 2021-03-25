package lesson1;

public class Main_lesson1 {
    public static void main(String[] args) {

        System.out.println(calcNum(2.25f,2.25f,2.25f,2.25f));
        System.out.println(hasNumberfrom10To20(5,1));
        hasNumberPositiveOrNegative(0);
        System.out.println(hasNumberisNegative(-5));
        greetings("указанное_имя!");
    }

    //Написать метод, которому в качестве параметра передается строка, обозначающая имя.
    // Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    private static void greetings(String s) {
        System.out.println("Привет, " + s);
    }


    //Написать метод, которому в качестве параметра передается целое число.
    // Метод должен вернуть true, если число отрицательное,
    // и вернуть false если положительное.
    private static boolean hasNumberisNegative(int i) {
        if (i >= 0) {
            return false;
        } else {
            return true;
        }
    }


    //Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    private static void hasNumberPositiveOrNegative(int i) {
        if (i >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }


    //Написать метод, принимающий на вход два целых числа и проверяющий,
    // то их сумма лежит в пределах от 10 до 20 (включительно),
    // если да – вернуть true, в противном случае – false.
    private static boolean hasNumberfrom10To20(int i, int i1) {

        int sum = i + i1;
        /*    if (10 < sum && sum < 20) {
                System.out.println("true");
            }
         else{
            System.out.println("false");
        }*/
        return (10 < sum && sum < 20);
    }

    //Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//где a, b, c, d – аргументы этого метода, имеющие тип float.
    private static float calcNum(float v, float v1, float v2, float v3) {
        return  v * (v1 + (v2 / v3));
    }


}
