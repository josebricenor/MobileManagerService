package com.jb.mobilemanagerservice.entity;

import java.util.Objects;

public class Phone {
    private Long id;
    private String model;
    private String brand;
    private PhoneDetails phoneDetails;
    private Reservation reservation;

    @Override
    public String toString() {
        return "Phone{" +
            "id=" + id +
            ", model='" + model + '\'' +
            ", brand='" + brand + '\'' +
            ", phoneDetails=" + phoneDetails +
            ", reservation=" + reservation +
            '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Phone phone = (Phone) o;
        return Objects.equals(id, phone.id) && Objects.equals(model, phone.model)
            && Objects.equals(brand, phone.brand) && Objects.equals(phoneDetails,
            phone.phoneDetails) && Objects.equals(reservation, phone.reservation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, model, brand, phoneDetails, reservation);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public PhoneDetails getPhoneDetails() {
        return phoneDetails;
    }

    public void setPhoneDetails(PhoneDetails phoneDetails) {
        this.phoneDetails = phoneDetails;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Phone(Long id, String model, String brand, PhoneDetails phoneDetails,
        Reservation reservation) {
        this.id = id;
        this.model = model;
        this.brand = brand;
        this.phoneDetails = phoneDetails;
        this.reservation = reservation;
    }
}
