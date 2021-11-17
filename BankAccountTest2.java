package Junit5.A3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankAccountTest2 {

	@Test
	void test() {
		BankAccount acc1=new BankAccount(20000.00);
		
		assertThrows(InsufficientFundsException.class, ()->acc1.withDreaw(21000.0));

	}

}