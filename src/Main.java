import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Массивы
        int [] weights = new int[] {90, 91, 93, 94, 90, 89, 86, 0, 0, 0, 0, 0};
        // переменная с количеством ячеек 12. new и квадратные скобки для обозначения массива
        weights[0] = 90;
        // Задаем значение переменной weights в первой ячейке массива. запишем значение 90
        int januaryWeight = weights[0];
        // Обозначим вес за январь, введя его переменную, и справа укажем переменную из массива 0 ячейки weights [0]
        System.out.println(januaryWeight);
        // Распечатаем значение веса за январь в командной строке
        System.out.println(weights[0]);
        System.out.println(weights[4]);
        // Еще один способ распечатать значение переменной из массива weights[0]
        int january = 0;
        System.out.println(weights[january]);
        for (int i = 0; i < weights.length; i++) {
                System.out.println(weights[i]);
        }
        //Задача 1
        System.out.println("Задача 1/1");
        int [] oneTwoThree = new int[12];
        oneTwoThree [0] = 1;
        oneTwoThree [1] = 2;
        oneTwoThree [2] = 3;
        System.out.println(oneTwoThree[0]);
        System.out.println(oneTwoThree[1]);
        System.out.println(oneTwoThree[2]);
        System.out.println("");
        System.out.println("Задача 1/2");
        double [] abc = {1.57, 7.654, 9.986};
        System.out.println(abc[0]);
        System.out.println(abc[1]);
        System.out.println(abc[2]);
        System.out.println("");
        System.out.println("Задача 1/3");
        int [] players = new int [15];
        players [0] = 46;
        players [14] = 87;
        System.out.println(players [0]);
        System.out.println(players[14]);
        for (int i = 0; i < players.length; i++) {
            System.out.println(players[i]);
        }
        System.out.println("");
        System.out.println("Задача 2");
        //1
        int [] task2 = new int[3];
        task2 [0] = 1;
        task2 [1] = 2;
        task2 [2] = 3;
        for (int i = 0; i < task2.length; i++) {
            System.out.print(task2[i]);
            if(i != task2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println(task2 [0] + "," + task2 [1] + "," + task2 [2]);
        //2
        System.out.println("");
        double [] cde = {1.57, 7.654, 9.986};
        for (int i = 0; i < cde.length; i++) {
            System.out.print(cde[i]);
            if (i != task2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println(cde[0] + ", " + cde[1] + ", " + cde[2]);
        //3
        System.out.println("");
        int [] hockeyPlayers = new int [3];
        hockeyPlayers [0] = 46;
        hockeyPlayers [2] = 87;
        for (int i = 0; i < hockeyPlayers.length; i++) {
            System.out.println(hockeyPlayers[0] + ", " + hockeyPlayers[1] + ", " + hockeyPlayers[2]);
        }
        //Задача 3
        System.out.println("");
        System.out.println("Задача 3");
        //1
        int [] task3 = new int[3];
        task3 [0] = 1;
        task3 [1] = 2;
        task3 [2] = 3;
        for (int i = task3.length - 1; i >= 0; i--) {
            System.out.print(task3[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println(task3 [2] + "," + task3 [1] + "," + task3 [0]);
        //2
        System.out.println("");
        double [] abcd = {1.57, 7.654, 9.986};
        for (int i = abcd.length - 1; i >= 0; i--) {
            System.out.print(abcd[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println(abcd[2] + ", " + abcd[1] + ", " + abcd[0]);
        //3
        System.out.println("");
        int [] footbalPlayers = new int [3];
        footbalPlayers [0] = 46;
        footbalPlayers [2] = 87;
        for (int i = footbalPlayers.length - 1; i >= 0; i--) {
            System.out.print(footbalPlayers[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int b = 0; b < players.length; b++) {
            System.out.println(footbalPlayers[2] + ", " + footbalPlayers[1] + ", " + footbalPlayers[0]);
        }
        //Задача 4
        System.out.println("");
        System.out.println("Задача 4");
        int [] task4 = {1, 2, 3};
        for (int i = 0; i < task4.length; i++) {
            if (task4[i] % 2 != 0) {
                task4[i] += 1;
            }
        }
        System.out.println(Arrays.toString(task4));





    }

}
