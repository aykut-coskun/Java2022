package interfaces;

public class Main {

	public static void main(String[] args) {
		
		//ICustomerDal customerDal = new ICustomerDal(); //interfaceler kendini newleyemez
		
		// interface onu implemente eden class'ın referansını tutabilir
		//ICustomerDal customerDal = new OracleCustomerDal();
		
		// Polymorphismin interfacelerle kullanım şekli
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}
}







//extend ile implement'in farkı :bir class birden fazla interface'i implemente ->
// -> edebilir ama sadece bir class'ı extend edebilir

//bir class birden fazla interface'i implemente edebiliyor.

//class'lar, abstract class'lar ve interface'ler -> 
//-> nesne yönelimli programlamanın 3 temel üyesi

// interface bir class olarak kabul edilmiyor ama referans tutabilirler