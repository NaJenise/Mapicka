import java.util.Random;

public class Svet {
	
	private Lokalita[][] lokality;
	private int w,h;
	
	public boolean canGoNorth(int x,int y) {
		return !(y==0);
	}
	public boolean canGoSouth(int x,int y) {
		return !(y==h-1);
	}
	public boolean canGoWest(int x,int y) {
		return !(x==0);
	}
	public boolean canGoEast(int x,int y) {
		return !(x==w-1);
	}
	
	public Svet(int w,int h) {
		this.w=w;
		this.h=h;
		lokality=new Lokalita[w][];
		Random r = new Random();
		for(int i=0;i<w;i++) {
			lokality[i]=new Lokalita[h];
			for(int j=0;j<h;j++) {
				Lokalita l=null;
				switch(r.nextInt(4)) {
					case 0: l=new Lokalita("Les");break;
					case 1: l=new Lokalita("Louka");break;
					case 2: l=new Lokalita("Skála");break;
					case 3: l=new Lokalita("Jezero");break;
				}
				int p=r.nextInt(3);
				for(int k=0;k<p;k++) {
					String s="";
					switch(r.nextInt(4)) {
						case 0: s="Lesevec";break;
						case 1: s="Jesevec";break;
						case 2: s="Ještìrevec";break;
						case 3: s="Vec";break;
					}
					String popis="Je ";	
					switch(r.nextInt(4)) {
						case 0: popis+="otylý";break;
						case 1: popis+="opilý";break;
						case 2: popis+="šílený";break;
						case 3: popis+="moudrý";break;
					}
					popis+=" a ";
					switch(r.nextInt(2)) {
						case 0: popis+="nízký";break;
						case 1: popis+="vysoký";break;
					}
					popis+=".";
					l.getNpcs().add(new NPC(s,popis));
				}
				p=r.nextInt(3);
				for(int k=0;k<p;k++) {
					String s="";
					switch(r.nextInt(4)) {
						case 0: s="Meè";break;
						case 1: s="Sekera";break;
						case 2: s="Kopí";break;
						case 3: s="Lektvar";break;
					}
					String popis="Je ";	
					switch(r.nextInt(3)) {
						case 0: popis+="jakostní";break;
						case 1: popis+="prùmìrnì kvalitní";break;
						case 2: popis+="v katastrofálním stavu";break;
					}
					popis+=" a ";
					switch(r.nextInt(2)) {
						case 0: popis+="leskne se";break;
						case 1: popis+="je matný";break;
					}
					popis+=".";
					l.getItems().add(new Item(s,popis));
				}
				lokality[i][j]=l;
				
			}
		}
	}
	
	public Lokalita getLokalita(int x,int y) {
		return lokality[x][y];
	}
}
