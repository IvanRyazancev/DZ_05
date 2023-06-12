package model;

public class Teacher extends User {
    static Integer idGenerator = 0;
    public Disciplines disciplinesTaught;
    public int idTeacher;

    public Teacher(String name, Integer bornYear, Disciplines discipline) {
        super(name, bornYear);
        this.disciplinesTaught = discipline;
        this.idTeacher = idGenerator++;
    }

    public Teacher() {
        super();
        this.idTeacher = idGenerator++;
        this.disciplinesTaught = Disciplines.Empty;
    }

    public Disciplines getDisciplesTaught() {
        return disciplinesTaught;
    }

    @Override
    public String toString() {
        return "teacher " + idTeacher + " " + disciplinesTaught + " " + super.toString();
    }
}