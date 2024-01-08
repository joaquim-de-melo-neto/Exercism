import java.util.Random;

class CaptainsLog {

    private static final char[] PLANET_CLASSES = new char[]{'D', 'H', 'J', 'K', 'L', 'M', 'N', 'R', 'T', 'Y'};

    private Random random;

    CaptainsLog(Random random) {
        this.random = random;
    }
    // retorna uma classe aleatória de planeta
    char randomPlanetClass() {
        return PLANET_CLASSES[random.nextInt(PLANET_CLASSES.length)];
    }
    // retorna um nome de nave no formato NCC-<n>, onde <n> é um número aleatório entre [1000,9999] 
    String randomShipRegistryNumber() {
        return String.format("NCC-%d", 1000 + random.nextInt(9000));
    }
    // retorna um double entre [41_000, 42_000]
    double randomStardate() {
        return 41_000 + 1_000 * random.nextDouble();
    }
}
