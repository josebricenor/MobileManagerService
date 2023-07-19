package com.jb.mobilemanagerservice.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.jb.mobilemanagerservice.entity.Phone;
import com.jb.mobilemanagerservice.service.BookPhoneService;
import java.util.Arrays;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
public class BookPhoneControllerTest {

  public static final String USER = "user";
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private BookPhoneService bookPhoneService;

  @BeforeEach
  void setUp() {
    Phone phone1 = new Phone(1L, "model1", "brand1", null, null);
    Phone phone2 = new Phone(2L, "model2", "brand2", null, null);
    when(bookPhoneService.getAllPhones()).thenReturn(Arrays.asList(phone1, phone2));

    when(bookPhoneService.bookPhone(1L, USER)).thenReturn(Optional.of(phone1));
    when(bookPhoneService.returnPhone(2L)).thenReturn(Optional.of(phone2));

    when(bookPhoneService.bookPhone(3L, USER)).thenReturn(Optional.empty());
    when(bookPhoneService.returnPhone(4L)).thenReturn(Optional.empty());
  }

  @Test
  void shouldGetAllPhones() throws Exception {
    mockMvc.perform(get("/phones"))
        .andExpect(status().isOk());
  }

  @Test
  void shouldBookPhone() throws Exception {
    mockMvc.perform(post("/phones/1/book")
            .param("bookedBy", USER)
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isOk());
  }

  @Test
  void shouldNotBookPhoneWhenNotFound() throws Exception {
    mockMvc.perform(post("/phones/3/book")
            .param("bookedBy", USER)
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(status().isNotFound());
  }

  @Test
  void shouldReturnPhone() throws Exception {
    mockMvc.perform(post("/phones/2/return"))
        .andExpect(status().isOk());
  }

  @Test
  void shouldNotReturnPhoneWhenNotFound() throws Exception {
    mockMvc.perform(post("/phones/4/return"))
        .andExpect(status().isNotFound());
  }
}
