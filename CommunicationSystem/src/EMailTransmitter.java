
public class EMailTransmitter implements Transmitter {

	private Message message;
	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	@Override
	public void store(Message message) {
		this.message = message;
		message.getReceiver().notification(this);
	}
	
	@Override
	public Message retrieve(Person receiver) {
		receiver.setTransmitter(this);
		return this.message;
	}
}
