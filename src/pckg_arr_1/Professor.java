package pckg_arr_1;

public class Professor {
    private String name;
    private int id;
    private static int cntID;

    public Professor(String name){
        this.name = name;
        this.id = cntID++;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
