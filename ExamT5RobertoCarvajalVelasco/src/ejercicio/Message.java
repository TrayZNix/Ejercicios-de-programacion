package ejercicio;

import java.util.Objects;

public class Message implements Comparable{
	static int messageCount;
	private int messageID;
	private String senderName; //Name of the person that sent the message
	private String messageBody; //Text of the message
	
	public Message() {
		
	}

	public Message(String senderName, String messageBody) {
		super();
		messageCount++;
		this.messageID = messageCount;
		this.senderName = senderName;
		this.messageBody = messageBody;
	}

	public static int getMessageCount() {
		return messageCount;
	}

	public static void setMessageCount(int messageCount) {
		Message.messageCount = messageCount;
	}

	public int getMessageID() {
		return messageID;
	}

	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	@Override
	public String toString() {
		return "Message [messageID=" + messageID + ", Sender=" + senderName + ", Message text=" + messageBody + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(messageBody, messageID, senderName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return Objects.equals(messageBody, other.messageBody) && messageID == other.messageID
				&& Objects.equals(senderName, other.senderName);
	}
	
	
	public int compareTo(Message o) {
		return (this.getMessageID()-o.getMessageID());
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
}
