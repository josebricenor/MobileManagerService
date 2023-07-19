package com.jb.mobilemanagerservice.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.jb.mobilemanagerservice.dto.FonoApiDto;
import com.jb.mobilemanagerservice.entity.Phone;
import com.jb.mobilemanagerservice.repository.PhoneRepository;
import java.util.Arrays;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Mono;

public class BookPhoneServiceTest {

  public static final String TEST_MODEL = "Test Model";
  public static final String TEST_BRAND = "Test Brand";
  public static final String TEST_USER = "Test User";
  public static final String FONO_API_FAILED = "Fono API failed";
  public static final long ID = 1L;
  private BookPhoneService bookPhoneService;

  @Mock
  private PhoneRepository phoneRepository;

  @Mock
  private FonoApiService fonoApiService;

  @BeforeEach
  public void setUp() {
    MockitoAnnotations.openMocks(this);
    bookPhoneService = new BookPhoneService(phoneRepository, fonoApiService);
  }

  @Test
  public void testBookPhoneSuccessfully() {
    Phone phone = new Phone(ID, TEST_MODEL, TEST_BRAND, null, null);
    when(phoneRepository.bookPhone(any(Long.class), any(String.class))).thenReturn(
        Optional.of(phone));
    when(fonoApiService.getPhoneDataFromFonoApi(any(String.class), any(String.class)))
        .thenReturn(Mono.just(new FonoApiDto()));

    Optional<Phone> optionalPhone = bookPhoneService.bookPhone(ID, TEST_USER);

    verify(phoneRepository, times(1)).bookPhone(ID, TEST_USER);
    verify(fonoApiService, times(1)).getPhoneDataFromFonoApi(phone.getModel(), phone.getBrand());
    assertTrue(optionalPhone.isPresent());
    assertEquals(phone, optionalPhone.get());
  }

  @Test
  public void testBookPhoneWhenPhoneDoesNotExist() {
    when(phoneRepository.bookPhone(any(Long.class), any(String.class))).thenReturn(
        Optional.empty());

    Optional<Phone> optionalPhone = bookPhoneService.bookPhone(ID, TEST_USER);

    verify(phoneRepository, times(1)).bookPhone(ID, TEST_USER);
    assertTrue(optionalPhone.isEmpty());
  }

  @Test
  public void testBookPhoneWhenFonoApiFails() {
    Phone phone = new Phone(ID, TEST_MODEL, TEST_BRAND, null, null);
    when(phoneRepository.bookPhone(any(Long.class), any(String.class))).thenReturn(
        Optional.of(phone));
    when(fonoApiService.getPhoneDataFromFonoApi(any(String.class), any(String.class)))
        .thenReturn(Mono.error(new RuntimeException(FONO_API_FAILED)));

    Optional<Phone> optionalPhone = bookPhoneService.bookPhone(ID, TEST_USER);

    verify(phoneRepository, times(1)).bookPhone(ID, TEST_USER);
    verify(fonoApiService, times(1)).getPhoneDataFromFonoApi(phone.getModel(), phone.getBrand());
    assertTrue(optionalPhone.isPresent());
    assertEquals(phone, optionalPhone.get());
  }

  @Test
  public void testGetAllPhones() {
    Phone phone1 = new Phone(ID, TEST_MODEL, TEST_BRAND, null, null);
    Phone phone2 = new Phone(2L, "Test Model 2", "Test Brand 2", null, null);
    when(phoneRepository.getAllPhones()).thenReturn(Arrays.asList(phone1, phone2));
    when(fonoApiService.getPhoneDataFromFonoApi(any(String.class), any(String.class)))
        .thenReturn(Mono.just(new FonoApiDto()));

    var allPhones = bookPhoneService.getAllPhones();

    verify(phoneRepository, times(1)).getAllPhones();
    verify(fonoApiService, times(2)).getPhoneDataFromFonoApi(any(String.class), any(String.class));
    assertEquals(2, allPhones.size());
    assertEquals(phone1, allPhones.get(0));
    assertEquals(phone2, allPhones.get(1));
  }

  @Test
  public void testReturnPhoneSuccessfully() {
    Phone phone = new Phone(ID, TEST_MODEL, TEST_BRAND, null, null);
    when(phoneRepository.returnPhone(any(Long.class))).thenReturn(Optional.of(phone));
    when(fonoApiService.getPhoneDataFromFonoApi(any(String.class), any(String.class)))
        .thenReturn(Mono.just(new FonoApiDto()));

    Optional<Phone> optionalPhone = bookPhoneService.returnPhone(ID);

    verify(phoneRepository, times(1)).returnPhone(ID);
    verify(fonoApiService, times(1)).getPhoneDataFromFonoApi(phone.getModel(), phone.getBrand());
    assertTrue(optionalPhone.isPresent());
    assertEquals(phone, optionalPhone.get());
  }

  @Test
  public void testReturnPhoneWhenPhoneDoesNotExist() {
    when(phoneRepository.returnPhone(any(Long.class))).thenReturn(Optional.empty());

    Optional<Phone> optionalPhone = bookPhoneService.returnPhone(ID);

    verify(phoneRepository, times(1)).returnPhone(ID);
    assertTrue(optionalPhone.isEmpty());
  }

  @Test
  public void testReturnPhoneWhenFonoApiFails() {
    Phone phone = new Phone(ID, TEST_MODEL, TEST_BRAND, null, null);
    when(phoneRepository.returnPhone(any(Long.class))).thenReturn(Optional.of(phone));
    when(fonoApiService.getPhoneDataFromFonoApi(any(String.class), any(String.class)))
        .thenReturn(Mono.error(new RuntimeException(FONO_API_FAILED)));

    Optional<Phone> optionalPhone = bookPhoneService.returnPhone(ID);

    verify(phoneRepository, times(1)).returnPhone(ID);
    verify(fonoApiService, times(1)).getPhoneDataFromFonoApi(phone.getModel(), phone.getBrand());
    assertTrue(optionalPhone.isPresent());
    assertEquals(phone, optionalPhone.get());
  }
}
