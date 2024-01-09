abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter target) {
        return target.isVulnerable() ? 10 : 6;
    }
}

class Wizard extends Fighter {

    private boolean spell = false;
    // retorna true se não tiver preparado spell
    @Override
    boolean isVulnerable() {
        return !this.spell;
    }

    @Override
    int damagePoints(Fighter fighter) {
        return spell ? 12 : 3;
    }

    void prepareSpell() {
        this.spell = true;
    }

     @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

}
