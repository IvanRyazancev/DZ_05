package model;
import java.util.ArrayList;
import java.util.List;

public class Group {
    static Integer idGenerator = 1;
    public static List<Student> studentList;
    public static Teacher teacher;
    public Integer id;

    public Group(List<Student> studentList, Teacher teacher) {
        Group.studentList = studentList;
        Group.teacher = teacher;
        this.id = idGenerator++;
    }

    public Group() {
        Group.studentList = new ArrayList<>();
        this.id = idGenerator++;
    }
}