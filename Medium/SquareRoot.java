public class SquareRoot {
    public int squareRoot(int radicand) {
        int number = 0;
        while(true){
            if(radicand == number * number) return number;
            number++;
        }
    }
}
