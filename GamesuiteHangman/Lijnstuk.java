package domain;

import domain.exceptions.*;

public class Lijnstuk {
	private Punt startPunt;
	private Punt eindPunt;
	
	public Lijnstuk(Punt startPunt, Punt eindPunt){
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
	

	public boolean equals(Lijnstuk p){
		if(p == null) return false;
		if(p.eindPunt == null || p.startPunt == null){
			return false;
		}
		if(p.eindPunt == eindPunt && p.startPunt == startPunt){
			return true;
		}else{
			return false;
		}
	}
	
	public String toString(){
		return "Lijn: " + "startpunt: " + getStartPunt() + "-" + "eindpunt: " + getEindPunt();
	}
	
}
