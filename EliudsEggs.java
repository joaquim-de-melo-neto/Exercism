import java.util.stream.IntStream;

public class EliudsEggs {
    public int eggCount(int number) {
        // representação binária do number
        String binary = decimalToBinary(number); // devolve a representação binária do number
        return countOneBits(binary);
    }
    // devolve a representação binária de um inteiro
    static String decimalToBinary(int number){
        StringBuilder binary = new StringBuilder();
        int dividendo = number;
        while(dividendo > 0){
            binary.append(dividendo % 2);
            dividendo /= 2;
        }

        return binary.reverse().toString();
    }
    // conta as ocorrências do caractere '1' em uma String
    static int countOneBits(String binary){
        return (int)binary
                .chars()
                .filter(bit -> bit == 49)
                .count();
            
    }
}
