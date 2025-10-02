public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Тебе " + age + " лет. Ты уже достиг совершенолетия");
        } else {
            System.out.println("Тебе " + age + " лет. Ты еще не достиг совершенолетия. Нужно немного подождать");
        }
        ;
        System.out.println("Задание 2");
        int temperatureDegrees = 5;
        if (temperatureDegrees > 5) {
            System.out.println("На улице " + temperatureDegrees + " градусов. Тепло. Можно идти без шапки");
        } else {
            System.out.println("На улице " + temperatureDegrees + " градусов. Холодно. Нужно надеть шапку");
        }

        System.out.println("Задание 3");
        int vehicleSpeed = 61;
        if (vehicleSpeed > 60) {
            System.out.println("Если скорость транспортного средства " + vehicleSpeed + "км/ч, то придётся заплатить штраф");
        } else {
            System.out.println("Если скорость транспортного средства " + vehicleSpeed + "км/ч, то можно ехать спокойно");
        }
        System.out.println("Задание 4");
        age = 17;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 17) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }
        System.out.println("Задание 5");
        age = 14;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на аттракционах");
        } else if (age >= 5 && age < 14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционах в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционах без сопровождения");
        }
        System.out.println("Задание 6");
        int trainCapacity = 102;
        int numberOfPeople = 102;
        int numberOfSeats = 60;
        if (numberOfPeople>=numberOfSeats && numberOfPeople<102) {
            System.out.println ("В вагоне есть стоячие места");
        } else if (numberOfPeople<numberOfSeats && numberOfPeople<102) {
            System.out.println ("В вагоне есть сидячие места");
        } else {
            System.out.println ("Вагон переполнен");
        }
        System.out.println("Задание 7"); // Задача корректна только при разных числах
        int one = 5;
        int two = 7;
        int three = 1;
        if (one>two && one>three) {
            System.out.println ("Число "+ one +" самое большое");
        } else if (two>one && two>three) {
            System.out.println ("Число "+ two +" самое большое");
        } else
        {
            System.out.println ("Число "+ three +" самое большое");
        }
    }

}


