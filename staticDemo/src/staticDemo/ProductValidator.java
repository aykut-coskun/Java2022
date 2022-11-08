package staticDemo;

public class ProductValidator {
	
	static {
		System.out.println("Statik yapıcı blok çalıştı");
	}
	
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public void bisey() {
		
	}
	

}








//C#'ta yapıcı blok static'te de çalışır parametresiz olan
//Java'da class static olamıyor 

//yapıcı bloklar new'leyince çalışıyor

// satic'ler direkt class ismiyle çağrılır ve bellekte oluşturulur.

//static tanımlandığı zaman uygulama sıfırlanana kadar bellekten atılmaz ->
// -> new'leme yaptıklarımız kullanılıp bellekten atılır

//ProductValidator operasyonu static yaparsak bir kere oluşuyor ve
// bütün kullanıcılar o şekilde kullanır

// '!' ünlem işareti değilse operatörü

// ProductValidator bir ürünü kaydederken güncellerken ürünün kurallara uygun olup 
//olmadığını bulmak için kullanırız