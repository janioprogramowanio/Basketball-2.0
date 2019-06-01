import java.util.Random;

public class Ball {
	
	Random rand = new Random();
	
	public void pass(Team t)
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

}
