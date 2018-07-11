import db.DBHelper;
import models.*;

public class Runner {

    public static void main(String[] args){

        Course course1 = new Course("3D Animation", "HND");
        DBHelper.save(course1);
        Course course2 = new Course("Computing", "HNC");
        DBHelper.save(course2);

        Mentor mentor1 = new Mentor("Tony");
        DBHelper.save(mentor1);
        Mentor mentor2 = new Mentor("Zsolt");
        DBHelper.save(mentor2);

        Student student1 = new Student("Magda", 22, 132, course2, mentor1);
        DBHelper.save(student1);
        Student student2 = new Student("Jesus", 4, 164, course1, mentor2);
        DBHelper.save(student2);

        Instructor instructor1 = new Instructor("John");

        Lesson lesson1 = new Lesson("Java", 10, course2, instructor1);
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("Ruby", 20, course2, instructor1);
        DBHelper.save(lesson2);
        Lesson lesson3 = new Lesson("Maya", 25, course1, instructor1);
        DBHelper.save(lesson3);


    }
}
