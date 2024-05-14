public class Main {
    public static void main(String[] args) {
        // Ініціалізація масиву студентів
        Student[] students = {
                new Student("Петров", "Іван", 2, 12345),
                new Student("Сидорова", "Олена", 1, 23456),
                new Student("Іванов", "Петро", 3, 34567),
                new Student("Коваленко", "Марія", 2, 45678)
        };

        // Виведення вмісту масиву перед сортуванням
        System.out.println("Масив студентів перед сортуванням:");
        printStudents(students);

        // Сортування масиву студентів за зростанням номеру групи за допомогою швидкого сортування
        QuickSort.quickSortByGroup(students);

        // Виведення вмісту масиву після сортування
        System.out.println("\nМасив студентів після сортування:");
        printStudents(students);
    }

    // Метод для виведення масиву студентів на екран
    private static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println("Прізвище: " + student.getLastName() + ", Ім'я: " + student.getFirstName() +
                    ", Група: " + student.getGroup() + ", Номер студентського квитка: " + student.getStudentID());
        }
    }
}
