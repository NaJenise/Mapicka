import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Random;

public class MapaSveta extends HashMap<Integer, Lokalita> implements Serializable {
	private int zacatek = 4;
	private int aktualniPoloha = zacatek;

	public static MapaSveta nacti(String nazevSouboru) throws IOException {
		MapaSveta mapa = new MapaSveta();
		BufferedReader reader = new BufferedReader(new FileReader(nazevSouboru));
		String radek = "";
		while ((radek = reader.readLine()) != null) {
			String[] pole = radek.split(";");
			Lokalita lokalita = new Lokalita(pole[1], Integer.parseInt(pole[0]));
			for (int i = 0; i < 4; i++) {
				lokalita.pripojLokalitu(i, Integer.parseInt(pole[i + 2]));
			}
			mapa.put(lokalita.getId(), lokalita);
		}
		reader.close();
		return mapa;
	}

	public MapaSveta() {
		Random rnd = new Random();
		int p = rnd.nextInt(3);
		for (int i = 0; i < p; i++) {
			String s = "";
			switch (rnd.nextInt(3)) {
			case 0:
				s = "AK-47";
				break;
			case 1:
				s = "SPAS shotgun";
				break;
			case 2:
				s = "M4A1-S";
				break;
			}
			String popis = "má ";
			switch (rnd.nextInt(3)) {
			case 0:
				s = "plný zásobník";
				break;
			case 1:
				s = "jeden náboj";
				break;
			case 2:
				s = "poloprázdný zásobník";

			}

		}

	}

	public String nazevAktualniPolohy() {
		return this.get(aktualniPoloha).toString();
	}

	public boolean jdiNa(int smer) {
		int idKam = this.get(aktualniPoloha).getSmer(smer);
		if (idKam == -1) {
			return false;
		}
		aktualniPoloha = idKam;
		return true;

	}

}
