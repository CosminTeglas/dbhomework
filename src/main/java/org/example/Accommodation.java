package org.example;

public class Accommodation {

    int id;
    String type;

    String bet_type;

    int max_guests;

   String description;


    public Accommodation(int id, String type, String bet_type, int max_guests, String description) {
        this.id = id;
        this.type = type;
        this.bet_type = bet_type;
        this.max_guests = max_guests;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getBet_type() {
        return bet_type;
    }

    public int getMax_guests() {
        return max_guests;
    }

    public String getDescription() {
        return description;
    }


}