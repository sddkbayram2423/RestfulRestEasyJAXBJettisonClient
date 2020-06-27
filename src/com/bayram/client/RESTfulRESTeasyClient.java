package com.bayram.client;

import javax.ws.rs.client.Entity;


import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import com.bayram.ogrenci.Ogrenci;

public class RESTfulRESTeasyClient {
	public static void main(String[] args) {
		String ogrenci1="{\"ogrenci\":{\"id\":1,\"adi\":\"ali\",\"soyadi\":\"kara\",\"yas\":27}}";
		String ogrenci2="{\"ogrenci\":{\"id\":2,\"adi\":\"Nedim\",\"soyadi\":\"Arpa\",\"yas\":23}}";
		Ogrenci ogrenci=new Ogrenci(3, "Bahar", "Cicek", 32);
		
		try {
			
			ResteasyClient client=new ResteasyClientBuilder().build();
			ResteasyWebTarget resteasyWebTarget=client.target("http://localhost:8090/rest/ogrenci/oku/45/ali/kara/27");
		
			
			Response response=resteasyWebTarget.request().post(Entity.entity(ogrenci1,MediaType.APPLICATION_JSON));
			
			
			if(response.getStatus()!=200) {
				throw new RuntimeException();
				
			}
			System.out.println(response.readEntity(String.class));
			

			response=resteasyWebTarget.request().post(Entity.entity(ogrenci2,MediaType.APPLICATION_JSON));
			
			
			if(response.getStatus()!=200) {
				throw new RuntimeException();
				
			}
			System.out.println(response.readEntity(String.class));
			

			response=resteasyWebTarget.request().post(Entity.entity(ogrenci,MediaType.APPLICATION_JSON));
			
			
			if(response.getStatus()!=200) {
				throw new RuntimeException();
				
			}
			System.out.println( response.readEntity(String.class));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
