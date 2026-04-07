
import java.util.*;
class RoomNotAvailableException extends Exception {
    RoomNotAvailableException(String msg) {
        super(msg);
    }
}

class InvalidBookingException extends Exception {
    InvalidBookingException(String msg) {
        super(msg);
    }
}
class Room {
    int roomId;
    String roomType;
    double price;
    boolean isAvailable;

    // Constructor chaining
    Room(int roomId, String roomType, double price) {
        this(roomId, roomType, price, true);
    }

    Room(int roomId, String roomType, double price, boolean isAvailable) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public void bookRoom() throws RoomNotAvailableException {
        if (!isAvailable) {
            throw new RoomNotAvailableException("Room not available!");
        }
        isAvailable = false;
        System.out.println("Room booked successfully!");
    }

    public void cancelBooking() {
        isAvailable = true;
        System.out.println("Booking cancelled.");
    }

    public void display() {
        System.out.println(roomId + " " + roomType + " " + price + " " + isAvailable);
    }
}

class LuxuryRoom extends Room {
    String amenities;

    LuxuryRoom(int roomId, double price, String amenities) {
        super(roomId, "Luxury", price);
        this.amenities = amenities;
    }

    @Override
    public void bookRoom() throws RoomNotAvailableException {
        super.bookRoom();
        System.out.println("Luxury amenities included: " + amenities);
    }
}

class EconomyRoom extends Room {

    EconomyRoom(int roomId, double price) {
        super(roomId, "Economy", price);
    }

    @Override
    public void bookRoom() throws RoomNotAvailableException {
        super.bookRoom();
        System.out.println("Economy room booked.");
    }
}

class Customer {
    int customerId;
    String name;
    String email;

    Customer(int id, String name, String email) {
        this.customerId = id;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return customerId + " " + name + " " + email;
    }
}

public class HotelBooking {
    public static void main(String[] args) {

        List<Room> rooms = new ArrayList<>();
        Map<Customer, Room> bookings = new HashMap<>();

        // Add rooms
        rooms.add(new LuxuryRoom(1, 5000, "AC, WiFi, Pool"));
        rooms.add(new EconomyRoom(2, 2000));

        // Create customer
        Customer c1 = new Customer(101, "Rushikesh", "rushi@gmail.com");

        try {
            // Book room
            Room r = rooms.get(0);
            r.bookRoom();

            bookings.put(c1, r);

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }

        // Display bookings
        System.out.println("\nBookings:");
        for (Map.Entry<Customer, Room> entry : bookings.entrySet()) {
            System.out.println(entry.getKey() + " -> Room ID: " + entry.getValue().roomId);
        }
    }
}
