// Write a function that takes an integer as input, and returns the number of bits that are equal to one in the binary representation of 
// that number. You can guarantee that input is non-negative.

//Example: The binary representation of 1234 is 10011010010, so the function should return 5 in this case

import java.util.stream.*;
public class BitCounting {

	public static int countBits(int n){
		String binary = Integer.toBinaryString(n);
    return (int)binary.chars().filter(c -> c == 49).count(); // 49 é a representação decimal do 1 na tabela ASCII
	}
	
}
