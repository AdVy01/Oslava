package cz.czechitas.java2webapps.lekce4.entity;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Informace o jedné lekci.
 */
public class Lekce {
  
  private String nazev;
  private String datum;
  private String casOd;
  private String casDo;
  private String misto;

  public Lekce() {
  }

  public Lekce(String nazev, String datum, String casOd, String casDo, String misto) {
    this.nazev = nazev;
    this.datum = datum;
    this.casOd = casOd;
    this.casDo = casDo;
    this.misto = misto;
  }

  public String getNazev() {
    return nazev;
  }

  public void setNazev(String nazev) {
    this.nazev = nazev;
  }

  public String getDatum() {
    return datum;
  }

  public void setDatum(String datum) {
    this.datum = datum;
  }

  public String getCasOd() {
    return casOd;
  }

  public void setCasOd(String casOd) {
    this.casOd = casOd;
  }

  public String getCasDo() {
    return casDo;
  }

  public void setCasDo(String casDo) {
    this.casDo = casDo;
  }

  public String getMisto() {
    return misto;
  }

  public void setMisto(String misto) {
    this.misto = misto;
  }
}
