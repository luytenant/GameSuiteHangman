package domain;


public class Omhullende {

    private Punt linkerBovenhoek;
    private int breedte, hoogte;

    public Omhullende(Punt linkerBovenhoek, int breedte, int hoogte) {

        this.setHoogte(hoogte);
        this.setBreedte(breedte);
        this.setLinkerBovenhoek(linkerBovenhoek);

    }

    public int getMIN_X() {
        return this.getLinkerBovenhoek().getX();
    }

    public int getMIN_Y() {
        return this.getLinkerBovenhoek().getY();
    }

    public int getMAX_X() {
        return this.getLinkerBovenhoek().getX() + this.getBreedte();
    }

    public int getMAX_Y() {
        return this.getLinkerBovenhoek().getY() + this.getHoogte();
    }


    public Punt getLinkerBovenhoek() {
        return linkerBovenhoek;
    }

    public void setLinkerBovenhoek(Punt linkerBovenhoek) {
        if (linkerBovenhoek == null) throw new DomainException("");

        this.linkerBovenhoek = linkerBovenhoek;
    }

    public int getBreedte() {
        return breedte;
    }

    public void setBreedte(int breedte) {
        if (breedte < 0) throw new DomainException("");
        this.breedte = breedte;
    }

    public int getHoogte() {
        return hoogte;
    }

    public void setHoogte(int hoogte) {
        if (hoogte < 0) throw new DomainException("");
        this.hoogte = hoogte;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o instanceof Omhullende) {
            Omhullende r = (Omhullende) o;
            if (r.getBreedte() == this.getBreedte() && r.getHoogte() == this.getHoogte() && r.getLinkerBovenhoek().equals(this.getLinkerBovenhoek()))
                return true;
            return false;
        }
        return false;

    }

    @Override
    public String toString() {
        return "Omhullende: positie: " + this.getLinkerBovenhoek().toString() + " - breedte: " + this.getBreedte() + " - hoogte: " + this.getHoogte();
    }
}
