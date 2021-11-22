package day08;

import java.util.Scanner;

public class C08_LastIndexOf_Cumlede_HarfKacKezVar {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir harf isteyin, 
        // harfin cumlede var olup olmadigini yazdirin
        
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        
        String cumle=scan.nextLine();
        System.out.println("Lutfen varligini kontrol etmek icin bir harf giriniz");
        
        char krk=scan.next().charAt(0);
        
        int index= cumle.lastIndexOf(krk);
        
        if (index == -1) {
			System.out.println("harf cumlede kullanilmamis");
		} else {
			System.out.println("harf cumlede kullanilmis");
		}

        scan.close();
        
	}

}