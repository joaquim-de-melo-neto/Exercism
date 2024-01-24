public class GameMaster {

    public String describe(Character c){
        return String.format("You're a level %d %s with %d hit points.",
                            c.getLevel(), c.getCharacterClass(), c.getHitPoints());
    }

    public String describe(Destination d){
        return String.format("You've arrived at %s, which has %d inhabitants.",
                            d.getName(), d.getInhabitants());
    }

    public String describe(TravelMethod t){
        return t.equals(TravelMethod.WALKING) ?
            "You're traveling to your destination by walking." :
            "You're traveling to your destination on horseback.";
                            
    }

    public String describe(Character c, Destination d, TravelMethod t){
         return String.join(" ", this.describe(c), this.describe(t), this.describe(d)); 
     }
    
     public String describe(Character c, Destination d){
         return this.describe(c, d, TravelMethod.WALKING);
     }
    
}





public class Character {
    private String characterClass;
    private int level;
    private int hitPoints;

    public String getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(String characterClass) {
        this.characterClass = characterClass;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }
}





public class Destination {
    private String name;
    private int inhabitants;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInhabitants() {
        return inhabitants;
    }

    public void setInhabitants(int inhabitants) {
        this.inhabitants = inhabitants;
    }
}





public enum TravelMethod {
    WALKING,
    HORSEBACK
}
