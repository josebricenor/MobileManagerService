package com.jb.mobilemanagerservice.service;

import com.jb.mobilemanagerservice.dto.FonoApiDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class FonoApiService {

  public static final String DEVICE = "device";
  public static final String BRAND = "brand";
  private final WebClient webClient;

  public FonoApiService() {
    this.webClient = WebClient.create("https://fonoapi.freshpixl.com/v1/");
  }

  public Mono<FonoApiDto> getPhoneDataFromFonoApi(String device, String brand) {
    return this.webClient.get()
        .uri(uriBuilder -> uriBuilder.path("/getdevice")
            .queryParam(DEVICE, device)
            .queryParam(BRAND, brand)
            .build())
        .retrieve()
        .bodyToMono(FonoApiDto.class);
  }
}
