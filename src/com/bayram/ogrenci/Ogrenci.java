package com.bayram.ogrenci;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ogrenci")
public class Ogrenci implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@XmlElement
	private int id;
	
	@XmlElement
	private String adi;
	
	@XmlElement
	private String soyadi;
	
	@XmlElement
	private int yas;
	
	public Ogrenci() {
	}

	public Ogrenci(int id, String adi, String soyadi, int yas) {
		this.id = id;
		this.adi = adi;
		this.soyadi = soyadi;
		this.yas = yas;
	}
	
	

	public void setId(int id) {
		this.id = id;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Ogrenci [id=" + id + ", adi=" + adi + ", soyadi=" + soyadi + ", yas=" + yas + "]";
	}
	

}
