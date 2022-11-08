package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir");
		}
		

	}
}









//manager sınıfları asla static yapılmaz
// manager sınıfnda bir data olsaydı örn; int bisey=5 verdiğimizde ->
// -> bir kullanıcı bunu 5 yaptığında diğer kullanıcıların da 5 oluyor

//ProductValidator gibi kullan-bırak araçlar static yapılabilir