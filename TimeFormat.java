// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt(args[0].split(":")[0]);

		String afterMidday = "";
		if (hours != hours % 12) {
			afterMidday = "PM";
			hours %= 12;
		} else {
			afterMidday = "AM";
		}

		int minutes = Integer.parseInt(args[0].split(":")[1]);
		System.out.println(hours + ":" + minutes + " " + afterMidday);

	}
}