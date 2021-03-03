package junit;

import static org.junit.Assert.*;
import parse.tokens.*;
import java.util.ArrayList;

import org.junit.Test;

public class SymbolTest {

	@Test
	public void test() {
		char c = 'a';
		Symbol symbol = new Symbol(c);
		ArrayList<String> v = new ArrayList<String>();
		v = symbol.randomExpansion(2,1);
		assertTrue( v.isEmpty() );
	}

}
