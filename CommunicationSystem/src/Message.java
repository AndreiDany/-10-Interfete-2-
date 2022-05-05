
public class Message {

	private String message;
	private Person transmitter;
	private Person receiver;
		
	public Message(String message, Person transmitter, Person receiver) {
		this.message = message;
		this.transmitter = transmitter;
		this.receiver = receiver;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Person getTransmitter() {
		return transmitter;
	}

	public void setTransmitter(Person transmitter) {
		this.transmitter = transmitter;
	}

	public Person getReceiver() {
		return receiver;
	}

	public void setReceiver(Person receiver) {
		this.receiver = receiver;
	}

}
