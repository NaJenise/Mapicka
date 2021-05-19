
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
					System.out.println("Kam chceš jít?");
					int a = sc.nextInt();
					
					if(!mapa.jdiNa(a)) {
						System.out.println("nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
					System.out.println("Kam chceš jít?");
					int b = sc.nextInt();
					if(!mapa.jdiNa(b)) {
						System.out.println("nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
					System.out.println("Kam chceš jít?");
					int c = sc.nextInt();
					if(!mapa.jdiNa(c)) {
						System.out.println("nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
					System.out.println("Kam chceš jít?");
					int d = sc.nextInt();
					if(!mapa.jdiNa(d)) {
						System.out.println("nelze");
					}
					System.out.println("Misto: "+mapa.nazevAktualniPolohy());
				} catch(FileNotFoundException e) {
					System.out.println("Soubor s mapou herního svìta nebyl nalezen.");
				} catch (IOException ex) {
					System.out.println("Nastal problém pøi ètení dat ze souboru.");
				} catch (Exception ex) {
					System.out.println("Data v souboru nepøedstavují mapu svìta.");
					System.out.print("Pokud není problém s daty v souboru, asi jste pøi programování pokazili");
					System.out.print("ještì nìco jiného.");
				}

	}

}
