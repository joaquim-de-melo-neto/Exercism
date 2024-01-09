class NeedForSpeed {

    private int speed;
    private int batteryDrain;
    private int battery = 100;
    private int distanceDriven;
    // construtor
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    // checa se há bateria suficiente para continuar
    public boolean batteryDrained() {
        return this.battery < this.batteryDrain;
    }
    // retorna a distância percorrida pelo carro
    public int distanceDriven() {
        return this.distanceDriven;
    }
    // atualiza o estado da bateria e a distância perccorrida pelo carro
    public void drive() {
        if( !this.batteryDrained()){
            this.distanceDriven += this.speed;
            this.battery -= this.batteryDrain;
        }    
    }
    // retorna um carro muito bom
    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
    // getters
    public int getSpeed(){
        return this.speed;
    }
    
    public int getBatteryDrain(){
        return this.batteryDrain;
    }
}
// classe referente a uma pista de corrida
class RaceTrack {
    // distancia da pista
    int distance;
    // construtor
    RaceTrack(int distance) {
        this.distance = distance;
    }
    // checa se um carro pode finalizar uma pista
    public boolean tryFinishTrack(NeedForSpeed car) {
        int ciclos = 100 / car.getBatteryDrain();
        int maxDistance = ciclos * car.getSpeed();

        return this.distance <= maxDistance;
    }
}
