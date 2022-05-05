
public interface Transmitter
{
	public void store(Message message);
	public Message retrieve(Person receiver);
}