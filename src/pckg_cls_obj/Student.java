package pckg_cls_obj;

public class Student {
    private String name;
    private String surname;
    private int id;
    private static int cntID;

    public Student(String name, String surname){
        this.id = cntID;
        cntID++;
        this.name = name;
        this.surname = surname;

    }
    public Student(String name , String surname, int id){
        this(name,surname);
        this.id = id;
    }


    public void subscribeToStudentService(){
        System.out.println("Students id is  "  +id);
        System.out.println(name +" - " +  surname +" subbed to student service..");
    }

    public Hlace operiMe(Hlace hlace) {
        hlace.setCiste(true);
        System.out.println(this + "je oprao hlace");
        return hlace;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                '}';
    }
}
