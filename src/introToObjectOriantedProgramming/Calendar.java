package introToObjectOriantedProgramming;

public class Calendar {

	public static Boolean isWeekDay(int dayNumber) {
		switch (dayNumber) {
		case 0:
		case 6:
			return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;
		default:
			return false;

		}
	}

}
