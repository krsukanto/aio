package com.brahma.aio.model;




import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "address")
public class Address {

    public int id;
    @Id
    public String uid;
    public String city;
    public String street_name;
    public String street_address;
    public String secondary_address;
    public String building_number;
    public String mail_box;
    public String community;
    public String zip_code;
    public String zip;
    public String postcode;
    public String time_zone;
    public String street_suffix;
    public String city_suffix;
    public String city_prefix;
    public String state;
    public String state_abbr;
    public String country;
    public String country_code;
    public double latitude;
    public double longitude;
    public String full_address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet_name() {
        return street_name;
    }

    public void setStreet_name(String street_name) {
        this.street_name = street_name;
    }

    public String getStreet_address() {
        return street_address;
    }

    public void setStreet_address(String street_address) {
        this.street_address = street_address;
    }

    public String getSecondary_address() {
        return secondary_address;
    }

    public void setSecondary_address(String secondary_address) {
        this.secondary_address = secondary_address;
    }

    public String getBuilding_number() {
        return building_number;
    }

    public void setBuilding_number(String building_number) {
        this.building_number = building_number;
    }

    public String getMail_box() {
        return mail_box;
    }

    public void setMail_box(String mail_box) {
        this.mail_box = mail_box;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getZip_code() {
        return zip_code;
    }

    public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getStreet_suffix() {
        return street_suffix;
    }

    public void setStreet_suffix(String street_suffix) {
        this.street_suffix = street_suffix;
    }

    public String getCity_suffix() {
        return city_suffix;
    }

    public void setCity_suffix(String city_suffix) {
        this.city_suffix = city_suffix;
    }

    public String getCity_prefix() {
        return city_prefix;
    }

    public void setCity_prefix(String city_prefix) {
        this.city_prefix = city_prefix;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState_abbr() {
        return state_abbr;
    }

    public void setState_abbr(String state_abbr) {
        this.state_abbr = state_abbr;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getFull_address() {
        return full_address;
    }

    public void setFull_address(String full_address) {
        this.full_address = full_address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", uid='" + uid + '\'' +
                ", city='" + city + '\'' +
                ", street_name='" + street_name + '\'' +
                ", street_address='" + street_address + '\'' +
                ", secondary_address='" + secondary_address + '\'' +
                ", building_number='" + building_number + '\'' +
                ", mail_box='" + mail_box + '\'' +
                ", community='" + community + '\'' +
                ", zip_code='" + zip_code + '\'' +
                ", zip='" + zip + '\'' +
                ", postcode='" + postcode + '\'' +
                ", time_zone='" + time_zone + '\'' +
                ", street_suffix='" + street_suffix + '\'' +
                ", city_suffix='" + city_suffix + '\'' +
                ", city_prefix='" + city_prefix + '\'' +
                ", state='" + state + '\'' +
                ", state_abbr='" + state_abbr + '\'' +
                ", country='" + country + '\'' +
                ", country_code='" + country_code + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", full_address='" + full_address + '\'' +
                '}';
    }
}
