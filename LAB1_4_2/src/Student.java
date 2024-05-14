public class Student {
    private String lastName;
    private String firstName;
    private int group;
    private long studentID;

    // Конструктор для створення студента
    public Student(String lastName, String firstName, int group, long studentID) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
        this.studentID = studentID;
    }

    // Геттери та сеттери
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }
}
