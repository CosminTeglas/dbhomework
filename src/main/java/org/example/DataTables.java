package org.example;

import java.sql.*;
import java.util.List;

public class DataTables {
    static final String INSERT_DATA_IN_ACCOMODATION = "" + "(id,type,bed_type,max_guests,description) values " + " (?,?,?,?,?);";

    static final String INSERT_DATA_IN_ROOM_FAIR = "" + "(id,value,season) VALUES " + "(?,?,?);";

    static final String INSERT_DATA_IN_ACCOMODATION_ROOM_FAIR = "" + "(id, accommodation_id, room_fair_id) VALUES " + "(?,?,?);";
    static final String URL = "jdbc:postgresql://localhost:5432/bookingapp";
    static final String USER = "postgres";
    static final String PASS = "root";
    final String format = "%20s%20s%12s\n";
    Statement statement = null;
    ResultSet resultSet = null;
    public void insertAccommodation(List<Accommodation> accommodations) {
        try (Connection connection = DriverManager.getConnection(URL, USER, PASS);

             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA_IN_ACCOMODATION)) {

            for (Accommodation accommodation : accommodations) {

                preparedStatement.setInt(1, accommodation.getId());
                preparedStatement.setString(2, accommodation.getType());
                preparedStatement.setString(3, accommodation.getBet_type());
                preparedStatement.setInt(4, accommodation.getMax_guests());
                preparedStatement.setString(5, accommodation.getDescription());
                preparedStatement.executeUpdate();

            }
        } catch (SQLException e) {
            System.err.format("SQ State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertRoomFair(List<RoomFair> roomFairs) throws SQLException {

        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASS);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA_IN_ROOM_FAIR);
        ) {

            for (RoomFair roomFair : roomFairs) {
                preparedStatement.setInt(1, roomFair.getId());
                preparedStatement.setDouble(2, roomFair.getValue());
                preparedStatement.setString(3, roomFair.getSeason());
                preparedStatement.executeUpdate();


            }
        } catch (SQLException e) {
        }
    }

    public void insertAccommodationRoomFair(List<AccommodationRoomFair> accommodationRoomFairs) throws SQLException {

        try (
                Connection connection = DriverManager.getConnection(URL, USER, PASS);
                PreparedStatement preparedStatement = connection.prepareStatement(INSERT_DATA_IN_ACCOMODATION_ROOM_FAIR);
        ) {

            for (AccommodationRoomFair accommodationRoomFair : accommodationRoomFairs) {
                preparedStatement.setInt(1, accommodationRoomFair.getId());
                preparedStatement.setInt(2, accommodationRoomFair.getAccommodation_id());
                preparedStatement.setInt(3, accommodationRoomFair.getRoom_fair_id());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {

        }
    }
    /**
     * TO DO NEXT:
     * PRINT in console the prices for each room in the database. + tests
     */
}
