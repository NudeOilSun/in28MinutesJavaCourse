package introToObjectOriantedProgramming;

public class MotorbikeRunner {

	public static void main(String[] args) {
		Motorbike ducati = new Motorbike(100);
		Motorbike honda = new Motorbike(200);
		Motorbike susaki = new Motorbike();

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		// System.out.println(ducati.getSpeed());

		// honda.setSpeed(50);
		// System.out.println(honda.getSpeed());

	}

}
