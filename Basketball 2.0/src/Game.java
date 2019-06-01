import java.util.Timer;
import java.util.TimerTask;

public class Game {

	public static void main(String[] args) {
		Court court = new Court();
		Team t1 = new Team(1);
		Team t2=new Team(2);
		Ball ball = new Ball();
		t1.spawn();
		t2.spawn();
		

		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			
			@Override
			public void run() {
				t1.p1.moving();
				t1.p2.moving();
				t1.p3.moving();
				t1.p4.moving();
				t1.p5.moving();
				
				t1.p1.checkPosition(court);
				t1.p2.checkPosition(court);
				t1.p3.checkPosition(court);
				t1.p4.checkPosition(court);
				t1.p5.checkPosition(court);
				t1.p1.hasBall=true;
				ball.pass(t1);
				
				System.out.println("Player 1: " + t1.p1.hasBall);
				System.out.println("Player 2: " + t1.p2.hasBall);
				System.out.println("Player 3: " + t1.p3.hasBall);
				System.out.println("Player 4: " + t1.p4.hasBall);
				System.out.println("Player 5: " + t1.p5.hasBall);
				System.out.println();

				
			}
		};
		
		timer.scheduleAtFixedRate(task, 0,1000);
	}

}
