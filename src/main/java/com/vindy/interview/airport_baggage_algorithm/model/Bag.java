package com.vindy.interview.airport_baggage_algorithm.model;

/**
 * Created by vindhya
 */
public class Bag {
    private final String id;
    private final String entryGate;
    private final String flight;

    public Bag(String id, String entryGate, String flight) {
        this.id = id;
        this.entryGate = entryGate;
        this.flight = flight;
    }

    public String getId() {
        return id;
    }

    public String getEntryGate() {
        return entryGate;
    }

    public String getFlight() {
        return flight;
    }
}
