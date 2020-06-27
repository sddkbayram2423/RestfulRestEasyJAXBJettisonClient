package com.bayram.kullanici;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "kullanici")
public class Kullanici implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@XmlAnyAttribute
	private int id;
	@XmlElement
	private String uri;
	@XmlElement
	private String adi;
	@XmlElement
	private String soyadi;
	
	public Kullanici() {
	}

	public Kullanici(int id, String uri, String adi, String soyadi) {
		super();
		this.id = id;
		this.uri = uri;
		this.adi = adi;
		this.soyadi = soyadi;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	@Override
	public String toString() {
		return "Kullanici [id=" + id + ", uri=" + uri + ", adi=" + adi + ", soyadi=" + soyadi + "]";
	}
	
	
}
