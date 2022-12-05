package kodlamaioWithNLayeredApp.business;



import kodlamaioWithNLayeredApp.core.logging.Logger;
import kodlamaioWithNLayeredApp.dataAccess.CategoryDao;
import kodlamaioWithNLayeredApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	
	
	//CategoryManager new'lendiğinde bana CategoryDao ver demek↓
	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}


	public void add(Category category) throws Exception {
		Category[] categories = {new Category(1, "Backend"), 
								new Category(2, "Frontend"), 
								new Category(3, "Mobile") };
		for (Category category1 : categories) {
			if(category.getName() == category1.getName()) {
				throw new Exception("Kategori ismi tekrar edemez");
			}
		}
		
		
		categoryDao.add(category);
		
		for (Logger logger : loggers) {
			logger.log(category.getName() + " kategorisi kaydedildi ");
		}
	}
}
