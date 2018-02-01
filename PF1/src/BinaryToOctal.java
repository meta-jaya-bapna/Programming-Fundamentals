/**
 * Class name-BinaryToOctal
 * 
 * @version 1.0
 * @author Jaya Bapna
 */

/* A class to convert a given binary number to its
 * equivalent octal number.
 */
public class BinaryToOctal {
	/*
	 * Below function converts the binary number to its equivalent octal number.
	 * The function works by first converting the binary number to its equivalent
	 * decimal number.
	 * Then the decimal number is converted to equivalent octal number.
	 */
	int convertBinaryToOctal(long binary)
	{
		System.out.println("binary-input : "+binary);
		int decimal=0,octal=0;                                  //to store the decimal number and octal number
		int iterator=0; 										//Iterator for loops
		while(binary!=0)
		{
			decimal+=(int) ((binary%10)*Math.pow(2, iterator)); //Converts binary number to equivalent decimal number
			iterator++;
			binary=binary/10;
		}
		System.out.println("decimal-output : "+decimal);
		iterator=1;
		while(decimal!=0)
		{
				octal+=(decimal%8)*iterator;					//Converts decimal number to equivalent octal number
				decimal=decimal/8;
				iterator*=10;
		}
		System.out.println("octal-output : "+octal);
		return octal;											//returns final octal number
	}
}
