package com.albo.app.model;

import com.albo.app.entity.HeroesEntity;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class HttpClient {
	
	
	public void Request() {
		//https://gateway.marvel.com:443/v1/public/characters/1009368/comics?orderBy=title&limit=100&offset=0&apikey=2517bfbf1ca4b71db4bc636f266bbed5
		String URL = "http://54.69.118.16:8090/api/empleados";
		String res = "";
		String output;
		
		try {

            //URL url = new URL("http://54.69.118.16:8090/api/empleados");//your url i.e fetch data from .
			URL url = new URL("http://gateway.marvel.com/v1/public/characters");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("apikey", "2517bfbf1ca4b71db4bc636f266bbed5");
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP Error code : "
                        + conn.getResponseCode());
            }
            InputStreamReader in = new InputStreamReader(conn.getInputStream());
            BufferedReader br = new BufferedReader(in);
            
            while ((output = br.readLine()) != null) {
            	
                System.out.println(output);
               
            }
          
            //convert java object to JSON format
            //String json = gson.toJson(output);
            
            conn.disconnect();

        } catch (Exception e) {
            System.out.println("Exception in NetClientGet:- " + e);
        }

		
	}
	
	public void getHeroes() {
		RestTemplate restTemplate = new RestTemplate();
		String obj = restTemplate.getForObject("http://gateway.marvel.com/v1/public/characters", String.class);
		System.out.println(obj);
	}

}
