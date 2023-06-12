package service;

import model.Group;
import model.Student;
import model.Teacher;

import java.util.List;

public interface GroupService {
    public Group createGroup(List<Student> studentList, Teacher teacher);

    public void readGroup(Group group);
}