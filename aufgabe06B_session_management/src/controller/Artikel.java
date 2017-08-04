package controller;

public class Artikel {

    private int id;

    private String bezeichnung;

    private double preis;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artikel artikel = (Artikel) o;

        return id == artikel.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Artikel{" + "id=" + id + ", bezeichnung='" + bezeichnung + '\'' + ", preis=" + preis + '}';
    }


    public Artikel(int id, String bezeichnung, double preis) {
        this.id = id;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }
}
