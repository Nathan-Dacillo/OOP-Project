
public class Receptionist {

	private String Receptionist;

	
	public Receptionist() {
		Receptionist = "Hotel Receptionist";
	}
	
	public Receptionist (String Receptionist) {
		this.Receptionist = Receptionist;
	}
	public String getReceptionist() {
		return Receptionist;
	}

	
	public void Bookingin(Room room, Guest person) {
		System.out.println(Receptionist + " is Booking " + room.Roomname() + " for " + person.getName());
room.booking();
	}	
}
	

		
	


