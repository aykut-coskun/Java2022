package stringsDemo;

public class StringsDemo {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman sayısı : " + mesaj.length());
		 * System.out.println("5. eleman : " + mesaj.charAt(4));
		 * 
		 * System.out.println(mesaj.concat(" Yaşasın!"));
		 * 
		 * System.out.println(mesaj.startsWith("B"));
		 * 
		 * System.out.println(mesaj.endsWith("."));
		 * 
		 * char[] karakterler= new char[5]; mesaj.getChars(0, 5, karakterler, 0);
		 * System.out.println(karakterler);
		 * 
		 * System.out.println(mesaj.indexOf("av")); // baştan arama yapar
		 * System.out.println(mesaj.lastIndexOf("a")); // sondan arama yapar
		 */

		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 5));// mesajın 2. indeksinden başla 5. indeksine kadar ( 5 dahil değil)

		for (String kelime : mesaj.split(" ")) { // mesajın kelimelerini alt alta yazdırır
			System.out.println(kelime);
		}

		System.out.println("-----------------------");
		System.out.println(mesaj.toLowerCase());// küçük harf yapar
		System.out.println(mesaj.toUpperCase());// büyük harf yapar

		System.out.println(mesaj.trim());

	}

}
