import java.util.Arrays;


public class Main {

    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
//        //видео
//        int[] weight = new int[10];
//        weight[0] = 90; //зап знач массива 0. вариант 1
//        int[] weights = {90, 91, 92, 93}; //вар 2
//        int januaryWeight = weights[0]; //присваивание массива вр 1. Переменную в даннном слчае можно исп много раз
//        System.out.println(januaryWeight);
//        System.out.println(weights[0]);
//        System.out.println(weights[3]);
//        System.out.println(weights[1]);
//        int january = 0;
//        System.out.println(weights[january]); //присваивание массива вр 2. заменили индекс на название присв. Предпочтительнее, если нужно исп массив 1 р
//        for (int i = 0; i < weights.length; i++)
//            System.out.println(weights[i]);
//        int[] weigh = {10, 17, 68, 33, 99, 100, 17};
//        int maxWei = 0;
//        for (int i = 0; i < weigh.length; i++) {
//            if (weigh[i] > maxWei) {
//                maxWei = weigh[i];
//            }
//        }
//        System.out.println(maxWei);
//        int[] difWeight = {55, 58, 60, 70, 55, 30};
//        for (int i = 0; i < difWeight.length - 1 && difWeight[i + 1] != 0; i++) { //без -1 ошибка,считается лишний месяц
//            System.out.println(difWeight[i + 1] - difWeight[i]);
//        }
//        int sum = 0;
//        int[] hop = {15, 1, 12};
//        for (int i : hop) {
//            System.out.println(sum += i);
//        }
        System.out.println("задания 1-4");
        //Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //2. Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую.
        //4. Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < 3; i++) {
            if (i > 0) {
                System.out.print(",");
            }
            System.out.print(number[i]);
        }
        System.out.println();
        for (int a = 2; a > -1; a--) {
            {
                System.out.print(number[a]);
            }
            if (a > 0)
                System.out.print(",");
        }
        System.out.println();
        for (int b = 0; b < number.length; b++) {
            if (number[b] % 2 != 0) {
                number[b] += 1;
            }
        }
        System.out.println(Arrays.toString(number));
        System.out.println("задание 1.2");
        //Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        double[] fractional = {1.57, 7.654, 9.986};
        for (int o = 0; o < fractional.length; o++) {
            if (o > 0) {
                System.out.printf(",");
            }
            System.out.print(fractional[o]);
        }
        System.out.println();
        for (int k = fractional.length - 1; k >= 0; k--) {
            {
                System.out.print(fractional[k]);
            }
            if (k > 0) {
                System.out.printf(",");
            }
        }
        System.out.println();
        System.out.println("задание 1.3");
        //Произвольный массив – тип и количество данных определите сами.
        // Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.
        int[] leapYear = {2000, 2004, 2008, 2012};
        for (int i = 0; i < leapYear.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(leapYear[i]);
        }
        System.out.println();
        for (int d = leapYear.length - 1; d >= 0; d--) {
            System.out.print(leapYear[d]);
            if (d > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("циклы часть 2. Задание 1");
        //Первым делом бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Сумма трат за месяц составила … рублей».
        //ПРОБНЫЙ РАНДОМ
        int summa = 0;
        int[] salary2 = generateRandomArray();
        for (int value : salary2) {
            summa += value;
        }
        int[] salaryInDay = {85000, 33000, 10000, 1000, 2000, 7000, 83000, 99000, 644, 55000, 840, 97025, 4567, 123456, 8520, 7412, 9632, 5872, 9634, 7564, 5902, 3364,
                6987, 478, 63258, 9647, 2034, 2597, 4783, 1249, 547};
        int sumSalary = 0;
        for (int i : salaryInDay) {
            sumSalary += i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей", sumSalary);
        System.out.println();
        System.out.println("Задание 2");
        //Следующая задача — найти минимальную и максимальную трату за день.
        //Нужно написать программу, которая решит эту задачу, и вывести в консоль результат
        //в формате: «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int min = 200000;
        for (int i = 0; i < salaryInDay.length; ) {
            if (salaryInDay[i] < min) min = salaryInDay[i];
            i++;
        }
        int max = 0;
        for (int i = 0; i < salaryInDay.length; ) {
            if (salaryInDay[i] > max) max = salaryInDay[i];
            i++;
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей. \n", min, max);
        System.out.println("Задание 3");
        //А теперь нам нужно понять, какую в среднем сумму наша компания тратила в течение данных 30 дней.
        //Нужно написать программу, которая посчитает среднее значение трат за месяц
        // (то есть сумму всех трат за месяц поделить на количество дней), и вывести в консоль результат в формате:
        // «Средняя сумма трат за месяц составила … рублей».
        //**Важно помнить:** подсчет среднего значения может иметь остаток (то есть быть не целым, а дробным числом).
        float mediumSalary = 0f;
        mediumSalary = sumSalary / salaryInDay.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей \n", mediumSalary);
        System.out.println("Задание 4");
        //Отойдем от подсчетов.
        //В нашей бухгалтерской книге появился баг. Что-то пошло нет так, и Ф. И. О.
        // сотрудников начали отображаться в обратную сторону. Т. е. вместо «Иванов Иван Иванович» мы имеем «чивонавИ навИ вонавИ».
        //Данные с именами сотрудников хранятся в виде массива символов (char[])
        //Напишите код, который в случае такого бага будет выводить Ф. И. О. сотрудников в корректном виде.
        // В качестве данных для массива используйте:
        //char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        //В результате в консоль должно быть выведено "Ivanov Ivan".
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        //доп задания
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}















