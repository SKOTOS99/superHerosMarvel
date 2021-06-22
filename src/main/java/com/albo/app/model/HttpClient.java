package com.albo.app.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.Response;

import javax.net.ssl.HttpsURLConnection;

import org.springframework.stereotype.Service;

import ch.qos.logback.core.net.server.Client;


@Service
public class HttpClient {
	
	
	public void Request() {
		
		String res = "";
		
		try {
			Client client = ClientBuilder.newClient();
		}
		
		
		
	}

}
