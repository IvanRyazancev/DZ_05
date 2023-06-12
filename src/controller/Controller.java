package controller;

import model.Group;
import model.Student;
import model.Teacher;
import service.DataServiceImpl;
import service.GroupServiceImpl;

import java.util.List;

public class Controller {
    DataServiceImpl dataService;
    GroupServiceImpl groupService;

    public Controller() {
        this.dataService = new DataServiceImpl();
        this.groupService = new GroupServiceImpl();
    }

    public Group createGroup(List<Student> inputList, Teacher teacher) {

        return groupService.createGroup(inputList, teacher);
    }

    public void readGroup(Group group) {
        groupService.readGroup(group);
    }

    public Student createStudent(String name, Integer bornYear) {
        return dataService.createStudent(name, bornYear);
    }

    public void readStudent(Student student) {
        dataService.readStudent(student);
    }

    public Teacher createTeacher(Teacher inputTeacher) {
        return dataService.createTeacher(inputTeacher.name, inputTeacher.BornYear, inputTeacher.disciplinesTaught);
    }

    public void readTeacher(Teacher teacher) {
        dataService.readTeacher(teacher);
    }

}