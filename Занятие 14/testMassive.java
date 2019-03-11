package homework;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class testMassive {

	Massive massive = new Massive();

	@Before
	@Test
	public void testAddName() {
		String added = "added";
		Assert.assertTrue(massive.addName("Stefan").contains(added));
		Assert.assertTrue(massive.addName("Sopfia").contains(added));
		Assert.assertTrue(massive.addName("Julya").contains(added));
		Assert.assertTrue(massive.addName("David").contains(added));
		Assert.assertTrue(massive.addName("Jack").contains(added));
	}

	@Test
	public void testAddEmpty() {
		Assert.assertFalse(massive.addName("").contains("added"));
	}

	@Test
	public void testGetName() {
		Assert.assertNotNull(massive.getName(0));
		Assert.assertNotNull(massive.getName(1));
		Assert.assertNotNull(massive.getName(2));
		Assert.assertNotNull(massive.getName(3));
		Assert.assertNotNull(massive.getName(4));

	}

	@Test
	public void testSetName() {
		String done = "replaced";
		Assert.assertTrue(massive.setName(1, "Frank").contains(done));
		Assert.assertTrue(massive.setName(2, "Ivan").contains(done));
		Assert.assertTrue(massive.setName(3, "Oleg").contains(done));

	}

	@Test
	public void testSetEmpty() {
		Assert.assertFalse(massive.setName(1, "").contains("replaced"));

	}

	@Test(expected = IndexOutOfBoundsException.class)
	public void testExceptionName() {
		Assert.assertTrue(massive.setName(5, "Oleg").contains("replaced"));
	}

	@Test
	public void testAllName() {
		Assert.assertNotNull(massive.allName());

	}

	@Test
	public void testAllClear() {
		Assert.assertNull(massive.allClear());

	}

	@After
	@Test
	public void test1() {
		System.out.println("Test finished!");
	}

	@Ignore
	@Test
	public void test2() {
		System.out.println("Test ignored!");
	}

}
