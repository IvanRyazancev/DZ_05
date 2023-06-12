package service;

import model.Disciplines;
import model.Student;
import model.Teacher;

public interface Service {
    // public void create(List<Student> inputList, Teacher teacher);
    public Student createStudent(String name, Integer bornYear);
    public Teacher createTeacher(String name, Integer bornYear, Disciplines disciplinesTaught);

    public void readStudent(Student student);
    public void readTeacher(Teacher teacher);
}