public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		int yearlyInterest = Integer.parseInt(args[1]);
		int yearsOfInvestment = Integer.parseInt(args[2]);

		double futureValue = currentValue * Math.pow((1 + (double)yearlyInterest/100), yearsOfInvestment);
		String result = String.format("After %d years, $%d saved at %d%% interest will yield $%d", yearsOfInvestment, currentValue, yearlyInterest, (int)futureValue);
		System.out.println(result);
	}
}