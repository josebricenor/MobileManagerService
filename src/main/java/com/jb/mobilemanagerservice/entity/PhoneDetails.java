package com.jb.mobilemanagerservice.entity;

import java.util.Objects;

public class PhoneDetails {
    private String technology;
    private String bands2g;
    private String bands3g;
    private String bands4g;

    public PhoneDetails(String technology, String bands2g, String bands3g, String bands4g) {
        this.technology = technology;
        this.bands2g = bands2g;
        this.bands3g = bands3g;
        this.bands4g = bands4g;
    }

    @Override
    public String toString() {
        return "PhoneDetails{" +
            "technology='" + technology + '\'' +
            ", bands2g='" + bands2g + '\'' +
            ", bands3g='" + bands3g + '\'' +
            ", bands4g='" + bands4g + '\'' +
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
        PhoneDetails that = (PhoneDetails) o;
        return Objects.equals(technology, that.technology) && Objects.equals(bands2g,
            that.bands2g) && Objects.equals(bands3g, that.bands3g) && Objects.equals(
            bands4g, that.bands4g);
    }

    @Override
    public int hashCode() {
        return Objects.hash(technology, bands2g, bands3g, bands4g);
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getBands2g() {
        return bands2g;
    }

    public void setBands2g(String bands2g) {
        this.bands2g = bands2g;
    }

    public String getBands3g() {
        return bands3g;
    }

    public void setBands3g(String bands3g) {
        this.bands3g = bands3g;
    }

    public String getBands4g() {
        return bands4g;
    }

    public void setBands4g(String bands4g) {
        this.bands4g = bands4g;
    }
}
