package com.jb.mobilemanagerservice.repository;

import com.jb.mobilemanagerservice.entity.Phone;
import com.jb.mobilemanagerservice.entity.PhoneDetails;
import com.jb.mobilemanagerservice.entity.Reservation;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class PhoneRepository {

  private Map<Long, Phone> phoneStorage = new HashMap<>();

  public PhoneRepository() {
    Reservation defaultReservation = new Reservation(true, null, null);
    phoneStorage.put(1L, new Phone(1L, "Samsung Galaxy S9", "Samsung",
        new PhoneDetails("GSM / HSPA / LTE",
            "850 / 900 / 1800 / 1900 - SIM 1 & SIM 2 (dual-SIM model only)",
            "HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100",
            "1, 2, 3, 4, 5, 7, 8, 12, 13, 17, 18, 19, 20, 25, 26, 28, 32, 38, 39, 40, 41, 66"),
        defaultReservation));
    phoneStorage.put(2L, new Phone(2L, "Samsung Galaxy S8", "Samsung",
        new PhoneDetails("GSM / HSPA / LTE", "850 / 900 / 1800 / 1900",
            "HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100",
            "LTE band 1(2100), 2(1900), 3(1800), 4(1700/2100), 5(850), 7(2600), 8(900), 12(700), 13(700), 14(700), 17(700), 18(800), 19(800), 20(800), 25(1900), 26(850), 28(700), 29(700), 30(2300), 34(2000), 38(2600), 39(1900), 40(2300), 41(2500), 46(5200), 48, 66(1700/2100), 71(600) - Global"),
        defaultReservation));
    phoneStorage.put(3L, new Phone(3L, "Samsung Galaxy S8", "Samsung",
        new PhoneDetails("GSM / HSPA / LTE", "850 / 900 / 1800 / 1900",
            "HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100",
            "LTE band 1(2100), 2(1900), 3(1800), 4(1700/2100), 5(850), 7(2600), 8(900), 12(700), 13(700), 14(700), 17(700), 18(800), 19(800), 20(800), 25(1900), 26(850), 28(700), 29(700), 30(2300), 34(2000), 38(2600), 39(1900), 40(2300), 41(2500), 46(5200), 48, 66(1700/2100), 71(600) - Global"),
        defaultReservation));
    phoneStorage.put(4L, new Phone(4L, "Motorola Nexus 6", "Motorola",
        new PhoneDetails("GSM / CDMA / HSPA / LTE", "850 / 900 / 1800 / 1900",
            "HSDPA 850 / 900 / 1700 / 1900 / 2100", "LTE"), defaultReservation));
    phoneStorage.put(5L, new Phone(5L, "Oneplus 9", "Oneplus",
        new PhoneDetails("GSM / CDMA / HSPA / LTE / 5G", "850 / 900 / 1800 / 1900",
            "HSDPA 800 / 850 / 900 / 1700(AWS) / 1800 / 1900 / 2100",
            "1, 2, 3, 4, 5, 7, 8, 12, 17, 18, 19, 20, 25, 26, 38, 39, 40, 41, 46, 48, 66, 71, 77, 78 Sub6 - North America"),
        defaultReservation));
    phoneStorage.put(6L, new Phone(6L, "Apple iPhone 13", "Apple",
        new PhoneDetails("GSM / CDMA / HSPA / EVDO / LTE / 5G", "850 / 900 / 1800 / 1900",
            "HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100",
            "1, 2, 3, 4, 5, 7, 8, 12, 13, 14, 17, 18, 19, 20, 25, 26, 29, 30, 34, 38, 39, 40, 41, 42, 46, 48, 66, 71"),
        defaultReservation));
    phoneStorage.put(7L, new Phone(7L, "Apple iPhone 12", "Apple",
        new PhoneDetails("GSM / CDMA / HSPA / EVDO / LTE / 5G", "850 / 900 / 1800 / 1900",
            "HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100",
            "1, 2, 3, 4, 5, 7, 8, 12, 13, 14, 17, 18, 19, 20, 25, 26, 29, 30, 34, 38, 39, 40, 41, 42, 46, 48, 66, 71"),
        defaultReservation));
    phoneStorage.put(8L, new Phone(8L, "Apple iPhone 11", "Apple",
        new PhoneDetails("GSM / CDMA / HSPA / EVDO / LTE", "850 / 900 / 1800 / 1900",
            "HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100",
            "1, 2, 3, 4, 5, 7, 8, 12, 13, 14, 17, 18, 19, 20, 25, 26, 29, 30, 34, 38, 39, 40, 41, 42, 46, 48, 66, 71"),
        defaultReservation));
    phoneStorage.put(9L, new Phone(9L, "iPhone X", "Apple",
        new PhoneDetails("GSM / CDMA / HSPA / EVDO / LTE", "850 / 900 / 1800 / 1900",
            "HSDPA 850 / 900 / 1700(AWS) / 1900 / 2100",
            "1, 2, 3, 4, 5, 7, 8, 12, 13, 14, 17, 18, 19, 20, 25, 26, 29, 30, 34, 38, 39, 40, 41, 42, 46, 48, 66, 71"),
        defaultReservation));
    phoneStorage.put(10L, new Phone(10L, "Nokia 3310", "Nokia",
        new PhoneDetails("GSM", "900 / 1800 - EU", "N/A", "N/A"), defaultReservation));
  }

  public Optional<Phone> findById(Long id) {
    return Optional.ofNullable(phoneStorage.get(id));
  }

  public Optional<Phone> bookPhone(Long id, String bookedBy) {
    Phone phone = phoneStorage.get(id);
    if (phone != null && phone.getReservation().isAvailable()) {
      phone.getReservation().setBookedBy(bookedBy);
      phone.getReservation().setBookingTime(LocalDateTime.now());
      phone.getReservation().setAvailable(false);
      return Optional.of(save(phone));
    }
    return Optional.empty();
  }

  public Optional<Phone> returnPhone(Long id) {
    Phone phone = phoneStorage.get(id);
    if (phone != null && !phone.getReservation().isAvailable()) {
      phone.getReservation().setBookedBy(null);
      phone.getReservation().setBookingTime(null);
      phone.getReservation().setAvailable(true);
      return Optional.of(save(phone));
    }
    return Optional.empty();
  }

  public Phone save(Phone phone) {
    return phoneStorage.put(phone.getId(), phone);
  }

  public List<Phone> getAllPhones() {
    return new ArrayList<>(phoneStorage.values());
  }
}
