import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] weight = new int[10];
        weight[0] = 90; //зап знач массива 0. вариант 1
        int[] weights = {90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 12}; //вар 2
        int januaryWeight = weights[0]; //присваивание массива вр 1. Переменную в даннном слчае можно исп много раз
        System.out.println(januaryWeight);
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        System.out.println(weights[11]);
        int january = 0;
        System.out.println(weights[january]); //присваивание массива вр 2. заменили индекс на название присв. Предпочтительнее, если нужно исп массив 1 р
        for (int i = 0; i < weights.length; i++)
            System.out.println(weights[i]);
        System.out.println("задания 1-4");
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //2. Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
        //4. Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print(number[i] + ",");
        }
        System.out.println();
        for (int a = 2; a > -1; a--) {
            System.out.print(number[a] + ",");
        }
        System.out.println();
        for (int b = 0; b < number.length; b++) {
            if (number[b] % 2 != 0) {
                number[b]+=1;
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println();
        System.out.println("задание 1.2");
        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        double[] fractional = {1.57, 7.654, 9.986};
           for (int o = 0; o < fractional.length; o++)
           System.out.printf(fractional[o] + ",");
                System.out.println();
        for (int k = fractional.length - 1; k >= 0; k--) {
            System.out.printf(fractional[k] + ",");
        }
        System.out.println();
        System.out.println("задание 1.3");
        //Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] leapYear = {2000, 2004, 2008, 2012};
        for (int i = 0; i < leapYear.length; i++) {
            System.out.print(leapYear[i]);
            if (i!= leapYear.length-1);{
            System.out.print(", ");
            }
        }
        System.out.println();
        for (int d = leapYear.length - 1; d >= 0; d--) {
            System.out.print(leapYear[d] + ", ");

        }


    }

}