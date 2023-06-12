package model;

public class Student extends User {
    static Integer idGenerator = 0;
    public Integer studenId;
    public Integer bornYear;

    public Student(String name, Integer bornYear) {
        super(name, bornYear);
        this.studenId = idGenerator++;
    }

    public Student() {
        super();
        this.studenId = idGenerator++;
    }

    @Override
    public String toString() {
        return studenId + " " + super.toString();
    }
}