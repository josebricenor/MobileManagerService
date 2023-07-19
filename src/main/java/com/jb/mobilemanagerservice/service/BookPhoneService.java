package com.jb.mobilemanagerservice.service;

import com.jb.mobilemanagerservice.dto.FonoApiDto;
import com.jb.mobilemanagerservice.entity.Phone;
import com.jb.mobilemanagerservice.entity.PhoneDetails;
import com.jb.mobilemanagerservice.repository.PhoneRepository;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class BookPhoneService {

  public static final PhoneDetails DEFAULT_PHONE_DETAILS = new PhoneDetails("Default Technology",
      "Default 2G Bands", "Default 3G Bands", "Default 4G Bands");

  private final PhoneRepository phoneRepository;
  private final FonoApiService fonoApiService;

  @Autowired
  public BookPhoneService(PhoneRepository phoneRepository, FonoApiService fonoApiService) {
    this.phoneRepository = phoneRepository;
    this.fonoApiService = fonoApiService;
  }

  public Optional<Phone> bookPhone(Long id, String bookedBy) {
    Optional<Phone> optionalPhone = phoneRepository.bookPhone(id, bookedBy);
    if (optionalPhone.isPresent()) {
      Phone phone = optionalPhone.get();
      phone.setPhoneDetails(getPhoneDetails(phone));
    }
    return optionalPhone;
  }

  public Optional<Phone> returnPhone(Long id) {
    Optional<Phone> optionalPhone = phoneRepository.returnPhone(id);
    if (optionalPhone.isPresent()) {
      Phone phone = optionalPhone.get();
      phone.setPhoneDetails(getPhoneDetails(phone));
    }
    return optionalPhone;
  }

  public PhoneDetails getPhoneDetails(Phone phone) {
    return getPhoneDataFromFonoApi(phone.getModel(), phone.getBrand())
        .flatMap(fonoApiDto -> {
          PhoneDetails phoneDetails = new PhoneDetails(fonoApiDto.getTechnology(),
              fonoApiDto.getBands2g(), fonoApiDto.getBands3g(), fonoApiDto.getBands4g());
          phone.setPhoneDetails(phoneDetails);
          phoneRepository.save(phone);
          return Mono.just(phoneDetails);
        })
        .onErrorResume(e -> Mono.just(
            Objects.requireNonNullElse(phone.getPhoneDetails(), DEFAULT_PHONE_DETAILS))
        )
        .block();
  }

  private Mono<FonoApiDto> getPhoneDataFromFonoApi(String device, String brand) {
    return fonoApiService.getPhoneDataFromFonoApi(device, brand);
  }

  public List<Phone> getAllPhones() {
    List<Phone> allPhones = phoneRepository.getAllPhones();
    allPhones.forEach(phone -> phone.setPhoneDetails(getPhoneDetails(phone)));
    return allPhones;
  }
}
