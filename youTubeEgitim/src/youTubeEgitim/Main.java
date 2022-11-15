package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
		
//		CreditManager creditManager = new CreditManager();
//		creditManager.calculate();
//		creditManager.save();
//		
//		Customer customer = new Customer();// instance creation-- örneğini oluşturmak 
//		customer.id = 1;
//		customer.city = "İstanbul";
//	
//		
//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.save();
//		customerManager.delete();
//		
//		Company company = new Company();
//		company.taxNumber = "10000";
//		company.companyName = "Arçelik";
//		company.id = 100;
//		
//		CustomerManager customerManager2 = new CustomerManager(new Person());
//		
//		Person person = new Person();
//		person.firstName = "";
//		person.nationalIdentity = "123456";
//		
//		Customer c1 = new Customer();
//		Customer c2 = new Person();
//		Customer c3 = new Company(); 
		
		//Eğer inheritance varsa bunlar referans tiptir.
		//Yukarıda Person ve Company Customer'dan inherit yaptığı için
		//new'lediğimiz yere yazabiliriz
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		
		
		
		
	}
}
