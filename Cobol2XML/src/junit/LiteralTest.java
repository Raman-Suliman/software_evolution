package junit;

import static org.junit.Assert.*;

import java.util.ArrayList;
import parse.Parser;
import parse.tokens.Literal;
import org.junit.Test;

public class LiteralTest {

	@Test
	public void test() {
		String name = "Raman";
		Literal matcher = new Literal(name);
		ArrayList<Parser> parser = new ArrayList<Parser>();	
		assertSame("Raman", matcher.unvisitedString(parser));    //This passes
		assertSame(null, matcher.unvisitedString(parser));		//This fails
	}

}
