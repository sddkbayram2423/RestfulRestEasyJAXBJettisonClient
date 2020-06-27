package com.bayram.kurs;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.providers.jaxb.json.BadgerFish;

@Path("/kurs")
public class KursService {
	
	
	
	//	http://localhost:8080/RestfulRestEasyJAXBJettisonClient/rest/kurs/kursliste.json
	@BadgerFish
	@GET
	@Path("/kursliste.json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Kurs> getKurs() {
		
		Kurs kurs=null;
		 List<Kurs> kurslar=new ArrayList<>(); 
		
		for(int i=0;i<10;i++) {
			kurs=new Kurs(i, "dersAdi"+i, "egitmenAdi"+i, i, i);
			kurslar.add(kurs);
		}
		return kurslar;
	}
	//	http://localhost:8080/RestfulRestEasyJAXBJettisonClient/rest/kurs/kursliste.xml
	@BadgerFish
	@GET
	@Path("/kursliste.xml")
	@Produces(MediaType.APPLICATION_XML)
	public List<Kurs> getKurs1() {
		
		Kurs kurs=null;
		 List<Kurs> kurslar=new ArrayList<>(); 
		
		for(int i=0;i<10;i++) {
			kurs=new Kurs(i, "dersAdi"+i, "egitmenAdi"+i, i, i);
			kurslar.add(kurs);
		}
		return kurslar;
	}

}
