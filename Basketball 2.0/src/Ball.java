import java.util.Random;

public class Ball implements BallActions{
	
	Random rand = new Random();
	
	@Override
	public void passBall(Team t)
	{
		if(t.p1.isHasBall())
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p1.setHasBall(false);
				t.p2.setHasBall(true);
				t.p3.setHasBall(false);
				t.p4.setHasBall(false);
				t.p5.setHasBall(false);
				break;
			}
			case 1:
			{
				t.p1.setHasBall(false);
				t.p2.setHasBall(false);
				t.p3.setHasBall(true);
				t.p4.setHasBall(false);
				t.p5.setHasBall(false);
				break;
			}
			case 2:
			{
				t.p1.setHasBall(false);
				t.p2.setHasBall(false);
				t.p3.setHasBall(false);
				t.p4.setHasBall(true);
				t.p5.setHasBall(false);
				break;
			}
			case 3:
			{
				t.p1.setHasBall(false);
				t.p2.setHasBall(false);
				t.p3.setHasBall(false);
				t.p4.setHasBall(false);
				t.p5.setHasBall(true);
				break;
			}
			
			
			}
		}
		else if(t.p2.isHasBall())
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p2.setHasBall(false);
				t.p1.setHasBall(true);
				t.p3.setHasBall(false);
				t.p4.setHasBall(false);
				t.p5.setHasBall(false);
				break;
			}
			case 1:
			{
				t.p2.setHasBall(false);
				t.p1.setHasBall(true);
				t.p3.setHasBall(false);
				t.p4.setHasBall(false);
				t.p5.setHasBall(false);
				break;
			}
			case 2:
			{
				t.p2.setHasBall(false);
				t.p1.setHasBall(false);
				t.p3.setHasBall(false);
				t.p4.setHasBall(true);
				t.p5.setHasBall(false);
				break;
			}
			case 3:
			{
				t.p2.setHasBall(false);
				t.p1.setHasBall(false);
				t.p3.setHasBall(false);
				t.p4.setHasBall(false);
				t.p5.setHasBall(true);
				break;
			}
			
			
			}
		}
		else if(t.p3.isHasBall())
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p3.setHasBall(false);
				t.p1.setHasBall(true);
				t.p2.setHasBall(false);
				t.p4.setHasBall(false);
				t.p5.setHasBall(false);
				break;
			}
			case 1:
			{
				t.p3.setHasBall(false);
				t.p1.setHasBall(false);
				t.p2.setHasBall(true);
				t.p4.setHasBall(false);
				t.p5.setHasBall(false);
				break;
			}
			case 2:
			{
				t.p3.setHasBall(false);
				t.p1.setHasBall(false);
				t.p2.setHasBall(false);
				t.p4.setHasBall(true);
				t.p5.setHasBall(false);
				break;
			}
			case 3:
			{
				t.p3.setHasBall(false);
				t.p1.setHasBall(false);
				t.p2.setHasBall(false);
				t.p4.setHasBall(false);
				t.p5.setHasBall(true);
				break;
			}
			
			
			}
		}
		else if(t.p4.isHasBall())
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p4.setHasBall(false);
				t.p1.setHasBall(true);
				t.p2.setHasBall(false);
				t.p3.setHasBall(false);
				t.p5.setHasBall(false);
				break;
			}
			case 1:
			{
				t.p4.setHasBall(false);
				t.p1.setHasBall(false);
				t.p2.setHasBall(true);
				t.p3.setHasBall(false);
				t.p5.setHasBall(false);
				break;
			}
			case 2:
			{
				t.p4.setHasBall(false);
				t.p1.setHasBall(false);
				t.p2.setHasBall(false);
				t.p3.setHasBall(true);
				t.p5.setHasBall(false);
				break;
			}
			case 3:
			{
				t.p4.setHasBall(false);
				t.p1.setHasBall(false);
				t.p2.setHasBall(false);
				t.p3.setHasBall(false);
				t.p5.setHasBall(true);
				break;
			}
			
			
			}
		}
		else if(t.p5.isHasBall())
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p5.setHasBall(false);
				t.p1.setHasBall(true);
				t.p2.setHasBall(false);
				t.p3.setHasBall(false);
				t.p4.setHasBall(false);
				break;
			}
			case 1:
			{
				t.p5.setHasBall(false);
				t.p1.setHasBall(false);
				t.p2.setHasBall(true);
				t.p3.setHasBall(false);
				t.p4.setHasBall(false);
				break;
			}
			case 2:
			{
				t.p5.setHasBall(false);
				t.p1.setHasBall(false);
				t.p2.setHasBall(false);
				t.p3.setHasBall(true);
				t.p4.setHasBall(false);
				break;
			}
			case 3:
			{
				t.p5.setHasBall(false);
				t.p1.setHasBall(false);
				t.p2.setHasBall(false);
				t.p3.setHasBall(false);
				t.p4.setHasBall(true);
				break;
			}
			
			
			}
		}
		
		
	}

	@Override
	public void reclaimBall(Team t1 , Team t2) {
		int randt1=rand.nextInt(10);
		int randt2=rand.nextInt(10);
		
		if(t1.p1.isHasBall())
		{
			if(t1.p1.getPass()+randt1>t1.p1.nearestPlayer(t2).getSteal()+randt2)
			{
				passBall(t1);
			}
			else
			{
				t1.p1.setHasBall(false);
				t1.p1.nearestPlayer(t2).setHasBall(true);
				passBall(t2);
			}
		}
		else if(t1.p2.isHasBall())
		{
			if(t1.p2.getPass()+randt1>t1.p2.nearestPlayer(t2).getSteal()+randt2)
			{
				passBall(t1);
			}
			else
			{
				t1.p2.setHasBall(false);
				t1.p2.nearestPlayer(t2).setHasBall(true);
				passBall(t2);

			}
		}
		else if(t1.p3.isHasBall())
		{
			if(t1.p3.getPass()+randt1>t1.p3.nearestPlayer(t2).getSteal()+randt2)
			{
				passBall(t1);
			}
			else
			{
				t1.p3.setHasBall(false);
				t1.p3.nearestPlayer(t2).setHasBall(true);
				passBall(t2);

			}
		}
		else if(t1.p4.isHasBall())
		{
			if(t1.p4.getPass()+randt1>t1.p4.nearestPlayer(t2).getSteal()+randt2)
			{
				passBall(t1);
			}
			else
			{
				t1.p4.setHasBall(false);
				t1.p4.nearestPlayer(t2).setHasBall(true);
				passBall(t2);

			}
		}
		else  if(t1.p5.isHasBall())
		{
			if(t1.p5.getPass()+randt1>t1.p5.nearestPlayer(t2).getSteal()+randt2)
			{
				passBall(t1);
			}
			else
			{
				t1.p5.setHasBall(false);
				t1.p5.nearestPlayer(t2).setHasBall(true);
				passBall(t2);

			}
		}
		else  if(t2.p1.isHasBall())
		{
			if(t2.p1.getPass()+randt2>t2.p1.nearestPlayer(t1).getSteal()+randt1)
			{
				passBall(t2);
			}
			else
			{
				t2.p1.setHasBall(false);
				t2.p1.nearestPlayer(t1).setHasBall(true);
				passBall(t1);

			}
		}
		else if(t2.p2.isHasBall())
		{
			if(t2.p2.getPass()+randt2>t2.p2.nearestPlayer(t1).getSteal()+randt1)
			{
				passBall(t2);
			}
			else
			{
				t2.p2.setHasBall(false);
				t2.p2.nearestPlayer(t1).setHasBall(true);
				passBall(t1);

			}
		}
		else if(t2.p3.isHasBall())
		{
			if(t2.p3.getPass()+randt2>t2.p3.nearestPlayer(t1).getSteal()+randt1)
			{
				passBall(t2);
			}
			else
			{
				t2.p3.setHasBall(false);
				t2.p3.nearestPlayer(t1).setHasBall(true);
				passBall(t1);

			}
		}
		else if(t2.p4.isHasBall())
		{
			if(t2.p4.getPass()>t2.p4.nearestPlayer(t1).getSteal())
			{
				passBall(t2);
			}
			else
			{
				t2.p4.setHasBall(false);
				t2.p4.nearestPlayer(t1).setHasBall(true);
				passBall(t1);

			}
		}
		else if(t2.p5.isHasBall())
		{
			if(t2.p5.getPass()+randt2>t2.p5.nearestPlayer(t1).getSteal()+randt1)
			{
				passBall(t2);
			}
			else
			{
				t2.p5.setHasBall(false);
				t2.p5.nearestPlayer(t1).setHasBall(true);
				passBall(t1);

			}
		}
		
		
		
	}

	@Override
	public void rebound(Player p1 , Team t) {
		if(p1.getRebound()+rand.nextInt(6)>p1.nearestPlayer(t).getRebound()+rand.nextInt(6))
		{
			p1.nearestPlayer(t).setHasBall(false);
			p1.setHasBall(true);
		

		}
		else
		{
			p1.setHasBall(false);
			p1.nearestPlayer(t).setHasBall(true);
		}
		
	}

}
