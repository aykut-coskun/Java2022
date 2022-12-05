package kodlamaioWithNLayeredApp.business;

import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAccess.CourseDao;
import kodlamaioWithNLayeredApp.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers; // List<Logger> loggers yazılabilir

	// CourseManager new'lendiğinde bana CourseDao ver demek↓
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		if (course.getUnitPrice() < 0) {
			throw new Exception("Bir kursun fiyatı 0'dan küçük olamaz");
		}

		Course[] courses = { new Course(1, "C#", "Engin Demiroğ", "Backend", 100),
							new Course(2, "Java", "Engin Demiroğ", "Backend", 120),
							new Course(3, "JavaScript", "Engin Demiroğ", "Frontend", 90) };
		for (Course course1 : courses) {
			if (course.getName() == course1.getName()) {
				throw new Exception("Kurs ismi tekrar edemez");

			}
		}

		courseDao.add(course);

		for (Logger logger : loggers) { // loggers -->[database,file,mail]
			logger.log(course.getName() + " kursu eklendi ");
		}
	}

}
