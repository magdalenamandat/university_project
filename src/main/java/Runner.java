import db.DBHelper;
import models.Course;
import models.Lesson;
import models.Student;

public class Runner {

    public static void main(String[] args){

        Student student1 = new Student("Magda", 22, 132);
        DBHelper.save(student1);
        Student student2 = new Student("Jesus", 4, 164);
        DBHelper.save(student2);

        Course course1 = new Course("3D Animation", "HND");
        DBHelper.save(course1);
        Course course2 = new Course("Computing", "HNC");
        DBHelper.save(course2);

        Lesson lesson1 = new Lesson("Java", 10);
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("Ruby", 20);
        DBHelper.save(lesson2);
        Lesson lesson3 = new Lesson("Maya", 25);
        DBHelper.save(lesson3);

    }
}
