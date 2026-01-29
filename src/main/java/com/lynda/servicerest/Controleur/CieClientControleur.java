package com.lynda.servicerest.Controleur;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.lynda.servicerest.dtos.LastTransactionsResult;

@RestController
public class CieClientControleur {
	
	private final WebClient webClient;
	
	public CieClientControleur(WebClient webClient) {
		this.webClient = webClient;
	}

	@GetMapping("/{meternum}")
	public LastTransactionsResult getLastFiveTransaction(@PathVariable("meternum") String numeroDeCompteur) {
		String xml = String.format("<xml userName=\"TP1\" userPass=\"5fdb64fbb7fd4e2ce0096f96c6d967d3\" meterNum=\"%s\"/>", numeroDeCompteur);
		System.out.println(xml);
		return webClient
				.post()
				.uri("/cie/lasttransactions")
				.contentType(MediaType.APPLICATION_XML)
                .accept(MediaType.APPLICATION_XML)
                .bodyValue(xml)
                .retrieve()
                .bodyToMono(LastTransactionsResult.class)
                .block();
	}
	
	
}
