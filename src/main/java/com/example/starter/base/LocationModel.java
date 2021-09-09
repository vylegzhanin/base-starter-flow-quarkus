package com.example.starter.base;

import com.vaadin.quarkus.annotation.UIScoped;

@UIScoped
public class LocationModel {

    private Location selectedLocation;

    public Location getSelectedLocation() {
        return selectedLocation;
    }

    public void setSelectedLocation(Location selectedLocation) {
        this.selectedLocation = selectedLocation;
    }
}