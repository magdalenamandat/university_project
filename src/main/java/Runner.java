import db.DBHelper;
import models.Course;
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
    }
}
