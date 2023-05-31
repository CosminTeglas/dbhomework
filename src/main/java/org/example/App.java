package org.example;

import java.sql.SQLException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws SQLException {

        DataTables accommodation = new DataTables();
        DataTables roomFair = new DataTables();
        DataTables accommodationRoomFair = new DataTables();

        accommodation.insertAccommodation(Arrays.asList(
                new Accommodation(1, "Single Room", "One Person Bed", 1, "This type of room is for one person"),
                new Accommodation(2, "Double Room", "Two Person Bed", 2, "This type of roome is for two persons")));

        roomFair.insertRoomFair(Arrays.asList(
                new RoomFair(1, 20.1, "Winter"),
                new RoomFair(2, 22.3, "Summer")));

    }
}
