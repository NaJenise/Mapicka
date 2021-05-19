
public class Npc {
	private String jmeno;
	private String vlastnosti;

	public String getJmeno() {
		return jmeno;
	}
	public String getVlastnosti() {
		return vlastnosti;
	}
	public void setJmeno(String jmeno) {
		this.jmeno=jmeno;
	}
    public void setVlastnosti(String vlastnosti) {
    	this.vlastnosti=vlastnosti;
    }
	public Npc(String jmeno, String vlastnosti) {
		this.jmeno = jmeno;
		this.vlastnosti = vlastnosti;
	}

	public String toString() {
		return jmeno + "\n" + vlastnosti;
	}
}
