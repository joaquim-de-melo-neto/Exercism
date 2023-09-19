public class ElonsToyCar {
    private long distanceDriven = 0;
    private int batteryCharge = 100;
    
    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }
    public String distanceDisplay() {
        return String.format("Driven %s meters", distanceDriven);
    }
    public String batteryDisplay() {
        if(batteryCharge == 0) return "Battery empty";
        return ("Battery at " + batteryCharge + "%");
    }
    public void drive() {
        if(batteryCharge == 0) this.batteryDisplay();
        else{
            distanceDriven += 20;
            batteryCharge -= 1;
        }
    }
}
