package pkgCore;

public class Roll 
{

	private Die d1;
	private Die d2;

	public Roll() 
	{
		// TODO: Create an instance of d1 and d2...
		d1 = new Die();
		d2 = new Die();
	}
	
	public int score()
	{
		return this.d1.getDieValue() + this.d2.getDieValue();
	}

	public int getScore() 
	{
		return score();
	}
}  