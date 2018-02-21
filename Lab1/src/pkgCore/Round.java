package pkgCore;

import java.util.LinkedList;

public class Round 
{

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	Roll ComeOutRoll = new Roll();
	private int count = 1;
	
	public Round() 
	{
		// TODO: Execute Come Out roll, value ComeOutScore
		this.ComeOutScore = ComeOutRoll.getScore();
		this.rolls.add(ComeOutRoll);
		
		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out
		Roll r1 = new Roll();
		while((r1.getScore() != 7 || r1.getScore() != this.ComeOutScore) && 
				this.ComeOutScore != 2 && this.ComeOutScore != 3 && this.ComeOutScore != 12
				&& this.ComeOutScore != 7 && this.ComeOutScore != 11)
		{
			this.rolls.add(r1);
			r1 = new Roll();
			this.count++;
		}
 
		// TODO: value the eGameResult after the round is complete 
		if(this.ComeOutScore == 7 || this.ComeOutScore == 11)
		{
			this.eGameResult = eGameResult.NATURAL;
		}
		else if(this.ComeOutScore == 2 || this.ComeOutScore == 3 || this.ComeOutScore == 12)
		{
			this.eGameResult = eGameResult.CRAPS;
		}
		else if(this.rolls.getLast().getScore() == 7)
		{
			this.eGameResult = eGameResult.SEVEN_OUT;
		}
		else if(this.rolls.getLast().getScore() == this.ComeOutScore)
		{
			this.eGameResult = eGameResult.POINT;
		}
	
	}
 
	public int RollCount() 
	{
		// Return the roll count
		return this.count;
	}
}