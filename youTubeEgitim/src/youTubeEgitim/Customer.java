package youTubeEgitim;

public class Customer {
	
	public int id;
	public String city;
	
	public Customer() {//constructor
		System.out.println("Müşteri nesnesi başlatıldı");
	}
	
}


//constructor--> Main klasöründe new bloğunu gördüğü anda 
// stack-heap'te heap olan kısımda nesne oluştuğu zaman
//bir kere çalışacak bloktur.Her nesneyi new'lediğimizde 
// constructor bloğu çalışır.