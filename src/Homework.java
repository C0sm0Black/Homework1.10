public class Homework {

    public static void main(String[] args) {

        task1();
        task2();

    }

    private static void task2() {

        System.out.println("Задача 2");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

    }

    private static void task1() {

        System.out.println("Задача 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;

        System.out.println("ФИО сотрудника — " + fullName);

    }

}
