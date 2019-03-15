package homework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testMassiveNG {
	Massive massive = new Massive();

	@BeforeMethod
	@Test
	public void testAddName() {
		String added = "added";
		Assert.assertTrue(massive.addName("Stefan").contains(added));
		Assert.assertTrue(massive.addName("Sopfia").contains(added));
		Assert.assertTrue(massive.addName("Julya").contains(added));
		Assert.assertTrue(massive.addName("David").contains(added));
		Assert.assertTrue(massive.addName("Jack").contains(added));
		Assert.assertTrue(massive.addName("Lola").contains(added));
		Assert.assertTrue(massive.addName("Lucas").contains(added));
		Assert.assertTrue(massive.addName("Alex").contains(added));
	}

	@Test
	public void testFindNames() {
		Assert.assertNotNull(massive.findName('L'));
	}

	@Test
	public void testFindNames2() {
		Assert.assertNull(massive.findName('N'));
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

	@Test(expectedExceptions = IndexOutOfBoundsException.class)
	public void testExceptionName() {
		Assert.assertTrue(massive.setName(8, "Oleg").contains("replaced"));
	}

	@Test
	public void testAllName() {
		Assert.assertNotNull(massive.allName());

	}

	@Test
	public void testAllName2() {
		Assert.assertTrue(massive.allName().toString().matches("[^0-9]+"));

	}

	@Test
	public void testAllClear() {
		Assert.assertNull(massive.allClear());

	}

	@Test
	public void testMaxName() {
		Assert.assertEquals(massive.maxNames(), "Sopfia");

	}

	@Test
	public void testMinName() {
		Assert.assertEquals(massive.minNames(), "Alex");

	}

	@Test
	public void testToLower() {
		Assert.assertEquals(massive.toLower(7), "alex");

	}

	@Test
	public void testToUpperName() {
		Assert.assertEquals(massive.toUpper(6), "LUCAS");

	}

	@AfterMethod
	@Test
	public void test1() {
		System.out.println("Test finished!");
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println("Test ignored!");
	}

	@Test(enabled = false)
	public void test3() {
		System.out.println("Test ignored!");
	}

	@Test(enabled = false)
	public void test4() {
		System.out.println("Test ignored!");
	}

	@Test(enabled = false)
	public void test5() {
		System.out.println("Test ignored!");
	}

	@Test(enabled = false)
	public void test6() {
		System.out.println("Test ignored!");
	}

}
