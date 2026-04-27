package vj_hm;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int age;
    private static int cntID= 20;

    public Student(String name, int age){
        this.name = name;
        this.id = cntID++;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public Integer getId(){
        return  this.id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", hash=" + this.hashCode() +
                ", age=" + age +
                '}' ;
    }


    @Override
    public int compareTo(Student other) {
        /*if (this.id > other.id){
            return 1;
        } else if (this.id < other.id) {
            return -1;

        }else {
            return 0;
        }*/

        return Integer.compare(this.id,other.id);
    }
}
