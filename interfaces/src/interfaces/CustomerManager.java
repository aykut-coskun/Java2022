package interfaces;

public class CustomerManager {
	
	// CustomerManager'ın ICustomerDal'ı var onun add'ini çağırırız
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		customerDal.add(); // iş kodları yazılır
	}
	
	

}
