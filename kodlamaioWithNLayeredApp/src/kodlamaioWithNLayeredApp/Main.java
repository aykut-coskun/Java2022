package kodlamaioWithNLayeredApp;

import kodlamaioWithNLayeredApp.business.CategoryManager;
import kodlamaioWithNLayeredApp.business.CourseManager;
import kodlamaioWithNLayeredApp.business.InstructorManager;
import kodlamaioWithNLayeredApp.core.logging.DatabaseLogger;
import kodlamaioWithNLayeredApp.core.logging.FileLogger;
import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.core.logging.MailLogger;
import kodlamaioWithNLayeredApp.dataAccess.HibernateCourseDao;
import kodlamaioWithNLayeredApp.dataAccess.JdbcCategoryDao;
import kodlamaioWithNLayeredApp.dataAccess.JdbcInstructorDao;
import kodlamaioWithNLayeredApp.entities.Category;
import kodlamaioWithNLayeredApp.entities.Course;
import kodlamaioWithNLayeredApp.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};
		
		
		Category category1 = new Category(4, "Game Development");
		CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);

		
		System.out.println("----------------------------------------");
		
		
		Course course1 = new Course(4, "Python", "Engin Demiroğ", "Backend", 100);
		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		
		
		System.out.println("----------------------------------------");
		
		Instructor instructor = new Instructor(1,"Engin", "Demiroğ");
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor);
		
		
	}
}

