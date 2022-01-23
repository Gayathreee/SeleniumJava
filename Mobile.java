package week1.day1;

public class Mobile {

	//Create  class Mobile (methods: sendMsg, makeCall, saveContact)

	public void sendMsg(String message) {		
		System.out.println("Message sent: "+message);
	}

	public void makeCall(String contact) {
		System.out.println("Calling " + contact + "....");
	}

	public void saveContact(long phoneNumber,String contactName) {
		System.out.println("Contact " + contactName + ":" + phoneNumber + " has been saved" );
	}

	//Create Object for Mobile and call all the methods from Main
	public static void main(String[] args) {

		//Create object for the Class Mobile
		Mobile mobile1 = new Mobile();

		mobile1.saveContact(9843651111L,"Appa");
		mobile1.sendMsg("Hi Appa");
		mobile1.makeCall("Appa");


	}
}
