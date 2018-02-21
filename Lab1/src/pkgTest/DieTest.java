package pkgTest;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void DieTest() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();
			// TODO: Make 
			if(d.getDieValue() > 6 || d.getDieValue() < 1)
			{
				fail("Die out of range");
			}
		}

	}

}