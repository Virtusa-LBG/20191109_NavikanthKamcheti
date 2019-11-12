package conversion.numberstowords;

public class ConvertNumbersToWords {
	HandleThreeDigitNumber handleThreeDigitNumber;
	public ConvertNumbersToWords() {
		handleThreeDigitNumber = new HandleThreeDigitNumber();
	}
	/*This method validates the invalid/no-processing required conditions,
	  if it's a valid number for processing, proceeds further*/
	public void convertNumberToWord(int input) {
		if(input <0){
			throw new RuntimeException("The Program cannot handle negative numbers");
		}
		if(input == 0){
			System.out.println("Zero");
		}
		int length = String.valueOf(input).length();
		if (length > 9) {
			throw new RuntimeException("The Program cannot handle that large of a number");
		} 
		handleThreeDigitParts(input);
	}

	 /*This method Handles the number by handling 3-digit part of the number at once(Eg:
	 9876 will be used as 9 as one part & 876 as another part, 9876543 will be
	 used as 9 as first part, 876 as second part, 543 as third part)*/
	public void handleThreeDigitParts(int input) {
		int length = String.valueOf(input).length();
		if (length > 9) {
			throw new RuntimeException("The Program cannot handle that large of a number");
		} else if (length > 6) {
			int firstPart = Math.floorDiv(input, 1000000);
			handleThreeDigitParts(firstPart);

			String MILLIONS_REP = "million ";
			System.out.print(MILLIONS_REP);

			int nextPart = Math.floorMod(input, 1000000);
			handleThreeDigitParts(nextPart);
		} else if (length > 3 && length <= 6) {
			int firstPart = Math.floorDiv(input, 1000);
			handleThreeDigitParts(firstPart);

			String THOUSANDS_REP = "thousand ";
			System.out.print(THOUSANDS_REP);

			int secondPart = Math.floorMod(input, 1000);
			handleThreeDigitParts(secondPart);
		} else {
			handleThreeDigitNumber.handleThreeDigitNumber(input);
		}
	}
}
