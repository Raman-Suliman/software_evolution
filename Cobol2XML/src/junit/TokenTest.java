package junit;

import static org.junit.Assert.*;

import org.junit.Test;
import parse.tokens.Token;

public class TokenTest {

	@Test
	public void test() {
		char c = 'a';   //Char token type passed as an argument to Token constructor
		int num = 5;	//num token type passed as an argument to Token constructor
		Token t = new Token(num);
		assertTrue(t.isNumber());
		assertFalse(t.isWord());
		assertTrue(t.isSymbol());
	}

}
