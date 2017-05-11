package domain;

public class Punt {
	private int x;
	private int y;
	
	public Punt(int x, int y){
		setX(x);
		setY(y);	
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean equals(Object object) {
		boolean result = false;
		if (object instanceof Punt) {
			Punt p = (Punt) object;
			if (p.getX() == this.getX() && p.getY() == this.getY()) {
				result = true;
			}
		}
		return result;
	}
	
	public String toString(){
		return "x-coordinaat: " + this.getX() + " " + "y-coordinaat: " + this.getY();		
	}

}
