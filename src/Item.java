
public class Item {
	private String nazevItemu;
	private String vlastnostItemu;

	public Item(String nazevItemu, String vlastnostItemu) {
		this.nazevItemu=nazevItemu;
		this.vlastnostItemu=vlastnostItemu;
	}
	
	public String getNazevItemu() {
		return nazevItemu;
	}

	public void setNazevItemu(String nazevItemu) {
		this.nazevItemu = nazevItemu;
	}

	public String getVlastnostItemu() {
		return vlastnostItemu;
	}

	public void setVlastnostItemu(String vlastnostItemu) {
		this.vlastnostItemu = vlastnostItemu;
	}

	public String toString() {
		return nazevItemu + "\n" + vlastnostItemu;
	}
}
