import java.util.Random;

public class Player {
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
			 yPosition+=rand.nextInt(5)-2;
		 }
		 if(yPosition<=6)
		 {
			 yPosition+=rand.nextInt(3);
		 }
		 if(yPosition>=34)
		 {
			 yPosition-=rand.nextInt(3);
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

	

}
