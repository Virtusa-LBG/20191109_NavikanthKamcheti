package conversion.numberstowords;

import junit.framework.TestCase;

public class ConvertNumbersToWordsTest extends TestCase{

	public void testSingleDigit(){
		int singleDigitTest = 4;
		ConvertNumbersToWords inst = new ConvertNumbersToWords();
		inst.convertNumberToWord(singleDigitTest);
	}
	
	public void testDoubleDigit(){
		int doubleDigitTest = 21;
		ConvertNumbersToWords inst = new ConvertNumbersToWords();
		inst.convertNumberToWord(doubleDigitTest);
	}

	public void testTripleDigit(){
		int tripleDigitTest = 323;
		ConvertNumbersToWords inst = new ConvertNumbersToWords();
		inst.convertNumberToWord(tripleDigitTest);
	}
	
	public void testFourDigit(){
		int fourDigitTest = 5642;
		ConvertNumbersToWords inst = new ConvertNumbersToWords();
		inst.convertNumberToWord(fourDigitTest);
	}
	
	public void testFiveDigit(){
		int fiveDigitTest = 76123;
		ConvertNumbersToWords inst = new ConvertNumbersToWords();
		inst.convertNumberToWord(fiveDigitTest);
	}
	
	public void testSixDigit(){
		int sixDigitTest = 869481;
		ConvertNumbersToWords inst = new ConvertNumbersToWords();
		inst.convertNumberToWord(sixDigitTest);
	}
	
	public void testSevenDigit(){
		int sevenDigitTest = 7694578;
		ConvertNumbersToWords inst = new ConvertNumbersToWords();
		inst.convertNumberToWord(sevenDigitTest);
	}
	
	public void testFinalInputInQuestion(){
		int finalTest = 56945781;
		ConvertNumbersToWords inst = new ConvertNumbersToWords();
		inst.convertNumberToWord(finalTest);
	}
	
}
