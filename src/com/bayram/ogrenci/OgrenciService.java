package com.bayram.ogrenci;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/ogrenci")
public class OgrenciService {
	
	
	
//	http://localhost:8080/RestfulRestEasyJAXBJettisonClient/rest/ogrenci/oku/5/ali/bayram/23
	@GET
	@Path("/oku/{id}/{adi}/{soyadi}/{yas}")
	@Produces(MediaType.APPLICATION_JSON)
	public Ogrenci getOgrenci(
			@PathParam("id") int id,
			@PathParam("adi") String adi,
			@PathParam("soyadi") String soyadi,
			@PathParam("yas") int yas) {
		
		return new Ogrenci(id, adi, soyadi, yas);
		
	}
	

	@POST
	@Path("/gönder")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response getOgrenciGönder(Ogrenci ogrenci) {
		
		return Response.status(200).entity(ogrenci).build();
		
	}
	
	
}
