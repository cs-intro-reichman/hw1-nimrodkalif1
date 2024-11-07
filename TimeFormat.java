// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt(args[0].split(":")[0]);
		hours %= 12;
		int minutes = Integer.parseInt(args[0].split(":")[1]);
		System.out.println(hours + ":" + minutes);
	}
}