package com.bayram.kullanici;

import java.util.ArrayList;

import javax.ws.rs.GET;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/kullanici")
public class KullaniciService {
	
//	http://localhost:8080/00012_RestfulRestEasyJAXBJettisonClient/rest/kullanici/al
	@GET
	@Path("/al")
	@Produces(MediaType.APPLICATION_XML)
	public Kullanicilar getOgrenci() {
		ArrayList<Kullanici> arrayList=new ArrayList<>();
		
		Kullanicilar kullanicilar=new Kullanicilar();
		Kullanici kullanici;
	

		for(int i=0;i<10;i++) {
			kullanici=new Kullanici(i, "dersAdi"+i, "egitmenAdi"+i, "abc"+i);
			arrayList.add(kullanici);
			kullanicilar.setKullanicis(arrayList);
		}
		return kullanicilar;
		
	}
	
	

}
