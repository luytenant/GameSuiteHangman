package domain;

import java.util.ArrayList;

public class Tekening {

	private String naam;
	private ArrayList<Vorm> tekening;
	private static final int MIN_X = 0;
	private static final int MAX_X = 399;
	private static final int MIN_Y = 0;
	private static final int MAX_Y = 399;

	public Tekening(String naam) {

		setNaam(naam);
		this.tekening = new ArrayList<Vorm>();
	}

	private void setNaam(String naam) {
		if (naam == null || naam.trim().isEmpty()) {
			throw new IllegalArgumentException("Naam mag niet leeg zijn!");
		} else {
			this.naam = naam;
		}
	}

	public String getNaam() {
		return this.naam;
	}

	public void voegToe(Vorm vorm) {
		tekening.add(vorm);
	}

	public int getAantalVormen() {
		return tekening.size();
	}

	public Vorm getVorm(int index) {
		return tekening.get(index);
	}

	public boolean equals(Object object) {
		boolean result = false;
		if (object instanceof Tekening) {
			Tekening p = (Tekening) object;
			if (p.getAantalVormen() == this.getAantalVormen()) {
				result = true;
			}
			int counter = 0;
			for (int i = 0; i < tekening.size(); i++) {
				for (int j = 0; j < p.tekening.size(); j++) {
					if (p.getVorm(j) == tekening.get(i)) {
						counter++;
					}
				}
			}
			if (counter == tekening.size() && counter == p.tekening.size()) {
				result = true;
			}else {
				result = false;
			}
		}
		return result;
	}

	public void verwijder(Vorm vorm) {
		tekening.remove(vorm);
	}

	public boolean bevat(Vorm vorm) {
		return tekening.contains(vorm);
	}

}
