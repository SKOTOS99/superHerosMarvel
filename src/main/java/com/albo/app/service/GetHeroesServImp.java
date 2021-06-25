package com.albo.app.service;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthorizationInterceptor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class GetHeroesServImp implements GetHeroesServ {

	@Override
	public Map<String, Object> getHeroes() {
		
		Map<String,Object > listParams = new HashMap<>(); 
		RestTemplate restTemplate = new RestTemplate();
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("apikey","2517bfbf1ca4b71db4bc636f266bbed5");
		
		HttpEntity entity = new HttpEntity(headers);
		Map<String, String> apikey = new HashMap<>();
		apikey.put("apikey","2517bfbf1ca4b71db4bc636f266bbed5" );
		
		restTemplate.getInterceptors().add(
				  new BasicAuthorizationInterceptor("apikey", "2517bfbf1ca4b71db4bc636f266bbed5"));
		ResponseEntity<String> obj = restTemplate.exchange("http://gateway.marvel.com/v1/public/characters", HttpMethod.GET,null ,String.class);
		//String obj2 = restTemplate.set("http://gateway.marvel.com/v1/public/characters", String.class, apikey);
		listParams.put("data", obj);
		return listParams;
		
	}
	
	@Override
	public Map<String, Object> getHeroesComics() {
		//ClientConfig config = new ClientConfig();
		Map<String,Object > listParams = new HashMap<>();
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://gateway.marvel.com/v1/public/characters");
		Response response = target.path("my").path("resource").request().accept(MediaType.APPLICATION_JSON)
		.header("apikey", "2517bfbf1ca4b71db4bc636f266bbed5").get();
		listParams.put("data", response);
		return listParams;
	}
	

}
