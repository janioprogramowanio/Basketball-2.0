import java.util.Random;

public class Team {
	
	Random rand = new Random();
	int teamNr;
	int score=0;
	Player p1=new Player();
	Player p2=new Player();
	Player p3=new Player();
	Player p4=new Player();
	Player p5=new Player();
	
	Team(int teamNr)
	{
		this.teamNr=teamNr;
	}
	
	public void spawn()
	{
		if(teamNr==1) {
		p1.xPosition=rand.nextInt(30);
		p2.xPosition=rand.nextInt(30);
		p3.xPosition=rand.nextInt(30);
		p4.xPosition=rand.nextInt(30);
		p5.xPosition=rand.nextInt(30);
		
		p1.yPosition=rand.nextInt(20);
		p2.yPosition=rand.nextInt(20);
		p3.yPosition=rand.nextInt(20);
		p4.yPosition=rand.nextInt(20);
		p5.yPosition=rand.nextInt(20);
		}
		else
		{
		p1.xPosition=rand.nextInt(30);
		p2.xPosition=rand.nextInt(30);
		p3.xPosition=rand.nextInt(30);
		p4.xPosition=rand.nextInt(30);
		p5.xPosition=rand.nextInt(30);
		
		p1.yPosition=rand.nextInt(20)+20;
		p2.yPosition=rand.nextInt(20)+20;
		p3.yPosition=rand.nextInt(20)+20;
		p4.yPosition=rand.nextInt(20)+20;
		p5.yPosition=rand.nextInt(20)+20;
		}
	}
	public void newWinAction()
	{
		spawn();
		p1.hasBall=false;
		p2.hasBall=false;
		p3.hasBall=false;
		p4.hasBall=false;
		p5.hasBall=false;

		
	}
	
	public void newLooseAction()
	{
		spawn();
		p1.hasBall=true;
		p2.hasBall=false;
		p3.hasBall=false;
		p4.hasBall=false;
		p5.hasBall=false;
	}
}

