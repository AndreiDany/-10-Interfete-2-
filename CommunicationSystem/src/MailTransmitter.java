import java.util.ArrayList;
import java.util.Iterator;

public class MailTransmitter implements Transmitter {

	private int messageCapacity;
	private ArrayList<Message> messages = new ArrayList<Message>();

	public MailTransmitter(int messageCapacity) {
		this.messageCapacity = messageCapacity;
	}

	@Override
	public void store(Message message) {

		messages.add(message);
		
		if(messages.size() == messageCapacity)
		{
			Iterator<Message> m = messages.iterator();
			while(m.hasNext())
			{
				m.next().getReceiver().notification(this);
			}
		}
	}

	@Override
	public Message retrieve(Person receiver) {
		
			Iterator<Message> m = messages.iterator();
			while(m.hasNext())
			{   
				Message msg = m.next();
				if(receiver.getName() == msg.getReceiver().getName())
					return msg;
			}
		return null;
	}

	
}
