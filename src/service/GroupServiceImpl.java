package service;

import java.util.List;

import model.Group;
import model.Student;
import model.Teacher;

public class GroupServiceImpl implements GroupService {
    static Integer idGenerator = 1;
    List<Student> studentList;
    Teacher teacher;
    Integer id;

    @Override
    public Group createGroup(List<Student> studentList, Teacher teacher) {
        Group group = new Group();
        Group.studentList = studentList;
        Group.teacher = teacher;
        this.id = idGenerator++;
        return group;
    }

    @Override
    public void readGroup(Group group) {
        System.out.println("group №" + group.id);
        System.out.println(Group.teacher);
        for (Student s : Group.studentList) {
            System.out.println("\t" + s);
        }
    }
}