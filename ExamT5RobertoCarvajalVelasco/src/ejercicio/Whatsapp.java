package ejercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Whatsapp {
	private List <Message> messageList = new ArrayList<Message>(); 
	
	
	//CRUD Methods
	public void addMessage(String sender, String text) {
		Message m = new Message(sender, text);
		this.messageList.add(m);
	}
	/**
	 * Print all the list of message.
	 * Done with an iterator!
	 */
	public void printList() {
		Iterator<Message> itr = messageList.iterator();
		while(itr.hasNext()) {
			Message m = itr.next();
			System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
			System.out.println("Message number: "+m.getMessageID());
			System.out.println("Sent by: "+m.getSenderName()+".");
			System.out.println("Message: "+m.getMessageBody()+".");
			System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
			System.out.println();
		}
	}
	/**
	 * Searches only one of all the sent messages of a sender.
	 * @param sender
	 */
	public Message searchOneMSGByName(String sender) {
		Message m;
		m = searchMSGbySenderName(sender);
		printMessage(m);
		return m;
	}
	
	public void printMessage(Message m) {
		System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		System.out.println("Message number: "+m.getMessageID());
		System.out.println("Sent by: "+m.getSenderName()+".");
		System.out.println("Message: "+m.getMessageBody()+".");
		System.out.println(".-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
		System.out.println();
	}
	/**
	 * Searches all messages sent by an specified sender
	 * @param sender
	 */
	
	public void searchAllMSGByName(String sender) {
		for(Message m : this.messageList) {
			if(m.getSenderName().equalsIgnoreCase(sender)) {
				printMessage(m);
			}
		}
	}
	
	public Message searchMSGbyID(int messageID) {
		Message mSearched = null;
		for (Message m : this.messageList) {
			if(messageID == m.getMessageID()) {
				mSearched = m;
			}			
		}
		return mSearched;
	}
	public Message searchMSGbySenderName(String senderName) {
		Message mSearched = null;
		for (Message m : this.messageList) {
			if(senderName == m.getSenderName()) {
				mSearched = m;
			}			
		}
		return mSearched;
	}
	/**
	 * Deletes a message selected by the user
	 */
	public void removeSender(int messageID) {
		Message mRemove = null;
		boolean remove = false;
		for(Message m : this.messageList) {
			if(messageID == m.getMessageID()) {
				 mRemove = m;
				 remove = true;
			}
		}
		if(remove) {
			this.messageList.remove(mRemove);
		}
		
	}
	
	public void updateSentText(int messageID, String newText) {
		Message m = searchMSGbyID(messageID);
		this.messageList.remove(m);
		m.setMessageBody("**"+newText+"**");
		this.messageList.add(m);
	}
	
	//END OF CRUD METHODS
	
	//NO-CRUD METHODS 
	
	/**
	 * Calculates the total benefits you would get
	 * @param messagePrice
	 * @return
	 */
	public double calculateMoneyBenefit(double messagePrice) {
		return messagePrice * this.messageList.size();
		
	}
	
	public void sortMessageListByName() {
		Collections.sort(this.messageList, new CompareBySenderName());
	}
	
	public void sortMessageListByID() {
		this.messageList.sort(new CompareByID());
	}
	
}
