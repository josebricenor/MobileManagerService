package com.jb.mobilemanagerservice.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.jb.mobilemanagerservice.entity.Phone;
import com.jb.mobilemanagerservice.entity.PhoneDetails;
import com.jb.mobilemanagerservice.entity.Reservation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Optional;

public class PhoneRepositoryTest {

    private PhoneRepository phoneRepository;

    @BeforeEach
    public void setup() {
        phoneRepository = new PhoneRepository();
    }

    @Test
    public void testFindById() {
        Optional<Phone> phone = phoneRepository.findById(1L);
        assertTrue(phone.isPresent());
        assertEquals(1L, phone.get().getId());
        validatePhoneDetails(phone.get().getPhoneDetails());
        validateReservation(phone.get().getReservation());
    }

    @Test
    public void testBookPhone() {
        String bookedBy = "user1";
        Optional<Phone> bookedPhone = phoneRepository.bookPhone(1L, bookedBy);
        assertTrue(bookedPhone.isPresent());
        assertFalse(bookedPhone.get().getReservation().isAvailable());
        assertEquals(bookedBy, bookedPhone.get().getReservation().getBookedBy());
        assertNotNull(bookedPhone.get().getReservation().getBookingTime());
        validatePhoneDetails(bookedPhone.get().getPhoneDetails());
    }

    @Test
    public void testFindById_NotFound() {
        Optional<Phone> phone = phoneRepository.findById(100L);
        assertFalse(phone.isPresent());
    }

    @Test
    public void testBookPhone_AlreadyBooked() {
        phoneRepository.bookPhone(1L, "user1");
        Optional<Phone> bookedPhone = phoneRepository.bookPhone(1L, "user2");
        assertFalse(bookedPhone.isPresent());
    }

    @Test
    public void testReturnPhone() {
        phoneRepository.bookPhone(2L, "user1");
        Optional<Phone> returnedPhone = phoneRepository.returnPhone(2L);
        assertTrue(returnedPhone.isPresent());
        assertTrue(returnedPhone.get().getReservation().isAvailable());
        assertNull(returnedPhone.get().getReservation().getBookedBy());
        assertNull(returnedPhone.get().getReservation().getBookingTime());
        validatePhoneDetails(returnedPhone.get().getPhoneDetails());
    }

    @Test
    public void testReturnPhone_NotBooked() {
        Optional<Phone> returnedPhone = phoneRepository.returnPhone(3L);
        assertFalse(returnedPhone.isPresent());
    }

    @Test
    public void testGetAllPhones() {
        int initialSize = phoneRepository.getAllPhones().size();
        Phone newPhone = new Phone(11L, "New Phone", "Brand", new PhoneDetails("Tech", "2G", "3G", "4G"), new Reservation(true, null, null));
        phoneRepository.save(newPhone);
        assertEquals(initialSize + 1, phoneRepository.getAllPhones().size());
    }

    private void validatePhoneDetails(PhoneDetails phoneDetails) {
        assertNotNull(phoneDetails);
        assertNotNull(phoneDetails.getTechnology());
        assertNotNull(phoneDetails.getBands2g());
        assertNotNull(phoneDetails.getBands3g());
        assertNotNull(phoneDetails.getBands4g());
    }

    private void validateReservation(Reservation reservation) {
        assertNotNull(reservation);
        assertNotNull(reservation.isAvailable());
    }
}
