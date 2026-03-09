package pckg_cls_obj;

public class AppTest {
    public static void main(String[] args) {
        Student s1 = new Student("Petar", "Petric", 12);
        Student s2 = new Student("Franka", "Franic", 43);
        s1.subscribeToStudentService();
    }
}
