package task2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestClass {
	
	@SuppressWarnings("null")
	@Test
	void test() {
		Customer s=new Customer("aneeza","1234","1234","Islamabad");
		Account object=new Account("saving",2500,s);
		object.makeDeposite(11000);
		assertEquals(13500,object.getBal());

		object.transferAmount(3000);
		assertEquals(10500,object.getBal());
		

		object.Withdrawl(5000);
		assertEquals(5500,object.getBal());
	}
}
