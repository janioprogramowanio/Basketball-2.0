import java.util.Random;

public class Ball implements BallActions{
	
	Random rand = new Random();
	
	@Override
	public void passBall(Team t)
	{
		if(t.p1.hasBall)
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p1.hasBall=false;
				t.p2.hasBall=true;
				t.p3.hasBall=false;
				t.p4.hasBall=false;
				t.p5.hasBall=false;
				break;
			}
			case 1:
			{
				t.p1.hasBall=false;
				t.p2.hasBall=false;
				t.p3.hasBall=true;
				t.p4.hasBall=false;
				t.p5.hasBall=false;
				break;
			}
			case 2:
			{
				t.p1.hasBall=false;
				t.p2.hasBall=false;
				t.p3.hasBall=false;
				t.p4.hasBall=true;
				t.p5.hasBall=false;
				break;
			}
			case 3:
			{
				t.p1.hasBall=false;
				t.p2.hasBall=false;
				t.p3.hasBall=false;
				t.p4.hasBall=false;
				t.p5.hasBall=true;
				break;
			}
			
			
			}
		}
		else if(t.p2.hasBall)
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p2.hasBall=false;
				t.p1.hasBall=true;
				t.p3.hasBall=false;
				t.p4.hasBall=false;
				t.p5.hasBall=false;
				break;
			}
			case 1:
			{
				t.p2.hasBall=false;
				t.p1.hasBall=false;
				t.p3.hasBall=true;
				t.p4.hasBall=false;
				t.p5.hasBall=false;
				break;
			}
			case 2:
			{
				t.p2.hasBall=false;
				t.p1.hasBall=false;
				t.p3.hasBall=false;
				t.p4.hasBall=true;
				t.p5.hasBall=false;
				break;
			}
			case 3:
			{
				t.p2.hasBall=false;
				t.p1.hasBall=false;
				t.p3.hasBall=false;
				t.p4.hasBall=false;
				t.p5.hasBall=true;
				break;
			}
			
			
			}
		}
		else if(t.p3.hasBall)
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p3.hasBall=false;
				t.p1.hasBall=true;
				t.p2.hasBall=false;
				t.p4.hasBall=false;
				t.p5.hasBall=false;
				break;
			}
			case 1:
			{
				t.p3.hasBall=false;
				t.p1.hasBall=false;
				t.p2.hasBall=true;
				t.p4.hasBall=false;
				t.p5.hasBall=false;
				break;
			}
			case 2:
			{
				t.p3.hasBall=false;
				t.p1.hasBall=false;
				t.p2.hasBall=false;
				t.p4.hasBall=true;
				t.p5.hasBall=false;
				break;
			}
			case 3:
			{
				t.p3.hasBall=false;
				t.p1.hasBall=false;
				t.p2.hasBall=false;
				t.p4.hasBall=false;
				t.p5.hasBall=true;
				break;
			}
			
			
			}
		}
		else if(t.p4.hasBall)
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p4.hasBall=false;
				t.p1.hasBall=true;
				t.p2.hasBall=false;
				t.p3.hasBall=false;
				t.p5.hasBall=false;
				break;
			}
			case 1:
			{
				t.p4.hasBall=false;
				t.p1.hasBall=false;
				t.p2.hasBall=true;
				t.p3.hasBall=false;
				t.p5.hasBall=false;
				break;
			}
			case 2:
			{
				t.p4.hasBall=false;
				t.p1.hasBall=false;
				t.p2.hasBall=false;
				t.p3.hasBall=true;
				t.p5.hasBall=false;
				break;
			}
			case 3:
			{
				t.p4.hasBall=false;
				t.p1.hasBall=false;
				t.p2.hasBall=false;
				t.p3.hasBall=false;
				t.p5.hasBall=true;
				break;
			}
			
			
			}
		}
		else if(t.p5.hasBall)
		{
			switch(rand.nextInt(4))
			{
			case 0:
			{
				t.p5.hasBall=false;
				t.p1.hasBall=true;
				t.p2.hasBall=false;
				t.p3.hasBall=false;
				t.p4.hasBall=false;
				break;
			}
			case 1:
			{
				t.p5.hasBall=false;
				t.p1.hasBall=false;
				t.p2.hasBall=true;
				t.p3.hasBall=false;
				t.p4.hasBall=false;
				break;
			}
			case 2:
			{
				t.p5.hasBall=false;
				t.p1.hasBall=false;
				t.p2.hasBall=false;
				t.p3.hasBall=true;
				t.p4.hasBall=false;
				break;
			}
			case 3:
			{
				t.p5.hasBall=false;
				t.p1.hasBall=false;
				t.p2.hasBall=false;
				t.p3.hasBall=false;
				t.p4.hasBall=true;
				break;
			}
			
			
			}
		}
		
		
	}

	@Override
	public void reclaimBall(Team t1 , Team t2) {
		if(t1.p1.hasBall==true)
		{
			if(t1.p1.pass>t1.p1.nearestPlayer(t2).steal)
			{
				passBall(t1);
			}
			else
			{
				t1.p1.hasBall=false;
				t1.p1.nearestPlayer(t2).hasBall=true;
			}
		}
		 if(t1.p2.hasBall)
		{
			if(t1.p2.pass>t1.p2.nearestPlayer(t2).steal)
			{
				passBall(t1);
			}
			else
			{
				t1.p2.hasBall=false;
				t1.p2.nearestPlayer(t2).hasBall=true;
			}
		}
		 if(t1.p3.hasBall)
		{
			if(t1.p3.pass>t1.p3.nearestPlayer(t2).steal)
			{
				passBall(t1);
			}
			else
			{
				t1.p3.hasBall=false;
				t1.p3.nearestPlayer(t2).hasBall=true;
			}
		}
		 if(t1.p4.hasBall)
		{
			if(t1.p4.pass>t1.p4.nearestPlayer(t2).steal)
			{
				passBall(t1);
			}
			else
			{
				t1.p4.hasBall=false;
				t1.p4.nearestPlayer(t2).hasBall=true;
			}
		}
		 if(t1.p5.hasBall)
		{
			if(t1.p5.pass>t1.p5.nearestPlayer(t2).steal)
			{
				passBall(t1);
			}
			else
			{
				t1.p5.hasBall=false;
				t1.p5.nearestPlayer(t2).hasBall=true;
			}
		}
		 if(t2.p1.hasBall)
		{
			if(t2.p1.pass>t2.p1.nearestPlayer(t1).steal)
			{
				passBall(t2);
			}
			else
			{
				t2.p1.hasBall=false;
				t2.p1.nearestPlayer(t1).hasBall=true;
			}
		}
		 if(t2.p2.hasBall)
		{
			if(t2.p2.pass>t2.p2.nearestPlayer(t1).steal)
			{
				passBall(t2);
			}
			else
			{
				t2.p2.hasBall=false;
				t2.p2.nearestPlayer(t1).hasBall=true;
			}
		}
		 if(t2.p3.hasBall)
		{
			if(t2.p3.pass>t2.p3.nearestPlayer(t1).steal)
			{
				passBall(t2);
			}
			else
			{
				t2.p3.hasBall=false;
				t2.p3.nearestPlayer(t1).hasBall=true;
			}
		}
		 if(t2.p4.hasBall)
		{
			if(t2.p4.pass>t2.p4.nearestPlayer(t1).steal)
			{
				passBall(t2);
			}
			else
			{
				t2.p4.hasBall=false;
				t2.p4.nearestPlayer(t1).hasBall=true;
			}
		}
		 if(t2.p5.hasBall)
		{
			if(t2.p5.pass>t2.p5.nearestPlayer(t1).steal)
			{
				passBall(t2);
			}
			else
			{
				t2.p5.hasBall=false;
				t2.p5.nearestPlayer(t1).hasBall=true;
			}
		}
		
		
		
	}

	@Override
	public void rebound(Team t1 , Team t2) {
		// TODO Auto-generated method stub
		
	}

}
