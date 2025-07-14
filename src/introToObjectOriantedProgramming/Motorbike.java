package introToObjectOriantedProgramming;

public class Motorbike {

	private int speed;

	public Motorbike() {
		this(5);
	}

	public Motorbike(int speed) {
		this.speed = speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public int getSpeed() {
		System.out.println(this.speed);
		return this.speed;
	}

	public void increaseSpeed(int speed) {
		setSpeed(this.speed + speed);
	}

	public void decreaseSpeed(int speed) {
		setSpeed(this.speed - speed);
	}

	void start() {
		System.out.println("Bike Started");
	}

}
