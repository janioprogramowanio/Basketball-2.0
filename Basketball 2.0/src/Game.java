import java.util.Timer;
import java.util.TimerTask;

public class Game {

	public static void main(String[] args) {
		Court c = new Court();
		Team t1 = new Team(1);
		Team t2=new Team(2);
		Ball b = new Ball();
		t1.spawn();
		t2.spawn();
		t1.p1.hasBall=true;

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				
				t1.p1.moving();
				t1.p2.moving();
				t1.p3.moving();
				t1.p4.moving();
				t1.p5.moving();
				
				t2.p1.moving();
				t2.p2.moving();
				t2.p3.moving();
				t2.p4.moving();
				t2.p5.moving();
				
				b.reclaimBall(t1, t2);
				
				t1.p1.readyToThrow(t1, t2, c, b);
				t1.p2.readyToThrow(t1, t2, c, b);
				t1.p3.readyToThrow(t1, t2, c, b);
				t1.p4.readyToThrow(t1, t2, c, b);
				t1.p5.readyToThrow(t1, t2, c, b);
				
				t2.p1.readyToThrow(t1, t2, c, b);
				t2.p2.readyToThrow(t1, t2, c, b);
				t2.p3.readyToThrow(t1, t2, c, b);
				t2.p4.readyToThrow(t1, t2, c, b);
				t2.p5.readyToThrow(t1, t2, c, b);		
				System.out.println("Team 1:" + t1.score);
				System.out.println("Player 1:" + t1.p1.hasBall);
				System.out.println("Player 2:" + t1.p2.hasBall);
				System.out.println("Player 3:" + t1.p3.hasBall);
				System.out.println("Player 4:" + t1.p4.hasBall);
				System.out.println("Player 5:" + t1.p5.hasBall);

				System.out.println("Team 2:" + t2.score);
				System.out.println("Player 1:" + t2.p1.hasBall);
				System.out.println("Player 2:" + t2.p2.hasBall);
				System.out.println("Player 3:" + t2.p3.hasBall);
				System.out.println("Player 4:" + t2.p4.hasBall);
				System.out.println("Player 5:" + t2.p5.hasBall);


				

			}
		};
		
		timer.scheduleAtFixedRate(task, 0,1000);
	}

	
}
