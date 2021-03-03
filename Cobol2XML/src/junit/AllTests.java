package junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ LiteralTest.class, NumTest.class, SymbolTest.class, TokenTest.class, TokenTest_two.class })
public class AllTests {
	
}
