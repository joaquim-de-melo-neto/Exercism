import java.util.Arrays;
class BirdWatcher {
    private int[] birdsPerDay;
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }
    // retorna quantos passaros foram avistados nos últimos dias
    public int[] getLastWeek() {
        return birdsPerDay;
    }
    // retorna a quantidade de passaros vistos no ultimo dia
    public int getToday() {
        return birdsPerDay.length == 0 ? 0 : birdsPerDay[birdsPerDay.length -1];
    }
    // incrementa em um o ultimo dia
    public int incrementTodaysCount() {
        int idx = birdsPerDay.length - 1;
        birdsPerDay[idx] = ++birdsPerDay[idx];
        return birdsPerDay[idx];
    }
    // verifica se algum dia da semana nao foram vistos passaros
    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).filter(a -> a == 0).findAny().isPresent();
    }
    // retorna a soma dos passaros vistos nos primeiros numberOfDays 
    public int getCountForFirstDays(int numberOfDays) {
       return Arrays.stream(birdsPerDay).limit(numberOfDays).sum();
    }
    // conta quantos dias foram vistos mais de 4 passaros
    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay).filter(a -> a >= 5).count();
    }
}
