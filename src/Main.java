
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main {

	
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
				try {
					Scanner sc = new Scanner(System.in);
					MapaSveta mapa = MapaSveta.nacti("mapa.csv");
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
					System.out.println("Kam chce� j�t?");
					int a = sc.nextInt();
					
					if(!mapa.jdiNa(a)) {
						System.out.println("nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
					System.out.println("Kam chce� j�t?");
					int b = sc.nextInt();
					if(!mapa.jdiNa(b)) {
						System.out.println("nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
					System.out.println("Kam chce� j�t?");
					int c = sc.nextInt();
					if(!mapa.jdiNa(c)) {
						System.out.println("nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
					System.out.println("Kam chce� j�t?");
					int d = sc.nextInt();
					if(!mapa.jdiNa(d)) {
						System.out.println("nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
				} catch(FileNotFoundException e) {
					System.out.println("Soubor s mapou hern�ho sv�ta nebyl nalezen.");
				} catch (IOException ex) {
					System.out.println("Nastal probl�m p�i �ten� dat ze souboru.");
				} catch (Exception ex) {
					System.out.println("Data v souboru nep�edstavuj� mapu sv�ta.");
					System.out.print("Pokud nen� probl�m s daty v souboru, asi jste p�i programov�n� pokazili");
					System.out.print("je�t� n�co jin�ho.");
				}

	}

}
