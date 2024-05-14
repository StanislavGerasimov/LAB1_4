public class BubbleSort {
    // Метод для сортування масиву студентів за індексами
    public static void sortByIndex(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                // Спочатку порівнюємо за номером групи
                if (students[j].getGroup() > students[j+1].getGroup() ||
                        (students[j].getGroup() == students[j+1].getGroup() &&
                                students[j].getStudentID() > students[j+1].getStudentID())) {
                    // Міняємо місцями елементи масиву, якщо поточний елемент більший за наступний
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }
        }
    }
}
