package pckg_arr_1;

public class MainApp {
    public static void main(String[] args) {
        String[] imena = {"Stjepan","Marija", "Ivana"};
        Student[] students=AUX_CLS.students(imena);
        AUX_CLS.printStudentsFromArray(students);
        AUX_CLS.printElementsFromArray(students);
        Professor[] professori = AUX_CLS.professors(imena);
        AUX_CLS.printElementsFromArray(professori);
    }
}
