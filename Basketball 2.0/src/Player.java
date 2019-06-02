import java.util.Arrays;
import java.util.Random;


public class Player implements Distance,PlayerActions {
	
	Random rand = new Random();
	 int twoPointsThrow=rand.nextInt(10);
	 int threePointsThorw=rand.nextInt(10);
	 int pass=rand.nextInt(10);
	 int steal=rand.nextInt(10);
	 int rebound=rand.nextInt(10);
	 int xPosition;
	 int yPosition;
	 boolean hasBall=false;
	 
	 public void moving()
	 {
		 if(xPosition>0 && xPosition<30)
		 {
			 xPosition+=rand.nextInt(5)-2;
		 }
		 if(xPosition<=6)
		 {
			 xPosition+=rand.nextInt(3);
		 }
		 if(xPosition>=24)
		 {
			 xPosition-=rand.nextInt(3);
		 }
		 
		 if(yPosition>0 && yPosition<40)
		 {
			 yPosition+=rand.nextInt(3)-2;
		 }
		 if(yPosition<=6)
		 {
			 yPosition+=rand.nextInt(5);
		 }
		 if(yPosition>=34)
		 {
			 yPosition-=rand.nextInt(5);
		 }
	 }
	
	 public int checkPosition(Court c) {

			if(c.coordinates[xPosition][yPosition]==1)
			{
				return 1;
			}
			else 
				return 0;


		}
	 @Override
		public Player nearestPlayer( Team t) {
			
			int [] distance = new int [5];
			distance[0]=distanceFromPlayer(this, t.p1);
			distance[1]=distanceFromPlayer(this, t.p2);
			distance[2]=distanceFromPlayer(this, t.p3);
			distance[3]=distanceFromPlayer(this, t.p4);
			distance[4]=distanceFromPlayer(this, t.p5);
			Arrays.sort(distance);
			int newDistance=distance[0];
			if(newDistance==distanceFromPlayer(this, t.p1))
			{
				
				return t.p1;
			}
			if(newDistance==distanceFromPlayer(this, t.p2))
			{
				
				return t.p2;
			}
			if(newDistance==distanceFromPlayer(this, t.p3))
			{
				
				return t.p3;
			}
			 if(newDistance==distanceFromPlayer(this, t.p4))
			{
				 
				return t.p4;
			}
			 if(newDistance==distanceFromPlayer(this, t.p5))
			{
				 
				return t.p5;
			}
			else
			return null;
			
			
		}

		@Override
		public int distanceFromPlayer(Player p1, Player p2) {
			
			return Math.abs(p1.xPosition-p2.xPosition)+Math.abs(p1.yPosition-p2.yPosition);
			
			
		}

		@Override
		public void readyToThrow( Team t1, Team t2 , Court c, Ball b) {
			if(t1.teamNr==1)
			{
				if(this.yPosition>20)
				{
					if(this.hasBall)
					{
						this.throwBall(t1,t2,c,b);
					}
					
				}
				else
				{
					this.moving();
				}
				
			}
			if(t1.teamNr==2)
				if(this.yPosition<20)
				{
					if(this.hasBall)
					{
						this.throwBall(t1,t2,c,b);
					}
					
				}
				else
				{
					this.moving();
				}
			
			
		}

		@Override
		public void throwBall(Team t1 , Team t2 , Court c , Ball b) {
			if(t1.teamNr==1) 
			{
				if(this.checkPosition(c)==0)
				{
					if(this.twoPointsThrow + rand.nextInt(6)>10)
					{
						t1.score+=2;
						t1.newWinAction();
						t2.newLooseAction();
					}
					else
					{
						b.rebound(this,t2);
					}
				}
				if(this.checkPosition(c)==1) 
				{
					if(this.threePointsThorw+rand.nextInt(6)>10)
					{
						t1.score+=3;
						t1.newWinAction();
						t2.newLooseAction();
					}
					else
					{
						b.rebound(this,t2);
					}
				}
			}
			
			if(t1.teamNr==2) 
			{
				if(this.checkPosition(c)==0)
				{
					if(this.twoPointsThrow + rand.nextInt(6)>10)
					{
						t1.score+=2;
						t1.newWinAction();
						t2.newLooseAction();
					}
					else
					{
						b.rebound(this,t2);
					}
				}
				if(this.checkPosition(c)==1) 
				{
					if(this.threePointsThorw+rand.nextInt(6)>10)
					{
						t1.score+=3;
						t1.newWinAction();
						t2.newLooseAction();
					}
					else
					{
						b.rebound(this,t2);
					}
				}
			}
		}

	

}
