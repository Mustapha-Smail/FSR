package fr.nanterre.miage.fsr.entities;

public class Contact {

	private String firstName;
	private String lastName;
	private String email;
	private long idContact;
	
	public Contact(){
	}
	

	public Contact(String firstName, String lastName, String email, long idContact) {
		this(firstName, lastName, email);
		this.idContact = idContact;
	}


	public Contact(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}


	public String getEmail(){
		return email;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstname){
		this.firstName = firstname;
	}
	
	
	public String getLastName(){
		return lastName;
	}
	
	public void setLastName(String lastname){
		this.lastName = lastname;
	}

	public long getIdContact() {
		return idContact;
	}

	public void setIdContact(long idContact) {
		this.idContact = idContact;
	}	
	
}
