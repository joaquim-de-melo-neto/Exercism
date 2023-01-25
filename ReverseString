// Iteration 1
class ReverseString {
    String reverse(String input) {
        String output;
        char temp;
        char[] array = input.toCharArray();
        int len = input.length();
        for(int i=0;i<len/2;i++){
            temp = array[i];
            array[i] = array[len-i-1];
            array[len-i-1] = temp;
        }
        output = String.copyValueOf(array);
        return output;
    }
}

// Iteration 2
class ReverseString {
    String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }
}
