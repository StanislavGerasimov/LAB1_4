public class QuickSort {
    // Метод для швидкого сортування масиву студентів за зростанням номеру групи
    public static void quickSortByGroup(Student[] students) {
        quickSortByGroup(students, 0, students.length - 1);
    }

    private static void quickSortByGroup(Student[] students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSortByGroup(students, low, pivotIndex - 1);
            quickSortByGroup(students, pivotIndex + 1, high);
        }
    }

    private static int partition(Student[] students, int low, int high) {
        int pivotIndex = getPivotIndex(students, low, high);
        Student pivotValue = students[pivotIndex];
        swap(students, pivotIndex, high); // Поміщаємо півот в кінець масиву
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students[j].getGroup() < pivotValue.getGroup() ||
                    (students[j].getGroup() == pivotValue.getGroup() && students[j].getStudentID() < pivotValue.getStudentID())) {
                i++;
                swap(students, i, j);
            }
        }
        swap(students, i + 1, high); // Повертаємо півот на його правильне місце
        return i + 1;
    }

    private static int getPivotIndex(Student[] students, int low, int high) {
        int mid = low + (high - low) / 2;
        int left = students[low].getGroup();
        int middle = students[mid].getGroup();
        int right = students[high].getGroup();
        if ((left <= middle && left >= right) || (left >= middle && left <= right)) {
            return low;
        } else if ((middle <= left && middle >= right) || (middle >= left && middle <= right)) {
            return mid;
        } else {
            return high;
        }
    }

    private static void swap(Student[] students, int i, int j) {
        Student temp = students[i];
        students[i] = students[j];
        students[j] = temp;
    }
}
