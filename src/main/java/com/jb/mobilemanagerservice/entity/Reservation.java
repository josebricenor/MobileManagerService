package com.jb.mobilemanagerservice.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Reservation {
    private boolean isAvailable;
    private String bookedBy;
    private LocalDateTime bookingTime;

    public Reservation(boolean isAvailable, String bookedBy, LocalDateTime bookingTime) {
        this.isAvailable = isAvailable;
        this.bookedBy = bookedBy;
        this.bookingTime = bookingTime;
    }

    @Override
    public String toString() {
        return "Reservation{" +
            "isAvailable=" + isAvailable +
            ", bookedBy='" + bookedBy + '\'' +
            ", bookingTime=" + bookingTime +
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
        Reservation that = (Reservation) o;
        return isAvailable == that.isAvailable && Objects.equals(bookedBy, that.bookedBy)
            && Objects.equals(bookingTime, that.bookingTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isAvailable, bookedBy, bookingTime);
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getBookedBy() {
        return bookedBy;
    }

    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public void setBookingTime(LocalDateTime bookingTime) {
        this.bookingTime = bookingTime;
    }
}
