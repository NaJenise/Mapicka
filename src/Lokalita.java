
import java.io.Serializable;
import java.util.ArrayList;

public class Lokalita implements Serializable {

	private String nazev;

	private int id;

	private ArrayList<Npc> npcka = new ArrayList<Npc>();

	public void pridejNpc(Npc npc) {
		npcka.add(npc);
	}

	public Npc odchodNpc(int index) {
		Npc npc = npcka.get(index);
		npcka.remove(index);
		return npc;
	}

	int[] smery = new int[4];

	private ArrayList<Item> itemy = new ArrayList<Item>();

	public void pridatItem(Item item) {
		itemy.add(item);
	}

	public Lokalita(String nazev, int id) {
		this.nazev = nazev;
		this.id = id;
	}

	public void pripojLokalitu(int smer, int kam) {
		smery[smer] = kam;
	}

	public String toString() {
		String vypis = nazev + "\n";
		for (Npc np : npcka) {
			vypis += np.getJmeno() + ", ";
		}
		return vypis;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSmer(int smer) {
		return smery[smer];
	}
}
