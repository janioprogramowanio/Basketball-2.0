import java.util.Arrays;
import java.util.Random;


public class Player implements Distance,PlayerActions {
	
	Random rand = new Random();
	private int twoPointsThrow=rand.nextInt(10);
	private int threePointsThorw=rand.nextInt(10);
	private int pass=rand.nextInt(10);
	private int steal=rand.nextInt(10);
	private int rebound=rand.nextInt(10);
	private int xPosition;
	private int yPosition;
	private boolean hasBall=false;
	
	
	 
	 public void moving(Team t1 , Team t2)
	 {
		 if(t1.teamNr==1)
		 {
			 if((this.yPosition>2 && this.yPosition<39) && (this.xPosition>2 && this.yPosition<29))
			 {
				this.yPosition+=rand.nextInt(2);
				this.xPosition+=rand.nextInt(2);
			 }
			 else if (this.yPosition<=2)
			 {
				 this.yPosition+=4;
			 }
			 else if(this.yPosition>=39)
			 {
				 this.yPosition-=4;
			 }
			 else if (this.xPosition<=2)
			 {
				 this.xPosition+=4;
			 }
			 else if(this.xPosition>=29)
			 {
				 this.xPosition-=4;
			 }
			 
			 
			 
		 }
		  if(t2.teamNr==2)
		 {
			  if((this.yPosition>2 && this.yPosition<39) && (this.xPosition>2 && this.yPosition<29))
				 {
					this.yPosition-=rand.nextInt(2);
					this.xPosition+=rand.nextInt(2);
				 }
			  else if (this.yPosition<=2)
				 {
					 this.yPosition+=4;
				 }
				 else if(this.yPosition>=39)
				 {
					 this.yPosition-=4;
				 }
				 else if (this.xPosition<=2)
				 {
					 this.xPosition+=4;
				 }
				 else if(this.xPosition>=29)
				 {
					 this.xPosition-=4;
				 }
		 }
		 
		 
		 
	 }
	
	 public int checkPosition(Court c) {

			if(c.coordinates[this.yPosition][this.xPosition]==1)
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
					this.moving(t1,t2);
					b.reclaimBall(t1, t2);
				}
				
			}
			else if(t1.teamNr==2)
				if(this.yPosition<20)
				{
					if(this.hasBall)
					{
						this.throwBall(t1,t2,c,b);
				
					}
					
				}
				else
				{
					this.moving(t1,t2);
					b.reclaimBall(t1, t2);
				}
			
			
		}

		@Override
		public void throwBall(Team t1 , Team t2 , Court c , Ball b) {
			if(t1.teamNr==1) 
			{
				if(this.checkPosition(c)==1)
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
				else if(this.checkPosition(c)==0) 
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
			
			 if(t2.teamNr==2) 
			{
				if(this.checkPosition(c)==1)
				{
					if(this.twoPointsThrow + rand.nextInt(6)>10)
					{
						t2.score+=2;
						t2.newWinAction();
						t1.newLooseAction();
					}
					else
					{
						b.rebound(this,t1);
					}
				}
				else if(this.checkPosition(c)==0) 
				{
					if(this.threePointsThorw+rand.nextInt(6)>10)
					{
						t2.score+=3;
						t2.newWinAction();
						t1.newLooseAction();
					}
					else
					{
						b.rebound(this,t1);
					}
				}
			}
		}

		public int getTwoPointsThrow() {
			return twoPointsThrow;
		}

		public void setTwoPointsThrow(int twoPointsThrow) {
			this.twoPointsThrow = twoPointsThrow;
		}

		public int getThreePointsThorw() {
			return threePointsThorw;
		}

		public void setThreePointsThorw(int threePointsThorw) {
			this.threePointsThorw = threePointsThorw;
		}

		public int getPass() {
			return pass;
		}

		public void setPass(int pass) {
			this.pass = pass;
		}

		public int getSteal() {
			return steal;
		}

		public void setSteal(int steal) {
			this.steal = steal;
		}

		public int getRebound() {
			return rebound;
		}

		public void setRebound(int rebound) {
			this.rebound = rebound;
		}

		public boolean isHasBall() {
			return hasBall;
		}

		public void setHasBall(boolean hasBall) {
			this.hasBall = hasBall;
		}
		public int getxPosition() {
			return xPosition;
		}

		public void setxPosition(int xPosition) {
			this.xPosition = xPosition;
		}

		public int getyPosition() {
			return yPosition;
		}

		public void setyPosition(int yPosition) {
			this.yPosition = yPosition;
		}
	

}
