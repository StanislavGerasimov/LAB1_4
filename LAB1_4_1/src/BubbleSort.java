public class BubbleSort {
    // Метод для сортування масиву студентів за зростанням номера групи
    public static void sortByGroup(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (students[j].getGroup() > students[j+1].getGroup()) {
                    // Міняємо місцями елементи масиву, якщо номер групи першого елемента більший за другий
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
}
