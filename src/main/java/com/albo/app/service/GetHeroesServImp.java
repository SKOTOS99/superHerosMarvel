package com.albo.app.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
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
		ResponseEntity<String> obj = restTemplate.exchange("http://gateway.marvel.com/v1/public/characters", HttpMethod.GET,entity ,String.class);
		//String obj = restTemplate.getForObject("http://gateway.marvel.com/v1/public/characters", String.class, apikey);
		listParams.put("data", obj);
		return listParams;
		
	}

}
