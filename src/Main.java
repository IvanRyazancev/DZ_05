import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controller.Controller;
import model.Disciplines;
import model.Group;
import model.Student;
import model.Teacher;

public class Main {
    public static void main(String[] args) {
        /*
        — Создать класс УчебнаяГруппа, содержащий в себе поля Преподаватель и список Студентов;
        — Создать класс УчебнаяГруппаСервис, в котором реализована функция (входные параметры - (Teacher,
            List<Strudent>)) формирования из Студентов и Преподавателя УчебнойГруппы и возвращения его;
        — Создать метод в Контроллере, в котором агрегируются функции получения списка студентов (их id)
            и преподавателя (его id) и формирования учебной группы, путём вызова метода из сервиса;
        — Всё вышеуказанное создать согласно принципам ООП, пройдённым на семинаре.
         */
        Controller controller = new Controller();
        Teacher master = new Teacher("Yoda", 1077, Disciplines.PROGRAMMING);
        Student student1 = new Student("Asoka", 1990);
        Student student2 = controller.createStudent("Anakin", 1980);
        // Проверка, что через контроллер тоже создается
        Student student3 = new Student("Mace Windu", 1948);
        List<Student> list = new ArrayList<>(Arrays.asList(student1, student2, student3));
        Group jedi = controller.createGroup(list, master);
        controller.readGroup(jedi);

        Teacher darkLord = new Teacher("Palpatine", 1577, Disciplines.LITERATURE);
        Student student4 = new Student("Darth Maul", 1970);
        Student student5 = new Student("Darth Vader", 1980);
        Student student6 = new Student("Ben Solo", 1999);
        List<Student> list2 = new ArrayList<>(Arrays.asList(student4, student5, student6));
        Group sith = controller.createGroup(list2, darkLord);
        controller.readGroup(sith);

    }
}