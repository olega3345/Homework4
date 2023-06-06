public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int airTemperature = 4;
        if (airTemperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int speed = 70;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int age = 66;
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно спать");
        }
        if (2 < age && age < 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (7 < age && age < 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (18 < age && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        if (24 < age && age < 60) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть");
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int age = 17;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему нельзя кататься на аттракционе");
        }
        if (5 < age && age < 14) {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослых");
        } else {
            System.out.println("Если возраст ребёнка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослых");
        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int carpacity = 102; // всего
        int seatsCount = 60; // сидячие
        int otherCount = carpacity - seatsCount; // стоячие места

        int seatsUsed = 23; // сидячие используемые
        int otherUsed = 77; // стоячие используемые
        if (seatsUsed < seatsCount) {
            System.out.println("Есть еще " + (seatsCount - seatsUsed) + " сидячих мест");
        }
        if (seatsUsed == seatsCount) {
            System.out.println("Сидячих мест нет!");
        }
        if (otherUsed < otherCount) {
            System.out.println("Есть еще " + (otherCount - otherUsed) + " стоячих мест");
        } else {
            System.out.println("Стоячих мест нет!");
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int one = 101;
        int two = 4;
        int three = 101;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число " + one);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else if (two > one) {
            if (two >= three) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число " + one);
            } else if (three > one) {
                System.out.println("Максимальное число " + three);
            } else {
                System.out.println("Все 3 числа равны");
            }
        }
    }
}















