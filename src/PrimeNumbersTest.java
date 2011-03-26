import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;



public class PrimeNumbersTest
{
	@Test
	public void testOne()
	{
		assertEquals(new ArrayList<Integer>(), PrimeNumbers.generatePrimes(1));
	}
	
	@Test
	public void testTwo()
	{
		assertEquals(list(2), PrimeNumbers.generatePrimes(2));
	}
	
	@Test
	public void testThree()
	{
		assertEquals(list(3), PrimeNumbers.generatePrimes(3));
	}
	
	@Test
	public void testFour()
	{
		assertEquals(list(2, 2), PrimeNumbers.generatePrimes(4));
	}
	
	@Test
	public void testSix()
	{
		assertEquals(list(2, 3), PrimeNumbers.generatePrimes(6));
	}
	
	@Test
	public void testEight()
	{
		assertEquals(list(2, 2, 2), PrimeNumbers.generatePrimes(8));
	}
	
	@Test
	public void testNine()
	{
		assertEquals(list(3, 3), PrimeNumbers.generatePrimes(9));
	}
	
	@Test
	public void testBigNumber()
	{
		assertEquals(list(5, 7, 7, 1327), PrimeNumbers.generatePrimes(325115));
	}
	
	// start of Task 5
	
	@Test
	public void testListPrimesTwo()
	{
		assertEquals(new ArrayList<Integer>(), PrimeNumbers.listPrimes(2));
	}
	
	@Test
	public void testListPrimesThree()
	{
		assertEquals(list(2), PrimeNumbers.listPrimes(3));
	}
	
	@Test
	public void testListPrimesFour()
	{
		assertEquals(list(2, 3), PrimeNumbers.listPrimes(4));
	}
	
	@Test
	public void testListPrimesFive()
	{
		assertEquals(list(2, 3), PrimeNumbers.listPrimes(5));
	}
	
	@Test
	public void testListPrimesSix()
	{
		assertEquals(list(2, 3, 5), PrimeNumbers.listPrimes(6));
	}
	
	@Test
	public void testListPrimesSeven()
	{
		assertEquals(list(2, 3, 5), PrimeNumbers.listPrimes(7));
	}
	
	@Test
	public void testListPrimesTen()
	{
		assertEquals(list(2, 3, 5, 7), PrimeNumbers.listPrimes(10));
	}
	
	@Test
	public void testListPrimesTwentyFive()
	{
		assertEquals(list(2, 3, 5, 7, 11, 13, 17, 19, 23), PrimeNumbers.listPrimes(25));
	}
	
	public ArrayList<Integer> list(int... ints)
	{
		ArrayList<Integer> items = new ArrayList<Integer>();
		for(int i : ints)
		{
			items.add(i);
		}
		return items;
	}
}