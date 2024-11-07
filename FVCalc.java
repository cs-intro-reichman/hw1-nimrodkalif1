import java.text.DecimalFormat;

public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double yearlyInterest = Double.parseDouble(args[1]);
		int yearsOfInvestment = Integer.parseInt(args[2]);

		double futureValue = currentValue * Math.pow((1 + yearlyInterest/100), yearsOfInvestment);
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println();
		String result = String.format("After %d years, a $%d saved at %s%% will yield $%d", yearsOfInvestment, currentValue, df.format(yearlyInterest), (int)futureValue);
		System.out.println(result);
	}
}