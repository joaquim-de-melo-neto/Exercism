class SpaceAge {
    private double seconds;
    
    SpaceAge(double seconds) {
        this.seconds= seconds;
    }

    double getSeconds() {
        return this.seconds;
    }

    double onEarth() {
        return this.getSeconds() / 31557600d; 
    }

    double onMercury() {
        return this.onEarth() / 0.2408467D;
    }

    double onVenus() {
        return this.onEarth() / 0.61519726D;
    }

    double onMars() {
        return this.onEarth() / 1.8808158D;
    }

    double onJupiter() {
        return this.onEarth() / 11.862615D;
    }

    double onSaturn() {
        return this.onEarth() / 29.447498D;    
    }

    double onUranus() {
        return this.onEarth() / 84.016846;
    }

    double onNeptune() {
        return this.onEarth() / 164.79132 ;
    }

}
