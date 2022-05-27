    import static org.junit.Assert.assertEquals;

	import org.junit.After;
	import org.junit.BeforeClass;
	import org.junit.Test;

	public class CalculateTest {
			
			@BeforeClass
			public static void setUpBeforeClass() throws Exception {
			}

			@After
			public void tearDown() throws Exception {
			}

			public void testAdd() {
				int a = 4321;
				int b = 1234;
					
				Calculate cal = new Calculate();
				int actual = cal.add(a, b); 
					 
				int expected = 5555;
				assertEquals (expected, actual);
				}
			@Test
			public void testSubtract() {
				int a = 4321;
				int b = 1234;
					
				Calculate cal = new Calculate();
				int actual = cal.subtract(a, b); 
					 
				int expected = 3087;
				assertEquals (expected, actual);
				}
			@Test
			public void testMultiply() {
				int a = 4321;
				int b = 1234;
					
				Calculate cal = new Calculate();
				int actual = cal.multiply(a, b); 
					 
				int expected = 5332114;
				assertEquals (expected, actual);
				}
			@Test
			public void testDivide() {
				int a = 10;
				int b = 10;
					
				Calculate cal = new Calculate();
				int actual = cal.divide(a, b); 
					 
				int expected = 1;
				assertEquals (expected, actual);
			}
		}

