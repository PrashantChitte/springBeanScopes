/**
 * 
 */
package demo.springsimple;

import org.springframework.beans.factory.annotation.Required;

/**
 * @author PrashantChitte
 *
 */
public class VoterData {

	private String name;
	private int id;
	private String party;
				
	
	
	public VoterData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VoterData(String name, int id, String party) {
		super();
		this.name = name;
		this.id = id;
		this.party = party;
	}
	
	public String getName() {
		return name;
	}
	//@Required
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	//@Required
	public void setId(int id) {
		this.id = id;
	}
	public String getParty() {
		return party;
	}
	//@Required
	public void setParty(String party) {
		this.party = party;
	}
	
	public void display()
	{
		System.out.println("NAme  :"+name);
		System.out.println("Id    : "+id);
		System.out.println("Party :"+party);
	}
	
}
