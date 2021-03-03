package junit;

import parse.tokens.*;
import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumTest {

	@Test
	public void test() {
		Num num = new Num();
		int maxDepth = 2;
		int depth = 1;
		ArrayList<String> v = new ArrayList<String>();
		v = num.randomExpansion(maxDepth, depth);
		assertFalse( v.isEmpty() );
	}
}
