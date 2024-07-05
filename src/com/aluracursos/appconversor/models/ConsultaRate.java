package com.aluracursos.appconversor.models;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultaRate {

    private String base;
    private String change;

    public ConsultaRate(String base, String change) {
        this.base = base;
        this.change = change;
    }

    public double Consulta() throws URISyntaxException {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).setPrettyPrinting().create();

        URI uri = new URI("https://v6.exchangerate-api.com/v6/d4d711b696e74f84aff776ef/pair/"+this.base+"/"+this.change);

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(uri)
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();
            //System.out.println(json);
            Pares miPar = gson.fromJson(json,Pares.class);
            return miPar.conversion_rate();

        } catch (IOException | InterruptedException e) {
            System.out.println("Ocurrio un error " + e.getMessage());
            throw new RuntimeException(e);
        }

    }
}
