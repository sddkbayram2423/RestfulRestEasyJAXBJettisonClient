package com.bayram.kurs;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "kurs")
public class Kurs implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@XmlElement
	private int egitimYili;
	@XmlElement
	private String dersAdi;
	@XmlElement
	private String egitmenAdi;
	@XmlElement
	private int dersSüresi;
	@XmlElement
	private int dersFiyati;
	
	public Kurs() {
	}

	public Kurs(int egitimYili, String dersAdi, String egitmenAdi, int dersSüresi, int dersFiyati) {
		super();
		this.egitimYili = egitimYili;
		this.dersAdi = dersAdi;
		this.egitmenAdi = egitmenAdi;
		this.dersSüresi = dersSüresi;
		this.dersFiyati = dersFiyati;
	}
	

	public void setEgitimYili(int egitimYili) {
		this.egitimYili = egitimYili;
	}

	public void setDersAdi(String dersAdi) {
		this.dersAdi = dersAdi;
	}

	public void setEgitmenAdi(String egitmenAdi) {
		this.egitmenAdi = egitmenAdi;
	}

	public void setDersSüresi(int dersSüresi) {
		this.dersSüresi = dersSüresi;
	}

	public void setDersFiyati(int dersFiyati) {
		this.dersFiyati = dersFiyati;
	}

	@Override
	public String toString() {
		return "Kurs [egitimYili=" + egitimYili + ", dersAdi=" + dersAdi + ", egitmenAdi=" + egitmenAdi
				+ ", dersSüresi=" + dersSüresi + ", dersFiyati=" + dersFiyati + "]";
	}
	
	
}
