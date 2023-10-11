package com.tnsif.dayfifteen.generics;

public class SenderDemo {

	public static void main(String[] args) {
		Sender<String> stringSender=new Sender<String>("hello! How are you? ");
		Sender<Person> personSender=new Sender<Person>();
		personSender.setMessage(new Person("Amit","Pune"));
		
		stringSender.sendMessage();
		personSender.sendMessage();

	}

}
