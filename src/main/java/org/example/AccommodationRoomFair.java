package org.example;

public class AccommodationRoomFair {

    int id;

    int accommodation_id;

    int room_fair_id;

    public AccommodationRoomFair(int id, int accommodation_id, int room_fair_id) {
        this.id = id;
        this.accommodation_id = accommodation_id;
        this.room_fair_id = room_fair_id;
    }

    public int getId() {
        return id;
    }

    public int getAccommodation_id() {
        return accommodation_id;
    }

    public int getRoom_fair_id() {
        return room_fair_id;
    }


}