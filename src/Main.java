public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    public static void task2() {
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        String wordЁequalsЕ = fullName.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника — "+wordЁequalsЕ);
    }

    public static void task1() {
        System.out.println("Задание 1-2");
        String firstName = "ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = "Ivanov " + "ivan " + "Ivanovich ";
        int day = 29;     //  тут меняем дату
        if (day >=30) {
            String upper = fullName.toUpperCase();
            System.out.println(upper);
        }else
            System.out.println("ФИО сотрудника — " + fullName);
    }
}
