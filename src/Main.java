
public class Main {
    public static void main(String[] args) {
    Teacher teacher1 = new Teacher("Hikmat", "Novruzaliyev", 31, "male");
    teacher1.eating();
    teacher1.teaching();
    teacher1.sleeping();
    teacher1.grading();
    Student student1 = new Student("Ali", "Ibrahim", 28, "male");
    student1.eating();
    student1.takingExam();
    student1.studying();
    }
}