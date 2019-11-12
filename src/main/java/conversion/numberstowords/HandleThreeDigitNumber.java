package conversion.numberstowords;

public class HandleThreeDigitNumber {

	static String HUNDREDS_REP = "hundred";
	static String SPACE_SEPARATOR = " ";
	static String AND_SEPARATOR = "and";

	/**This method delegates a 3 digit number to appropriate methods, like hundreds parser, ten's parser or units parser
	 * @param threeDigitNumber
	 */
	public void handleThreeDigitNumber(int threeDigitNumber) {
		int length = String.valueOf(threeDigitNumber).length();
		if (length == 3) {
			handleHundredsPlaces(threeDigitNumber);
		} else if (length == 2) {
			handleTensPlaces(threeDigitNumber);
		} else if (length == 1) {
			handleUnitPlaces(threeDigitNumber);
		}
	}

	/**This method handles 3 digit numbers
	 * @param input
	 */
	public void handleHundredsPlaces(int input) {
		if (Math.floorMod(input, 100) == 0) {
			int numberOfHundreds = Math.floorDiv(input, 100);
			handleUnitPlaces(numberOfHundreds);

			System.out.print(HUNDREDS_REP);

		} else {
			int numberOfHundreds = Math.floorDiv(input, 100);
			handleUnitPlaces(numberOfHundreds);

			System.out.print(HUNDREDS_REP);
			System.out.print(SPACE_SEPARATOR);
			System.out.print(AND_SEPARATOR);
			System.out.print(SPACE_SEPARATOR);

			int numberAfterHundreds = Math.floorMod(input, 100);
			handleTensPlaces(numberAfterHundreds);
		}
	}

	/**
	 * This method handles the 2 digit numbers
	 * 
	 * @param input
	 */
	public void handleTensPlaces(int input) {
		if (input <= 20) {
			handleTensPlacesBelowOrEqualsTwenty(input);
		} else if (input > 20) {
			handleTensPlacesAboveTwenty(input);
		}
	}

	/**
	 * This method handles the 2 digit numbers above 20
	 * 
	 * @param input
	 */
	public void handleTensPlacesAboveTwenty(int input) {
		String output = "";
		int tensDigit = Math.floorDiv(input, 10);
		switch (tensDigit) {
		case 2:
			output = "twenty";
			break;
		case 3:
			output = "thirty";
			break;
		case 4:
			output = "forty";
			break;
		case 5:
			output = "fifty";
			break;
		case 6:
			output = "sixty";
			break;
		case 7:
			output = "seventy";
			break;
		case 8:
			output = "eighty";
			break;
		case 9:
			output = "ninty";
			break;
		default:
			break;
		}
		System.out.print(output);
		System.out.print(SPACE_SEPARATOR);
		handleUnitPlaces(Math.floorMod(input, 10));
	}

	/**
	 * This method handles the digits at tens places
	 * 
	 * @param tensDigit
	 */
	public void handleTensPlacesBelowOrEqualsTwenty(int tensDigit) {
		if (tensDigit < 10) {
			handleUnitPlaces(Math.floorMod(tensDigit, 10));
		} else {
			String output = "";
			switch (tensDigit) {
			case 10:
				output = "ten";
				break;
			case 11:
				output = "eleven";
				break;
			case 12:
				output = "twelve";
				break;
			case 13:
				output = "thirteen";
				break;
			case 14:
				output = "fourteen";
				break;
			case 15:
				output = "fifteen";
				break;
			case 16:
				output = "sixteen";
				break;
			case 17:
				output = "seventeen";
				break;
			case 18:
				output = "eighteen";
				break;
			case 19:
				output = "ninteen";
				break;
			case 20:
				output = "twenty";
				break;
			default:
				break;
			}
			System.out.print(output);
			System.out.print(SPACE_SEPARATOR);
		}
	}

	/**
	 * This method handles the digits at unit's places
	 * 
	 * @param unitDigit
	 */
	public void handleUnitPlaces(int unitDigit) {
		String output = "";
		switch (unitDigit) {
		case 1:
			output = "one";
			break;
		case 2:
			output = "two";
			break;
		case 3:
			output = "three";
			break;
		case 4:
			output = "four";
			break;
		case 5:
			output = "five";
			break;
		case 6:
			output = "six";
			break;
		case 7:
			output = "seven";
			break;
		case 8:
			output = "eight";
			break;
		case 9:
			output = "nine";
			break;
		case 10:
			output = "ten";
			break;
		default:
			break;
		}

		System.out.print(output);
		System.out.print(SPACE_SEPARATOR);
	}
}
