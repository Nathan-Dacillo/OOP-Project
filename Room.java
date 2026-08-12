
public class Room {

	private int Nights;
	private String Room;
	private boolean booking;
	
	public Room() {
		Room = "CaptainSuite";
		Nights = 0;
	}
	public Room(String Roomname, int Nights) {
		this.Room = Roomname;
		this.Nights = Nights;
	}
	public int Nights() {
		return Nights;
}
	public String Roomname() {
		return Room;
	}
	public boolean Booking() {
		return booking;
	}
	public void booking() {
		booking = true;
	}

	
	public void A1() {
		if (booking) {
			System.out.println(Room + " = Number of Nights: " + Nights + " = Booked");	
		}

		else {
			System.out.println(Room + " = Number of Nights: " + Nights + " = Not yet Booked");		
		}
}
}

