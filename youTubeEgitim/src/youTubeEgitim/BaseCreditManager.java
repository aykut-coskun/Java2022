package youTubeEgitim;

public abstract class BaseCreditManager implements ICreditManager{
	
	public abstract void calculate();
	
	@Override
	public void save() {	
		
		System.out.println("Kaydedldi");
	}
}


// calculate her yerde değişken olduğu için abstract class'ta
// abstract olarak bıraktık sadece imza.
// save her yerde ortak ve tamamlanmış olduğundan içini dolduruyoruz.

//abstract classlar ortak operasyonları tutar
// tamamlanmış olarak 'save', tamamlanmamış olarak 'calculate'
