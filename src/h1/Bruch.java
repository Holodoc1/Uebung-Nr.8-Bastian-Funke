package h1;

public class Bruch {
	int zaehler;
	int nenner;
	
	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		this.nenner = nenner;
	}
	
	private int ggT(int x, int y) {
		if(x > 0 && y > 0 && x > y) {
			while((x % y) > 0) {
				int r = x % y;
				x = y;
				y = r;
			}
			return y;
		}
		return -1;
	}
	
	public void shorten() {
		if(Math.abs(zaehler)> 0 && Math.abs(nenner) > 0) {
			if(Math.abs(zaehler) > Math.abs(nenner)) {
				while(ggT(Math.abs(zaehler),Math.abs(nenner)) > 1) {
					int ggt = ggT(Math.abs(zaehler), Math.abs(nenner));
					zaehler /= ggt;
					nenner /= ggt;
				}
			}
			else if(Math.abs(nenner) > Math.abs(zaehler)) {
				while(ggT(Math.abs(nenner), Math.abs(zaehler)) > 1) {
					int ggt = ggT(Math.abs(nenner), Math.abs(zaehler));
					zaehler /= ggt;
					nenner /= ggt;
				}
			}
			else {
				zaehler = 1;
				nenner = 1;
			}
		}
	}
	
	public boolean hasSameValueAs(Bruch b) {
		Bruch temp = new Bruch(zaehler, nenner);
		temp.shorten();
		b.shorten();
		if(temp.zaehler == b.zaehler && temp.nenner == b.nenner) return true;
		else return false;
	}
}