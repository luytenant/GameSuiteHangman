package domain;



public class LijnStuk {
	private Punt startPunt;
	private Punt eindPunt;
	
	public LijnStuk(Punt startPunt, Punt eindPunt){
		setStartEnEindPunt(startPunt, eindPunt);
		
	}
	
	public void setStartEnEindPunt(Punt startPunt, Punt eindPunt){
		if(startPunt == null || eindPunt == null || startPunt == eindPunt){
			throw new DomainException("start- en eindpunt mogen niet 0 zijn!");
		}else{
		this.startPunt = startPunt;
		this.eindPunt = eindPunt;
		}
		
	}

	public Punt getStartPunt() {
		return startPunt;
	}

	public Punt getEindPunt() {
		return eindPunt;
	}
	

	public boolean equals(Object object) {
		boolean result = false;
		if (object instanceof LijnStuk) {
			LijnStuk p = (LijnStuk) object;
			if (p.getEindPunt().equals(this.getEindPunt()) && p.getStartPunt().equals(this.getStartPunt())) {
				result = true;
			}
		}
		return result;
	}
	
	public String toString(){
		return "Lijn: " + "startpunt: " + getStartPunt() + "-" + "eindpunt: " + getEindPunt();
	}
	
}
