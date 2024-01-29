class ArmstrongNumbers {
    static int countDigits(int number){
        int qtd = 1;
        while((number /= 10) != 0) qtd++;
        return qtd;
    }
    // verifica se é um número de Armstrong
    boolean isArmstrongNumber(int number) {
        if(number == 0) return true;
        int qtd = countDigits(number);
        return number == String.valueOf(number)
            .codePoints() // ou chars()
            .parallel() // usar mais de uma thread
            .map(i ->(int)Math.pow(Character.getNumericValue(i),qtd))
            .sum();

    }

}
