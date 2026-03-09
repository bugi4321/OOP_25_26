package pckg_cls_obj;

public class Student {
    private String name;
    private String surname;
    private int id;

    public Student(String name, String surname, int id){
        this.name= name;
        this.surname = surname;
        this.id = id;
    }

    public void subscribeToStudentService(){
        System.out.println("Students id is  "  +id);
        System.out.println(name +" - " +  surname +" subbed to student service..");
    }
}
