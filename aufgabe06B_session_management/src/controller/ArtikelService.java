package controller;

import java.util.TreeMap;

public class ArtikelService {

    private TreeMap<Artikel, String> aKorb;


    public ArtikelService(TreeMap<Artikel, String> aKorb) {
        this.aKorb = new TreeMap<>();
    }


    {
        aKorb.put(new Artikel(1, "USB-Stick", 25.0), "FrontController?todo=addArtikel&id=1");
        aKorb.put(new Artikel(2, "USB-Stick", 25.0), "FrontController?todo=addArtikel&id=2");
        aKorb.put(new Artikel(3, "USB-Stick", 25.0), "FrontController?todo=addArtikel&id=3");
        aKorb.put(new Artikel(4, "USB-Stick", 25.0), "FrontController?todo=addArtikel&id=4");
    }

}
