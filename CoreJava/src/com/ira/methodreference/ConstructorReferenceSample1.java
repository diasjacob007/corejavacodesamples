/**
 * 
 */
package com.ira.methodreference;

/**
 * @author EVAAN
 *
 */
class Message {
	public Message() {
		System.out.println("Inside the default Message class constructor...");
	}

	public Message(String msg) {
		System.out.println("The passed message is: " + msg);
	}
}

interface Messagable {
	Message printMessage(String msg);
}

public class ConstructorReferenceSample1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Messagable messagable = (message) -> {
//			return new Message(message);
//		};
		Messagable messagable = Message::new;
		messagable.printMessage("Test Message");
	}

}
