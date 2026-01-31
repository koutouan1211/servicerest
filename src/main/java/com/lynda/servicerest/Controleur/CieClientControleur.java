package com.lynda.servicerest.Controleur;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.lynda.servicerest.dtos.BalanceResult;
import com.lynda.servicerest.dtos.LastTransactionsResult;
import com.lynda.servicerest.dtos.SearchResult;
import com.lynda.servicerest.dtos.VendingResult;

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
	
	
	@PostMapping("/{transID}")
	public SearchResult getSearchResult(@PathVariable String transID) {
		String xml = String.format("<xml userName=\"ORANGE\" userPass=\"7acbc0a1f2e081c8028597caad1fd1cb\" transID=\"ABC12345612\" meterNum=\"01081737551\"/>" , transID);
		System.out.println(xml);
		return webClient
	            .post()
	            .uri("/cie/searchresults")
	            .contentType(MediaType.APPLICATION_XML)
	            .accept(MediaType.APPLICATION_XML)
	            .bodyValue(xml)
	            .retrieve()
	            .bodyToMono(SearchResult.class)
	            .block(); // mode NON réactif
				
	}
	
	
	@PostMapping("/{userPass}")
	public BalanceResult getBalance(@PathVariable String userPass) {
		String xml = String.format("<xml userName=\"ORANGE\" userPass=\"7acbc0a1f2e081c8028597caad1fd1cb\"/>", userPass);
		System.out.println(xml);
		return webClient
	            .post()
	            .uri("/cie/balances")
	            .contentType(MediaType.APPLICATION_XML)
	            .accept(MediaType.APPLICATION_XML)
	            .bodyValue(xml)
	            .retrieve()
	            .bodyToMono(BalanceResult.class)
	            .block(); // mode NON réactif 
	}
	
	
	@PostMapping("/{verifyCode}")
	public VendingResult getVending(@PathVariable String verifyCode) {
		String xml = String.format("<xml userName=\"ORANGE\" userPass=\"7acbc0a1f2e081c8028597caad1fd1cb\" transID=\"ABC1234561\" meterNum=\"01081737551\" calcMode=\"M\" amount=\"10000\" verifyCode=\"1eb33c5ae7230cd8f1304f2fac736ead\" verifyData=\"\"/>", verifyCode);
		System.out.println(xml);
		return webClient
	            .post()
	            .uri("/cie/vending")
	            .contentType(MediaType.APPLICATION_XML)
	            .accept(MediaType.APPLICATION_XML)
	            .bodyValue(xml)
	            .retrieve()
	            .bodyToMono(VendingResult.class)
	            .block(); // mode NON réactif 
	}
	
	
}
