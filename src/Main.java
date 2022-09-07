import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Задание 1");

        int age = 15;
        if (age >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        }
        if (age < 18) {
            System.out.println("Твоё совершеннолетие еще не наступило, тебе придется подождать.");
        }

        System.out.println(" Задание 2");

        int age2 = 22;
        if (age2 >= 7) {
            System.out.println(" Ребёнок ходит в школу.");
        }
        if (age2 >= 18) {
            System.out.println(" Ты закончил школу, можешь отправлятся в университет.");
        }
        if (age2 >= 24) {
            System.out.println(" Тебе пора искать первую работу.");
        }

        System.out.println(" Задание 3");

        int place = 62;
        if (place <= 60) {
            System.out.println(" Есть сидячее место.");
        }
        if (place >= 61)
            if (place <= 102) {
                System.out.println(" Только стоячее место.");
            }

        System.out.println(" Задание 4");

        int age3 = 25;
        if (age3 >= 18) {
            System.out.println("Поздравляю с совершеннолетием!");
        } else {
            System.out.println("Твоё совершеннолетие еще не наступило, тебе придется подождать.");
        }

        System.out.println(" Задание 5");

        int age4 = 21;
        if (age4 >= 7 && age4 <= 17) {
            System.out.println(" Ребёнок ходит в школу.");
        } else if (age4 >= 18 && age4 <= 23) {
            System.out.println(" Ты закончил школу, можешь отправлятся в университет.");
        } else if (age4 >= 24) {
            System.out.println(" Тебе пора искать первую работу.");
        }

        System.out.println(" Задание 6");

        int place1 = 53;
        if (place1 <= 60) {
            System.out.println(" Есть сидячее место.");
        } else if (place1 >= 61 && place1 <= 102) {
            System.out.println(" Только стоячее место.");
        }

        System.out.println(" Задание 7");

        int age5 = 19;
        if ( age5 >= 2 && age5 <=6) {
            System.out.println(" Тебе ходить в детский сад.");
        }
        else if ( age5 >= 7 && age5 <= 18) {
            System.out.println(" Ходи в школу.");
        }
        else if ( age5 >= 18 && age5 <= 24) {
            System.out.println(" Иди ка в университет.");
        }
        else if ( age5 >= 25) {
            System.out.println(" Пора идти на работу.");
        }

        System.out.println(" Задание 8");

        int age6 = 7;
        if (age6 <= 5) {
            System.out.println(" Ты не можешь кататься на аттракционе.");
        }
        else if (age6 >= 7 && age6 <= 14) {
            System.out.println( " Ты можешь кататься на аттракционе с взрослым. Если взрослого нет, кататься нельзя.");
        }
        else if ( age6 >=15) {
            System.out.println( " Ты можешь кататься сам.");
        }

        System.out.println(" Задание 9");

        int one = 1;
        int two = 2;
        int three = 3;
        if (one < two && two < three){
        }
        else if (two > one && two < three) {
        }
         else if ( three > one && three > two);
        System.out.println("three > one && three > two");







        





    }
}