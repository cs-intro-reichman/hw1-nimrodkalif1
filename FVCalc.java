public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double yearlyInterest = Double.parseDouble(args[1]);
		int yearsOfInvestment = Integer.parseInt(args[2]);

		double futureValue = currentValue * Math.pow((1 + yearlyInterest/100), yearsOfInvestment);
		String result = String.format("After %d years, a $%d saved at %1f%% will yield $%d", yearsOfInvestment, currentValue, yearlyInterest, (int)futureValue);
		System.out.println(result);
	}
}