package domain;
import domain.Punt;
import domain.Rechthoek;
public class Omhullende {
	private int minX;
	private int minY;
	private int maxX;
	private int maxY;
	public Omhullende(int linkerBovenhoek, int breedte, int hoogte){
		this.setLinkerBovenhoek(linkerBovenhoek);
		this.setHoogte(hoogte);
		this.setBreedte(breedte);
	}
	public int getMinX() {
		this.minX = Punt.this.getX();
		return minX;
	}
	
	public int getMaxX() {
		return maxX;
	}
	
	public int getMinY() {
		return minY;
	}
	
	public int getMaxY() {
		return maxY;
	}
	
	
	
	
	
}
