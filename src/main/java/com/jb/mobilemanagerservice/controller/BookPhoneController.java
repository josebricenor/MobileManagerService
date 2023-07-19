package com.jb.mobilemanagerservice.controller;

import com.jb.mobilemanagerservice.entity.Phone;
import com.jb.mobilemanagerservice.service.BookPhoneService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/phones")
public class BookPhoneController {

  private final BookPhoneService bookPhoneService;

  public BookPhoneController(BookPhoneService bookPhoneService) {
    this.bookPhoneService = bookPhoneService;
  }

  @GetMapping
  public ResponseEntity<List<Phone>> getAllPhones() {
    return ResponseEntity.ok(bookPhoneService.getAllPhones());
  }

  @PostMapping("/{id}/book")
  public ResponseEntity<Phone> bookPhone(@PathVariable Long id, @RequestParam String bookedBy) {
    return bookPhoneService.bookPhone(id, bookedBy)
        .map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());
  }

  @PostMapping("/{id}/return")
  public ResponseEntity<Phone> returnPhone(@PathVariable Long id) {
    return bookPhoneService.returnPhone(id)
        .map(ResponseEntity::ok)
        .orElseGet(() -> ResponseEntity.notFound().build());
  }
}
