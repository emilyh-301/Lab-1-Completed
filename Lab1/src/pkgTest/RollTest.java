package pkgTest;

import static org.junit.Assert.*;
import org.junit.Test;

import pkgCore.Die;
import pkgCore.Roll;

public class RollTest {

	@Test
	public void RollTest() {

		for (int a = 0; a < 10000; a++) {
			Roll r = new Roll();
			// TODO: Make sure value of roll is between 1 and 12.
			if(r.getScore() > 12 || r.getScore() < 1)
			{
				fail("Die out of range");
			}
		}

	}

}