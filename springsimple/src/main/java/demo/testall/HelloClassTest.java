package demo.testall;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.springsimple.VoterData;

public class HelloClassTest {

	public static void main(String[] args) {
			
		ApplicationContext appcontext=new ClassPathXmlApplicationContext("SimpleBeans.xml");
		
		System.out.println("\n-------Object h1--------------");
		VoterData h1=(VoterData) appcontext.getBean("h1");
		h1.setId(1);
		h1.setName("Jaydeep");
		h1.setParty("BJP");		
		h1.display();
		
		System.out.println("\n-------Object h2--------------");
		VoterData h2=(VoterData) appcontext.getBean("h1");
		h2.setName("Raju");//in Singlton pattern, it will overwrite same object name
		h2.setId(9);
		h2.setParty("MNS");
		h2.display();
		
		System.out.println("-------Object h1--------------");
		h1.display();
		
		System.out.println("\n\nh1 :"+h1.hashCode());//in prototype hashcode will be diffrent of these objects
		System.out.println("h2 :"+h2.hashCode());//in singleton both hashcode will be same..
		
		
	}

}
