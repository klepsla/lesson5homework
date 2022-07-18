public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //Задание № 1

        int i = 1, j = 10;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (;j >= 1;) {
            System.out.print(j + " ");
            j--;
        }

        System.out.println();

        //Задание № 2

        for (int Friday = 5; Friday <= 31; Friday = Friday + 7) {
                System.out.println("Сегодня пятница, " + Friday + " число. Необходимо подготовить отчёт.");
            }



        //Задание № 3

        int b = 2022 - 200;
        int a = 2022 + 100;
        for (int s = 0; s <= a; s++) {
            if (s % 79 == 0 && s >= b) {
                System.out.println(s);
            }
        }







    }
}