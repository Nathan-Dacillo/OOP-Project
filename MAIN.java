
public class MAIN {

	public static void main(String[] args) {
		
		System.out.println("#--------------------------------------------#");
		System.out.println("#----------------HOTEL-BOOKING---------------#");
		System.out.println("#--------------------------------------------#");
		Room Hotel = new Room ("The Oceanside Hotel", 7);
		Receptionist Reception = new Receptionist("Lily");
		Guest person = new Guest("Steve");

	
		 System.out.println("Booking before:");
	        Hotel.A1();
	        
	
		System.out.println("[*********************************************]");
		
		Reception.Bookingin(Hotel, person);
		
		System.out.println("[*********************************************]");

        System.out.println("Booking After");
        Hotel.A1();
        
		System.out.println("[##############################################]");
		
        System.out.println("[-------------BOOKING-COMPLETE-----------------]");
    
		System.out.println("[##############################################]");
	}
	}



