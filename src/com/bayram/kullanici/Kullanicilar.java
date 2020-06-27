package com.bayram.kullanici;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "kullanicilar")
public class Kullanicilar {
	
	@XmlAttribute
	private ArrayList<Kullanici> kullanicis;

	public ArrayList<Kullanici> getKullanicis() {
		return kullanicis;
	}

	public void setKullanicis(ArrayList<Kullanici> kullanicis) {
		this.kullanicis = kullanicis;
	}
	
	

}
