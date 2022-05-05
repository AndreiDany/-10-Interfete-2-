
public class Person {

	private String name;
	private Transmitter transmitter;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setTransmitter(Transmitter transmitter) {
		this.transmitter = transmitter;
	}
	
	public void send(Person p, String message) {
		
		Message messageObj = new Message(message, this, p);
		this.transmitter.store(messageObj);
	}
	
	public void notification(Transmitter transmitter) {
		System.out.println(transmitter.retrieve(this).getTransmitter().name + " said to " + this.name + " " + 
				transmitter.retrieve(this).getMessage());
	}
}
