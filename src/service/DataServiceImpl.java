package service;

import model.Disciplines;
import model.Student;
import model.Teacher;

public class DataServiceImpl implements Service {

    @Override
    public Student createStudent(String name, Integer bornYear) {
        Student student = new Student();
        student.name = name;
        student.BornYear = bornYear;
        return student;
    }

    @Override
    public void readStudent(Student student) {
        System.out.println(student.studenId + " " + student.name + " " + student.bornYear);
    }

    @Override
    public Teacher createTeacher(String name, Integer bornYear, Disciplines disciplinesTaught) {
        Teacher teacher = new Teacher();
        teacher.name = name;
        teacher.BornYear = bornYear;
        teacher.disciplinesTaught = disciplinesTaught;
        return teacher;
    }

    @Override
    public void readTeacher(Teacher teacher) {
        System.out.println(teacher.idTeacher + " " + teacher.name + " " + teacher.BornYear + teacher.disciplinesTaught);
    }
}