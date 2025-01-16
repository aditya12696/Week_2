package Level2_class;

class MovieTicket {
 // Class attributes
 private String movieName;
 private int seatNumber;
 private double price;
 private boolean isBooked;

 // Constructor
 MovieTicket(String movieName, double price) {
  this.movieName = movieName;
  this.price = price;
  this.isBooked = false;
 }

 // Method to book a ticket
 public void bookTicket(int seatNumber) {
  if (!isBooked) {
   this.seatNumber = seatNumber;
   isBooked = true;
   System.out.println("Ticket successfully booked for seat number: " + seatNumber);
  } else {
   System.out.println("This ticket is already booked.");
  }
 }

 // Method to display ticket details
 public void displayTicketDetails() {
  if (isBooked) {
   System.out.println("Movie Name: " + movieName);
   System.out.println("Seat Number: " + seatNumber);
   System.out.println("Price: $" + price);
  } else {
   System.out.println("This ticket has not been booked yet.");
  }
 }
}

class MovieTicketBookingObject {
 public static void main(String[] args) {
  // Create objects of MovieTicket class
  MovieTicket ticket1 = new MovieTicket("Inception", 12.50);
  MovieTicket ticket2 = new MovieTicket("Interstellar", 15);

  // Book and display ticket details
  ticket1.bookTicket(101);
  ticket1.displayTicketDetails();

  System.out.println("--------------------");

  ticket2.displayTicketDetails(); // Attempt to display before booking
  ticket2.bookTicket(102);
  ticket2.displayTicketDetails();
 }
}
